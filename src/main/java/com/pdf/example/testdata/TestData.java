
package com.pdf.example.testdata;

import com.pdf.example.response.*;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    public static IncomeAndEmploymentResponse getIncomeAndEmploymentResponse() {

        IncomeAndEmploymentResponse incomeAndEmploymentResponse = new IncomeAndEmploymentResponse();
        incomeAndEmploymentResponse.setExpVerifyReport(getIncomeReport());

        return incomeAndEmploymentResponse;

    }

    private static IncomeReport getIncomeReport() {
        IncomeReport incomeReport = new IncomeReport();
        incomeReport.setReportId("5d7bab91-cd3b-48d8-8b7e-3c664ae4be77");
        incomeReport.setReportType("ExpVerify-Employment");
        incomeReport.setReportGeneratedDate("1628744569");
        incomeReport.setRequestor(getRequestor());
        incomeReport.setConsumerPii(getConsumerPii());
        return incomeReport;


    }

    private static RespConsumerPii getConsumerPii() {
        RespConsumerPii respConsumerPii = new RespConsumerPii();
        respConsumerPii.setApplicantInformation(getApplicantInformation());
        respConsumerPii.setEmploymentHistory(getEmploymentHistory());

        return respConsumerPii;

    }

    private  static ApplicantInformation getApplicantInformation() {
        ApplicantInformationEnhanced applicantInformation = new ApplicantInformationEnhanced();
        applicantInformation.setDob(getDob());
       applicantInformation.setName(getName());
        applicantInformation.setPhone(getPhone());
        applicantInformation.setSsn(getSsn());
        applicantInformation.setCurrentAddress(getCurrentAddress());


        return applicantInformation;
    }

    private  static RespSsn getSsn() {
        RespSsn ssn = new RespSsn();
        ssn.setSsn("xxx-xx-xxxx");
        return ssn;
    }

    private  static List<RespPhone> getPhone() {
        List<RespPhone> respPhones = new ArrayList<>();
        RespPhone respPhone = new RespPhone();
        respPhone.setNumber("12345567672");
        respPhone.setType("Home");
        respPhones.add(respPhone);
        return respPhones;
    }

    private static RespName getName() {

        RespName name  = new RespName();
        name.setFirstName("TEST");
        name.setLastName("TEST");
        name.setMiddleName("A");
        name.setGenerationCode(null);

        return name;
    }

    private static Dob getDob() {
        Dob dob = new Dob();
        dob.setDob("01011984");
        return dob;
    }


    private static RespCurrentAddress getCurrentAddress() {
        RespCurrentAddress currentAddress = new RespCurrentAddress();
        currentAddress.setLine1("1234 TEST St");
        currentAddress.setLine2(null);
        currentAddress.setLine3(null);
        currentAddress.setCity("City");
        currentAddress.setState("State");
        currentAddress.setZipCode("111111");
        return currentAddress;

    }

    private static List<EmploymentHistory> getEmploymentHistory() {
        List<EmploymentHistory> employmentHistory = new ArrayList<>();
        EmploymentHistoryEmploymentScreening employmentHistory1 = new EmploymentHistoryEmploymentScreening();
        employmentHistory1.setOriginReportId("7c538bb6-770c-11eb-9439-0242ac130002");
        employmentHistory1.setOriginSourceId("OriginSource");
        employmentHistory1.setEmployerIdentificationNumber("111111111");
        employmentHistory1.setEmployerName("Test1 Employer");
     //   employmentHistory1.setOriginalHireDate("01012020");
      //  employmentHistory1.setMostRecentHireDate("01012020");
     //   employmentHistory1.setEmploymentStatus(getEmploymentStatus());
     //   employmentHistory1.setWorkStatus(getWorkStatus());
        employmentHistory1.setEmployerAddress(getEmployeeAddress());
     //  employmentHistory1.setPaymentHistory(getPaymentHistory());
      //  employmentHistory1.setTotalAnnualRenumeration(getTotalRenumeration());

        employmentHistory1.setEmploymentInformation(getEmploymentInformation());

        employmentHistory.add(employmentHistory1);

        EmploymentHistoryEmploymentScreening employmentHistory2 = new EmploymentHistoryEmploymentScreening();
        employmentHistory2.setOriginReportId("cc4ccad6-770e-11eb-9439-0242ac130002");
        employmentHistory2.setOriginSourceId("OriginSource");
        employmentHistory2.setEmployerIdentificationNumber("222222222");
        employmentHistory2.setEmployerName("Test2 Employer");
       // employmentHistory2.setOriginalHireDate("01012021");
    //    employmentHistory2.setMostRecentHireDate("01012021");
      //  employmentHistory2.setEmploymentStatus(getEmploymentStatus());
      //  employmentHistory2.setWorkStatus(getWorkStatus());
        employmentHistory2.setEmployerAddress(getEmployeeAddress());
      //  employmentHistory2.setPaymentHistory(getPaymentHistory());
     //   employmentHistory2.setTotalAnnualRenumeration(getTotalRenumeration());
        employmentHistory.add(employmentHistory2);

        EmploymentHistoryEmploymentScreening employmentHistory3 = new EmploymentHistoryEmploymentScreening();
        employmentHistory3.setOriginReportId("d745f9da-770e-11eb-9439-0242ac130002");
        employmentHistory3.setOriginSourceId("OriginSource");
        employmentHistory3.setEmployerIdentificationNumber("333333333");
        employmentHistory3.setEmployerName("Test3 Employer");
    //    employmentHistory3.setOriginalHireDate("01012019");
   //     employmentHistory3.setMostRecentHireDate("01012020");
    //    employmentHistory3.setEmploymentStatus(getEmploymentStatus());
    //    employmentHistory3.setWorkStatus(getWorkStatus());
        employmentHistory3.setEmployerAddress(getEmployeeAddress());
    //    employmentHistory3.setPaymentHistory(getPaymentHistory());
    //    employmentHistory3.setTotalAnnualRenumeration(getTotalRenumeration());
        employmentHistory.add(employmentHistory3);

        return employmentHistory;
    }

    private static List<EmploymentInformation> getEmploymentInformation() {
        List<EmploymentInformation> lst =  new ArrayList<>();
        EmploymentInformation employmentInformation = new EmploymentInformation();
        employmentInformation.setEmploymentStatus(getEmploymentStatus());
        employmentInformation.setMostRecentHireDate("10282009");
        employmentInformation.setOriginalHireDate("10282009");
        employmentInformation.setPositionTenure("Advisor");
        employmentInformation.setWorkStatus(getWorkStatus());
        employmentInformation.setMostRecentSeparationDate(null);

        return lst;

    }

    private static List<TotalAnnualRenumeration> getTotalRenumeration() {
        List<TotalAnnualRenumeration> totalAnnualRenumerations = new ArrayList<>();
        TotalAnnualRenumeration totalAnnualRenumeration1 = new TotalAnnualRenumeration();
        totalAnnualRenumeration1.setYear(0);
        totalAnnualRenumeration1.setAmount(12345.44);
        totalAnnualRenumeration1.setCurrencyCode("USD");
        totalAnnualRenumerations.add(totalAnnualRenumeration1);

        TotalAnnualRenumeration totalAnnualRenumeration2 = new TotalAnnualRenumeration();
        totalAnnualRenumeration2.setYear(0);
        totalAnnualRenumeration2.setAmount(12345.44);
        totalAnnualRenumeration2.setCurrencyCode("USD");
        totalAnnualRenumerations.add(totalAnnualRenumeration2);

        return totalAnnualRenumerations;
    }

    private static List<PaymentHistory> getPaymentHistory() {
        List<PaymentHistory> paymentHistory = new ArrayList<>();
        PaymentHistory paymentHistory1 = new PaymentHistory();
        paymentHistory1.setPayDate(null);
        paymentHistory1.setPayCycle("BIWEEKLY");
   //     paymentHistory1.setPayPeriod(getPayPeriod());
    //    paymentHistory1.setGrossPayAmount(getGrossPayAmount());

        paymentHistory.add(paymentHistory1);

        PaymentHistory paymentHistory2 = new PaymentHistory();
        paymentHistory2.setPayDate(null);
        paymentHistory2.setPayCycle("MONTHLY");
     //   paymentHistory2.setPayPeriod(getPayPeriod());
    //    paymentHistory2.setGrossPayAmount(getGrossPayAmount());
        paymentHistory.add(paymentHistory2);

        return paymentHistory;
    }

    private static GrossPayAmount getGrossPayAmount() {
        GrossPayAmount grossPayAmount = new GrossPayAmount();
        grossPayAmount.setAmount(1234.43);
        grossPayAmount.setCurrencyCode("USD");
        grossPayAmount.setHour(12.2);
        grossPayAmount.setYtdGrossPay(11.1);
        grossPayAmount.setCommission(1.1);
        grossPayAmount.setRate(50.0);

       grossPayAmount.getDeductionsList().add(getDeduction());
       grossPayAmount.getDeductionsList().add(getDeduction());



        return grossPayAmount;
    }

    private static  Deductions getDeduction(){
        Deductions d = new Deductions();
        d.setDeduction("Deduction test");
        d.setCurrent(1222.33);
        d.setYtdTotal(122222.2);
        return d;
    }

    private static PayPeriod getPayPeriod() {
        PayPeriod payPeriod = new PayPeriod();
        payPeriod.setStartDate(null);
        payPeriod.setEndDate("01012021");

        return payPeriod;
    }

    private static EmployerAddress getEmployeeAddress() {
        EmployerAddress employerAddress = new EmployerAddress();
        employerAddress.setLineOne("217 EVANS ST");
        employerAddress.setLineTwo("123 abcd");
        employerAddress.setLineThree("53543 pqr..");
        employerAddress.setCityName("EAST TAWAS");
        employerAddress.setState("MI");
        employerAddress.setCountryCode(null);
        employerAddress.setPostalCode("48730-1512");

        return employerAddress;
    }

    private static WorkStatus getWorkStatus() {
        WorkStatus workStatus = new WorkStatus();
        workStatus.setCode(null);
        workStatus.setName("ACTIVE");
        return workStatus;
    }

    private static EmploymentStatus getEmploymentStatus() {
        EmploymentStatus employmentStatus = new EmploymentStatus();
        employmentStatus.setCode("F");
        employmentStatus.setName("Full Time");
        return employmentStatus;
    }

    private static IncomeRequestor getRequestor() {
        IncomeRequestor incomeRequestor = new IncomeRequestor();
        incomeRequestor.setVerifierName("1111111");
        incomeRequestor.setVerifierName("Example Lender");
        return incomeRequestor;
    }
}


