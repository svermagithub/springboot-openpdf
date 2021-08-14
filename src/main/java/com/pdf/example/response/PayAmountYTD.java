package com.pdf.example.response;

public class PayAmountYTD {

	private RespPayYTD grossPayYTD;
	private RespPayYTD basePayYTD;
	private RespPayYTD overtimePayYTD;
	private RespPayYTD bonusPayYTD;
	private RespPayYTD otherPayYTD;
	
	public RespPayYTD getGrossPayYTD() {
		return grossPayYTD;
	}
	public void setGrossPayYTD(RespPayYTD grossPayYTD) {
		this.grossPayYTD = grossPayYTD;
	}
	public RespPayYTD getBasePayYTD() {
		return basePayYTD;
	}
	public void setBasePayYTD(RespPayYTD basePayYTD) {
		this.basePayYTD = basePayYTD;
	}
	public RespPayYTD getOvertimePayYTD() {
		return overtimePayYTD;
	}
	public void setOvertimePayYTD(RespPayYTD overtimePayYTD) {
		this.overtimePayYTD = overtimePayYTD;
	}
	public RespPayYTD getBonusPayYTD() {
		return bonusPayYTD;
	}
	public void setBonusPayYTD(RespPayYTD bonusPayYTD) {
		this.bonusPayYTD = bonusPayYTD;
	}
	public RespPayYTD getOtherPayYTD() {
		return otherPayYTD;
	}
	public void setOtherPayYTD(RespPayYTD otherPayYTD) {
		this.otherPayYTD = otherPayYTD;
	}
}
