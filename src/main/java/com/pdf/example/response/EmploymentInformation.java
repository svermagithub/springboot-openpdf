package com.pdf.example.response;

import com.pdf.example.response.EmploymentStatus;
import com.pdf.example.response.WorkStatus;

public class EmploymentInformation {

	private String originalHireDate;
	private String mostRecentHireDate;
	private String positionEndDate;
	private String positionTenure;
	private String positionTitle;
	private EmploymentStatus employmentStatus;
	private WorkStatus workStatus;
	private boolean isCopied;

	public boolean isCopied() {  return isCopied; }
	public void setCopied(boolean copied) {	isCopied = copied;	}
	public String getOriginalHireDate() {
		return originalHireDate;
	}
	public void setOriginalHireDate(String originalHireDate) {
		this.originalHireDate = originalHireDate;
	}
	public String getMostRecentHireDate() {
		return mostRecentHireDate;
	}
	public void setMostRecentHireDate(String mostRecentHireDate) {
		this.mostRecentHireDate = mostRecentHireDate;
	}
	public String getPositionEndDate() {
		return positionEndDate;
	}
	public void setPositionEndDate(String mostRecentSeparationDate) {
		this.positionEndDate = mostRecentSeparationDate;
	}
	public String getPositionTenure() {
		return positionTenure;
	}
	public void setPositionTenure(String positionTenure) {
		this.positionTenure = positionTenure;
	}
	public String getPositionTitle() {
		return positionTitle;
	}
	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}
	public EmploymentStatus getEmploymentStatus() {
		return employmentStatus;
	}
	public void setEmploymentStatus(EmploymentStatus employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	public WorkStatus getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(WorkStatus workStatus) {
		this.workStatus = workStatus;
	}
}
