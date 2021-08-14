package com.pdf.example.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicantInformation {

    private RespName name;
    private RespSsn ssn;
    private List<RespPhone> phone;
    private RespCurrentAddress currentAddress;

    public RespName getName() {
        return name;
    }

    public void setName(RespName name) {
        this.name = name;
    }

    public RespSsn getSsn() {
        return ssn;
    }

    public void setSsn(RespSsn ssn) {
        this.ssn = ssn;
    }

    public List<RespPhone> getPhone() {
        return phone;
    }

    public void setPhone(List<RespPhone> phone) {
        this.phone = phone;
    }

    public RespCurrentAddress getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(RespCurrentAddress currentAddress) {
        this.currentAddress = currentAddress;
    }
}
