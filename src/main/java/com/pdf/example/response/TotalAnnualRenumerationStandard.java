package com.pdf.example.response;

public class TotalAnnualRenumerationStandard extends TotalAnnualRenumeration{

	private Double amount;
	private String currencyCode;
	
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
