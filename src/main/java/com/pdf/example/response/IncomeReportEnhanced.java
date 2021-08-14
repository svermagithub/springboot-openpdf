package com.pdf.example.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class IncomeReportEnhanced extends IncomeReport {

	@JsonInclude(Include.NON_NULL)
	private ReportCustomLabels reportCustomLabels;
	//private ResellerInfo resellerInfo;
	
	public ReportCustomLabels getReportCustomLabels() {
		return reportCustomLabels;
	}
	public void setReportCustomLabels(ReportCustomLabels reportCustomLabels) {
		this.reportCustomLabels = reportCustomLabels;
	}
}
