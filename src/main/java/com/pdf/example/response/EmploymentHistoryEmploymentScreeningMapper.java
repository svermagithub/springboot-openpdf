package com.pdf.example.response;

public class EmploymentHistoryEmploymentScreeningMapper {

    public void mapper(EmploymentHistoryEmploymentScreening ehs, EmploymentHistory eh){
        ehs.setAsOfDate(eh.getAsOfDate());
        ehs.setEmployerName(eh.getEmployerName());
        ehs.setEmployerAddress(eh.getEmployerAddress());
        ehs.setStepDone(eh.getStepDone());
        ehs.setOriginReportId(eh.getOriginReportId());
        ehs.setOriginSourceId(eh.getOriginSourceId());
        ehs.setOriginSourceId(eh.getEmployerIdentificationNumber());


    }
}
