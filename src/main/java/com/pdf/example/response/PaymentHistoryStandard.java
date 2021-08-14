package com.pdf.example.response;

public class PaymentHistoryStandard extends PaymentHistory{

	private GrossPayAmount grossPayAmount;
	public GrossPayAmount getGrossPayAmount() {
		return grossPayAmount;
	}
	public void setGrossPayAmount(GrossPayAmount grossPayAmount) {
		this.grossPayAmount = grossPayAmount;
	}
}
