package com.pdf.example.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PaymentHistory {

	private String payDate;
	private String payCycle;
	private PayPeriod payPeriod;

	@JsonIgnore
	private GrossPayAmount grossPayAmount;

	@JsonIgnore
	private int stepDone = -1;
	//private NetPayAmount netPayAmount;
	
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getPayCycle() {
		return payCycle;
	}
	public void setPayCycle(String payCycle) {
		this.payCycle = payCycle;
	}
	public PayPeriod getPayPeriod() {
		return payPeriod;
	}
	public void setPayPeriod(PayPeriod payPeriod) {
		this.payPeriod = payPeriod;
	}
	/*public NetPayAmount getNetPayAmount() {
		return netPayAmount;
	}
	public void setNetPayAmount(NetPayAmount netPayAmount) {
		this.netPayAmount = netPayAmount;
	}*/

	/*public GrossPayAmount getGrossPayAmount() {
		return grossPayAmount;
	}
	public void setGrossPayAmount(GrossPayAmount grossPayAmount) {
		this.grossPayAmount = grossPayAmount;
	}*/
	
	public class PayPeriod{
		private String startDate;
		private String endDate;
		public PayPeriod() {
			
		}
		public PayPeriod(String startDate, String endDate) {
			this.startDate = startDate;
			this.endDate = endDate;
		}
		public String getStartDate() {
			return startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof PayPeriod)) return false;
	        PayPeriod payPeriod = (PayPeriod) o;
	        return Objects.equals(endDate, payPeriod.endDate);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(endDate);
	    }

	    @Override
	    public String toString() {
	        final StringBuilder sb = new StringBuilder("PayPeriod{");
	        sb.append("startDate='").append(startDate).append('\'');
	        sb.append(", endDate='").append(endDate).append('\'');
	        sb.append('}');
	        return sb.toString();
	    }
	}
	public class GrossPayAmount{
		private Double amount;
		private String currencyCode;
		
		public GrossPayAmount() {
			
		}
		public GrossPayAmount(Double amount, String currencyCode ) {
			this.amount = amount;
			this.currencyCode = currencyCode;
		}
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
		

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof GrossPayAmount)) return false;
	        GrossPayAmount payAmount = (GrossPayAmount) o;
	        return Objects.equals(amount, payAmount.amount);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(amount);
	    }

	    @Override
	    public String toString() {
	        final StringBuilder sb = new StringBuilder("Amount{");
	        sb.append("amount=").append(amount);
	        sb.append(", currencyCode='").append(currencyCode).append('\'');
	        sb.append('}');
	        return sb.toString();
	    }
	}
	public class NetPayAmount{
		private Double amount;
		private String currencyCode;
		public NetPayAmount() {
			
		}
		public NetPayAmount(Double amount, String currencyCode ) {
			this.amount = amount;
			this.currencyCode = currencyCode;
		}
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
	public int getStepDone() {
		return stepDone;
	}

	public void setStepDone(int stepDone) {
		this.stepDone = stepDone;
	}
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PaymentHistory)) return false;
        PaymentHistory that = (PaymentHistory) o;
		return Objects.equals(payDate, that.payDate) && Objects.equals(payPeriod,
				that.payPeriod) /* && Objects.equals(grossPayAmount, that.grossPayAmount) */;
    }

    @Override
    public int hashCode() {
       // return Objects.hash(payDate, payPeriod, grossPayAmount);
        return Objects.hash(payDate, payPeriod);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentHistory{");
        sb.append("payDate='").append(payDate).append('\'');
        sb.append(", payCycle='").append(payCycle).append('\'');
        sb.append(", payPeriod=").append(payPeriod);
        //sb.append(", grossPayAmount=").append(grossPayAmount);
        sb.append('}');
        return sb.toString();
    }
}
