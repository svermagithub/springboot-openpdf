package com.pdf.example.response;

public class RespPayDistributions {
	public RespDepositAmount depositAmount;
    public RespDepositAccount depositAccount;
	public RespDepositAmount getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(RespDepositAmount depositAmount) {
		this.depositAmount = depositAmount;
	}
	public RespDepositAccount getDepositAccount() {
		return depositAccount;
	}
	public void setDepositAccount(RespDepositAccount depositAccount) {
		this.depositAccount = depositAccount;
	}
}
