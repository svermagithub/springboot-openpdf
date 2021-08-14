package com.pdf.example.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class IncomeReportVOE extends IncomeReport{

	@JsonInclude(Include.NON_NULL)
	private ReportCustomLabels reportCustomLabels;
	
	public ReportCustomLabels getReportCustomLabels() {
		return reportCustomLabels;
	}
	public void setReportCustomLabels(ReportCustomLabels reportCustomLabels) {
		this.reportCustomLabels = reportCustomLabels;
	}
}
