package com.pdf.example.response;

public class RespPayAmount {

	private RespPayDetail grossPay;
	private RespPayDetail basePay;
	private RespPayDetail overTimePay;
	private RespPayDetail bonusPay;
	private RespPayDetail otherPay;
	
	public RespPayDetail getGrossPay() {
		return grossPay;
	}
	public void setGrossPay(RespPayDetail grossPay) {
		this.grossPay = grossPay;
	}
	public RespPayDetail getBasePay() {
		return basePay;
	}
	public void setBasePay(RespPayDetail basePay) {
		this.basePay = basePay;
	}
	public RespPayDetail getOverTimePay() {
		return overTimePay;
	}
	public void setOverTimePay(RespPayDetail overTimePay) {
		this.overTimePay = overTimePay;
	}
	public RespPayDetail getBonusPay() {
		return bonusPay;
	}
	public void setBonusPay(RespPayDetail bonusPay) {
		this.bonusPay = bonusPay;
	}
	public RespPayDetail getOtherPay() {
		return otherPay;
	}
	public void setOtherPay(RespPayDetail otherPay) {
		this.otherPay = otherPay;
	}
}
