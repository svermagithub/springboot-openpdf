package com.pdf.example.response;

public class ApplicantInformationEnhancedMapper {

    public void mapper(ApplicantInformationEnhanced enh, ApplicantInformation ai){
        enh.setCurrentAddress(ai.getCurrentAddress());
        enh.setName(ai.getName());
        enh.setDob(null);
        enh.setPhone(ai.getPhone());
        enh.setSsn(ai.getSsn());
    }
}
