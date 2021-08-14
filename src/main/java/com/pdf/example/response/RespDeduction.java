package com.pdf.example.response;

public class RespDeduction {

	public RespDeductionCode deductionCode;
    public RespDeductionAmount deductionAmount;
	public RespDeductionCode getDeductionCode() {
		return deductionCode;
	}
	public void setDeductionCode(RespDeductionCode deductionCode) {
		this.deductionCode = deductionCode;
	}
	public RespDeductionAmount getDeductionAmount() {
		return deductionAmount;
	}
	public void setDeductionAmount(RespDeductionAmount deductionAmount) {
		this.deductionAmount = deductionAmount;
	}
}
