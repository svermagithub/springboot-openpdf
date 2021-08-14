package com.pdf.example.response;


import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.Optional;

public class EmploymentHistoryEnhanced extends EmploymentHistoryPlus implements EmploymentMapper {

	public static final String NOT_AVAILABLE = "N/A";

	//private String asOfDate;
	private String positionTenure;
	private String positionTitle;
	private String employerDisclaimers;
	
	/*public String getAsOfDate() {
		return asOfDate;
	}
	public void setAsOfDate(String asOfDate) {
		this.asOfDate = asOfDate;
	}*/
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
	public String getEmployerDisclaimers() {
		return employerDisclaimers;
	}
	public void setEmployerDisclaimers(String employerDisclaimers) {
		this.employerDisclaimers = employerDisclaimers;
	}

	@Override
	public void mapEmploymentDetails(Map<String, String> tagValueMap) {
		tagValueMap.put("employerName", "" + Optional.ofNullable(this.getEmployerName()).orElse(NOT_AVAILABLE));
		tagValueMap.put("employerAddress", getEmployerAddress(this.getEmployerAddress()));


		tagValueMap.put("title", this.getPositionTitle()!=null ? StringUtils.capitalize(this.getPositionTitle().toLowerCase()) : NOT_AVAILABLE);
		tagValueMap.put("originalHiredDate", Optional.ofNullable(CommonUtils.getFormattedDate(this.getOriginalHireDate())).orElse(NOT_AVAILABLE));
		tagValueMap.put("mostRecentHiredDate", Optional.ofNullable(CommonUtils.getFormattedDate(this.getMostRecentHireDate())).orElse(NOT_AVAILABLE));
		tagValueMap.put("employmentStatus", this.getEmploymentStatus() !=null ? Optional.ofNullable(StringUtils.capitalize(this.getEmploymentStatus().getName().toLowerCase()) ).orElse(NOT_AVAILABLE): NOT_AVAILABLE);
		tagValueMap.put("workStatus", this.getWorkStatus() !=null ? Optional.ofNullable(StringUtils.capitalize(this.getWorkStatus().getName().toLowerCase())).orElse(NOT_AVAILABLE) : NOT_AVAILABLE);
		tagValueMap.put("tenure", Optional.ofNullable(CommonUtils.formatTenure(this.getPositionTenure())).orElse(NOT_AVAILABLE));

	}
	private String getEmployerAddress(EmployerAddress employerAddress) {
		StringBuilder currentAddressStringBuilder = new StringBuilder();
		if(employerAddress.getLineOne()!=null) {
			currentAddressStringBuilder.append(employerAddress.getLineOne()+", ");
		}
		if(employerAddress.getLineTwo()!=null) {
			currentAddressStringBuilder.append(employerAddress.getLineTwo()+", ");
		}
		if(employerAddress.getLineThree()!=null) {
			currentAddressStringBuilder.append(employerAddress.getLineThree()+", ");
		}
		if(employerAddress.getCityName()!=null) {
			currentAddressStringBuilder.append(employerAddress.getCityName()+", ");
		}
		if(employerAddress.getState()!=null) {
			currentAddressStringBuilder.append(employerAddress.getState()+" ");
		}
		if(employerAddress.getPostalCode()!=null) {
			currentAddressStringBuilder.append(employerAddress.getPostalCode());
		}

		return currentAddressStringBuilder.length() !=0 ? currentAddressStringBuilder.toString() : "N/A" ;
	}
}
