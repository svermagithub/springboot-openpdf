package com.pdf.example.response;

import java.util.List;
import java.util.Objects;

public class EmploymentHistoryPlus extends EmploymentHistoryIncome{

	private List<PaymentHistory> paymentHistory;
	private List<TotalAnnualRenumeration> totalAnnualRemuneration;
	
	public List<PaymentHistory> getPaymentHistory() {
		return paymentHistory;
	}
	public void setPaymentHistory(List<PaymentHistory> paymentHistory) {
		this.paymentHistory = paymentHistory;
	}
	public List<TotalAnnualRenumeration> getTotalAnnualRemuneration() {
		return totalAnnualRemuneration;
	}
	public void setTotalAnnualRemuneration(List<TotalAnnualRenumeration> totalAnnualRemuneration) {
		this.totalAnnualRemuneration = totalAnnualRemuneration;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmploymentHistoryPlus)) return false;
        EmploymentHistoryPlus that = (EmploymentHistoryPlus) o;
        return Objects.equals(paymentHistory, that.paymentHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentHistory);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmploymentHistoryPlus{");
        sb.append("paymentHistory='").append(paymentHistory).append('\'');
        sb.append(", totalAnnualRemuneration='").append(totalAnnualRemuneration).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
