package com.pdf.example.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pdf.example.response.IncomeReport;

public class IncomeAndEmploymentResponse {

    private IncomeReport expVerifyReport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private byte[] pdfBytes;

    public IncomeReport getExpVerifyReport() {
		return expVerifyReport;
	}

	public void setExpVerifyReport(IncomeReport expVerifyReport) {
		this.expVerifyReport = expVerifyReport;
	}

	public byte[] getPdfBytes() {
        return pdfBytes;
    }

    public void setPdfBytes(byte[] pdfBytes) {
        this.pdfBytes = pdfBytes;
    }
}
