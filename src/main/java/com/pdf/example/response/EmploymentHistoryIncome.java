package com.pdf.example.response;

public class EmploymentHistoryIncome extends EmploymentHistory{

	private String originalHireDate;
	private String mostRecentHireDate;
	private EmploymentStatus employmentStatus;
	private WorkStatus workStatus;
	
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

  /*  @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmploymentHistory{");
        sb.append("originReportId='").append(originReportId).append('\'');
        sb.append(", originSourceId='").append(originSourceId).append('\'');
        sb.append(", employerIdentificationNumber='").append(employerIdentificationNumber).append('\'');
        sb.append(", employerName='").append(employerName).append('\'');
        sb.append(", originalHireDate='").append(originalHireDate).append('\'');
        sb.append(", mostRecentHireDate='").append(mostRecentHireDate).append('\'');
        sb.append(", employmentStatus=").append(employmentStatus);
        sb.append(", workStatus=").append(workStatus);
        sb.append(", employerAddress=").append(employerAddress);
        sb.append('}');
        return sb.toString();
    }*/
}
