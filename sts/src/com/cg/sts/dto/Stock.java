package com.cg.sts.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="stock_master")
public class Stock {

	@Id
	@Column(name="stock_code")
	Integer stock_code;
	
	@Column(name="stock")
	String stock;
	@Column(name="quote")	
	Double quote;
	
	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public Stock(Integer stock_code, String stock, Double quote) {
		super();
		this.stock_code = stock_code;
		this.stock = stock;
		this.quote = quote;
	}

	public Integer getStock_code() {
		return stock_code;
	}

	public void setStock_code(Integer stock_code) {
		this.stock_code = stock_code;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public Double getQuote() {
		return quote;
	}

	public void setQuote(Double quote) {
		this.quote = quote;
	}

	@Override
	public String toString() {
		return "Stock [stock_code=" + stock_code + ", stock=" + stock
				+ ", quote=" + quote + "]";
	}
	
	
}
