package com.pdf.example.response;

public class DepositAccount {

	private int routingTransitID;
	private String accountNumber;
	private String accountTypeCode;
	
	public int getRoutingTransitID() {
		return routingTransitID;
	}
	public void setRoutingTransitID(int routingTransitID) {
		this.routingTransitID = routingTransitID;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountTypeCode() {
		return accountTypeCode;
	}
	public void setAccountTypeCode(String accountTypeCode) {
		this.accountTypeCode = accountTypeCode;
	}
}
