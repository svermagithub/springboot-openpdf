package com.pdf.example.response;

public class RespDepositAccount {
	public String routingTransitID;
    public String accountNumber;
    public String accountTypeCode;
	public String getRoutingTransitID() {
		return routingTransitID;
	}
	public void setRoutingTransitID(String routingTransitID) {
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
