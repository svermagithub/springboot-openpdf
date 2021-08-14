package com.pdf.example.response;

import java.util.List;

public class PaymentHistoryEnhanced extends PaymentHistory{

	private String payDescription;
	private Double payPeriodHours;
	private RespPayDetail basePayRate;
	private RespPayAmount payAmount;
	//private List<Deductions> deductions;
	private List<RespDeduction> deductions;
	private List<RespPayDistributions> payDistributions;
	/*
	private OvertimePayAmount overtimePayAmount;
	private BonusPayAmount bonusPayAmount;
	private OtherPayAmount otherPayAmount;
	private FICAMedicare ficaMedicare;
	private FICASocialSecurity ficaSocialSecurity;
	private FederalTax federalTax;
	private StateTax stateTax;
	private Class401K deduction401K;
	private HealthInsurance healthInsurance;*/
	
	public String getPayDescription() {
		return payDescription;
	}
	public void setPayDescription(String payDescription) {
		this.payDescription = payDescription;
	}
	public Double getPayPeriodHours() {
		return payPeriodHours;
	}
	public void setPayPeriodHours(Double payPeriodHours) {
		this.payPeriodHours = payPeriodHours;
	}
	public RespPayDetail getBasePayRate() {
		return basePayRate;
	}
	public void setBasePayRate(RespPayDetail basePayRate) {
		this.basePayRate = basePayRate;
	}
	public RespPayAmount getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(RespPayAmount payAmount) {
		this.payAmount = payAmount;
	}
	public List<RespDeduction> getDeductions() {
		return deductions;
	}
	public void setDeductions(List<RespDeduction> deductions) {
		this.deductions = deductions;
	}
	public List<RespPayDistributions> getPayDistributions() {
		return payDistributions;
	}
	public void setPayDistributions(List<RespPayDistributions> payDistributions) {
		this.payDistributions = payDistributions;
	}
	
}
