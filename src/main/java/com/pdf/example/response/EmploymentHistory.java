package com.pdf.example.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class EmploymentHistory {

	private String asOfDate;
	private String originReportId;
	private String originSourceId;
	private String employerIdentificationNumber;
	private String employerName;
	private EmployerAddress employerAddress;
	@JsonIgnore
	private boolean titleDisplayed = false;
	@JsonIgnore
	private int stepDone = -1;

	public String getAsOfDate() {
		return asOfDate;
	}
	public void setAsOfDate(String asOfDate) {
		this.asOfDate = asOfDate;
	}
	public String getOriginReportId() {
		return originReportId;
	}
	public void setOriginReportId(String originReportId) {
		this.originReportId = originReportId;
	}
	public String getOriginSourceId() {
		return originSourceId;
	}
	public void setOriginSourceId(String originSourceId) {
		this.originSourceId = originSourceId;
	}
	public String getEmployerIdentificationNumber() {
		return employerIdentificationNumber;
	}
	public void setEmployerIdentificationNumber(String employerIdentificationNumber) {
		this.employerIdentificationNumber = employerIdentificationNumber;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public EmployerAddress getEmployerAddress() {
		return employerAddress;
	}
	public void setEmployerAddress(EmployerAddress employerAddress) {
		this.employerAddress = employerAddress;
	}

	public int getStepDone() {
		return stepDone;
	}

	public void setStepDone(int stepDone) {
		this.stepDone = stepDone;
	}

	public boolean isTitleDisplayed() {
		return titleDisplayed;
	}

	public void setTitleDisplayed(boolean titleDisplayed) {
		this.titleDisplayed = titleDisplayed;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof EmploymentHistory)) return false;
		EmploymentHistory that = (EmploymentHistory) o;
		return Objects.equals(employerIdentificationNumber, that.employerIdentificationNumber) && Objects.equals(employerName, that.employerName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(employerIdentificationNumber, employerName);
	}
}