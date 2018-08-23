package com.spring.boot.rest.example.demo.aplication;

import java.math.BigDecimal;

public class Coin {
	private String id;
	private String name;
	private String symbol;
	private String rank;
	private BigDecimal price_usd;
	private String price_btc;
	private BigDecimal h24h_volume_usd;
	private BigDecimal market_cap_usd;
	private BigDecimal available_supply;
	private BigDecimal total_supply;
	private String max_supply;
	private BigDecimal percent_change_1h;
	private BigDecimal percent_change_24h;
	private BigDecimal percent_change_7d;
	private String last_updated;
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
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

	public BigDecimal getPrice_usd() {
		return price_usd;
	}

	public void setPrice_usd(BigDecimal price_usd) {
		this.price_usd = price_usd;
	}

	public String getPrice_btc() {
		return price_btc;
	}
	public void setPrice_btc(String price_btc) {
		this.price_btc = price_btc;
	}
	public String getMax_supply() {
		return max_supply;
	}
	public void setMax_supply(String max_supply) {
		this.max_supply = max_supply;
	}
	
	public BigDecimal getPercent_change_1h() {
		return percent_change_1h;
	}
	public void setPercent_change_1h(BigDecimal percent_change_1h) {
		this.percent_change_1h = percent_change_1h;
	}

	public BigDecimal getH24h_volume_usd() {
		return h24h_volume_usd;
	}

	public void setH24h_volume_usd(BigDecimal h24h_volume_usd) {
		this.h24h_volume_usd = h24h_volume_usd;
	}

	public BigDecimal getMarket_cap_usd() {
		return market_cap_usd;
	}

	public void setMarket_cap_usd(BigDecimal market_cap_usd) {
		this.market_cap_usd = market_cap_usd;
	}

	public BigDecimal getAvailable_supply() {
		return available_supply;
	}

	public void setAvailable_supply(BigDecimal available_supply) {
		this.available_supply = available_supply;
	}

	public BigDecimal getTotal_supply() {
		return total_supply;
	}

	public void setTotal_supply(BigDecimal total_supply) {
		this.total_supply = total_supply;
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

	public String getLast_updated() {
		return last_updated;
	}
	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}
	
	
}
