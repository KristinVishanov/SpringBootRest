package com.spring.boot.rest.example.demo.utils;



public class AppUtils {

    public static String addWhiteSpace(int firstCountSpaces, int lastCountSpaces, String str) {
        StringBuilder str1 = new StringBuilder();

        for(int j=0;j<firstCountSpaces;j++)
        {
            str1.append(" ");
        }

        str1.append(str);
        int incomeStringLenght = str.length();
        int whiteSpaceLenght = lastCountSpaces - incomeStringLenght;
        for(int j=0;j<whiteSpaceLenght;j++)
        {
            str1.append(" ");
        }
        return str1.toString();

    }
}