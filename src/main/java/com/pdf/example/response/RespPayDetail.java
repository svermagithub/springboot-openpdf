package com.pdf.example.response;

public class RespPayDetail {

	private Double amount;
	private String currencyCode;
	
	public RespPayDetail (){
		
	}
	public RespPayDetail(Double amount, String currencyCode ) {
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
