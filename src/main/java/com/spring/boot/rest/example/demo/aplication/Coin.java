package com.spring.boot.rest.example.demo.aplication;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Coin {
    private String id;
    private String name;
    private String symbol;
    private String slug;
    private BigDecimal circulating_supply;
    private BigDecimal total_supply;
    private BigDecimal max_supply;
    private String date_added;
    private BigInteger num_market_pairs;
    private int cmc_rank;
    private String last_updated;

    private BigDecimal price;
    private BigDecimal volume_24h;
    private BigDecimal percent_change_1h;
    private BigDecimal percent_change_24h;
    private BigDecimal percent_change_7d;
    private BigDecimal market_cap;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public BigDecimal getCirculating_supply() {
        return circulating_supply;
    }

    public void setCirculating_supply(BigDecimal circulating_supply) {
        this.circulating_supply = circulating_supply;
    }

    public BigDecimal getTotal_supply() {
        return total_supply;
    }

    public void setTotal_supply(BigDecimal total_supply) {
        this.total_supply = total_supply;
    }

    public BigDecimal getMax_supply() {
        return max_supply;
    }

    public void setMax_supply(BigDecimal max_supply) {
        this.max_supply = max_supply;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public BigInteger getNum_market_pairs() {
        return num_market_pairs;
    }

    public void setNum_market_pairs(BigInteger num_market_pairs) {
        this.num_market_pairs = num_market_pairs;
    }

    public int getCmc_rank() {
        return cmc_rank;
    }

    public void setCmc_rank(int cmc_rank) {
        this.cmc_rank = cmc_rank;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVolume_24h() {
        return volume_24h;
    }

    public void setVolume_24h(BigDecimal volume_24h) {
        this.volume_24h = volume_24h;
    }

    public BigDecimal getPercent_change_1h() {
        return percent_change_1h;
    }

    public void setPercent_change_1h(BigDecimal percent_change_1h) {
        this.percent_change_1h = percent_change_1h;
    }

    public BigDecimal getPercent_change_24h() {
        return percent_change_24h;
    }

    public void setPercent_change_24h(BigDecimal percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }

    public BigDecimal getPercent_change_7d() {
        return percent_change_7d;
    }

    public void setPercent_change_7d(BigDecimal percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }

    public BigDecimal getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(BigDecimal market_cap) {
        this.market_cap = market_cap;
    }
}
