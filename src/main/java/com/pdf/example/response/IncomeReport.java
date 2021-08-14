package com.pdf.example.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

public class IncomeReport {

	private String reportId;
	private String reportType;
	//private String dataProvider;
	private String reportGeneratedDate;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private IncomeRequestor requestor;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private ResellerInfo resellerInfo;
	private RespConsumerPii consumerPii;

	@JsonIgnore
	boolean footer = false;
	
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	/*public String getDataProvider() {
		return dataProvider;
	}
	public void setDataProvider(String dataProvider) {
		this.dataProvider = dataProvider;
	}*/
	public String getReportGeneratedDate() {
		return reportGeneratedDate;
	}
	public void setReportGeneratedDate(String reportGeneratedDate) {
		this.reportGeneratedDate = reportGeneratedDate;
	}
	public IncomeRequestor getRequestor() {
		return requestor;
	}
	public void setRequestor(IncomeRequestor requestor) {
		this.requestor = requestor;
	}
	/*public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}*/
	public RespConsumerPii getConsumerPii() {
		return consumerPii;
	}
	public void setConsumerPii(RespConsumerPii consumerPii) {
		this.consumerPii = consumerPii;
	}
	public ResellerInfo getResellerInfo() {
		return resellerInfo;
	}
	public void setResellerInfo(ResellerInfo resellerInfo) {
		this.resellerInfo = resellerInfo;
	}

	public boolean isFooter() {
		return footer;
	}

	public void setFooter(boolean footer) {
		this.footer = footer;
	}
}
