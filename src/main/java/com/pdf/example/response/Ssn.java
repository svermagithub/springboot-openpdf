package com.pdf.example.response;

import lombok.Data;


public @Data class Ssn {
    private String ssnumber;
    public String getSsnumber() {
        return ssnumber;
    }

    public void setSsnumber(String ssnumber) {
        this.ssnumber = ssnumber;
    }


}
