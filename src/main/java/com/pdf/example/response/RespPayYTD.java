package com.pdf.example.response;

public class RespPayYTD {

	private Double amount;
	private String currencyCode;
	
	public RespPayYTD (){
		
	}
	public RespPayYTD(Double amount, String currencyCode ) {
		this.amount = amount;
		this.currencyCode = currencyCode;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
}
