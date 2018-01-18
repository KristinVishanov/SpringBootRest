package com.spring.boot.rest.example.demo.security;

import com.spring.boot.rest.example.demo.aplication.Constants;
import com.spring.boot.rest.example.demo.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.http.HttpHeaders;

import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

public class TokenAuthenticationService {

    static String issueToken(User user) {
        String jwtToken = null;
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(Constants._JWT_PASS);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
        jwtToken = Jwts.builder()
                .setIssuer("appName")
                .setSubject(user.getFirstName() + "/" + user.getLastName())
                .claim("userId", user.getId())
                .claim("userFirstName", user.getFirstName())
                .claim("email", user.getEmail())
//                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 10))
                .setExpiration(new Date(2208981600000L))
                .signWith(signatureAlgorithm, signingKey)
                .compact();
        return jwtToken;
    }

    static Claims validateToken(HttpServletRequest requestContext) {

        // Get the HTTP Authorization header from the request
        String authorizationHeader =
                requestContext.getHeader(HttpHeaders.AUTHORIZATION);

        // Check if the HTTP Authorization header is present and formatted correctly
        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
            return null;
        }

        // Extract the token from the HTTP Authorization header
        String token = authorizationHeader.substring("Bearer ".length()).trim();

        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary(Constants._JWT_PASS))
                    .parseClaimsJws(token).getBody();
            // Check token expired
            if(claims.getExpiration().getTime() < System.currentTimeMillis()){
                return null;
            } else {
                return claims;
            }
        } catch (Exception e) {
            return null;
        }
    }
}
