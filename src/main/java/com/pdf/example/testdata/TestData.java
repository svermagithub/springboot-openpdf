
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
        incomeReport.setResellerInfo(getResellerInfo());
        return incomeReport;


    }

    private static ResellerInfo getResellerInfo() {
        ResellerInfo resellerInfo = new ResellerInfo();
        resellerInfo.setEndUserName("endUserName");
        return resellerInfo;
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
        ssn.setSsn("XXX-XX-7420");
        return ssn;
    }

    private  static List<RespPhone> getPhone() {
        List<RespPhone> respPhones = new ArrayList<>();
        RespPhone respPhone = new RespPhone();
        respPhone.setNumber("9893628344");
        respPhone.setType(null);
        respPhones.add(respPhone);
        return respPhones;
    }

    private static RespName getName() {

        RespName name  = new RespName();
        name.setFirstName("ROSS");
        name.setLastName("GEORGE");
        name.setMiddleName("G");
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
        employmentHistory1.setAsOfDate("2021-08-11");
        employmentHistory1.setOriginReportId("07110355-a957-47e5-96c4-efb8a138bda3");
        employmentHistory1.setOriginSourceId("00A");
        employmentHistory1.setEmployerIdentificationNumber("510349408");
        employmentHistory1.setEmployerName("Hara Inc");
        employmentHistory1.setEmployerDisclaimers(null);
        employmentHistory1.setEmploymentInformation(getEmploymentInformation1());
        employmentHistory1.setEmployerAddress(getEmployeeAddress());
        employmentHistory.add(employmentHistory1);

        EmploymentHistoryEmploymentScreening employmentHistory2 = new EmploymentHistoryEmploymentScreening();
        employmentHistory2.setAsOfDate("2021-08-11");
        employmentHistory2.setOriginReportId("07110355-a957-47e5-96c4-efb8a138bda3");
        employmentHistory2.setOriginSourceId("00A");
        employmentHistory2.setEmployerIdentificationNumber("510349408");
        employmentHistory2.setEmployerName("MMBS Inc");
        employmentHistory2.setEmployerAddress(getEmployeeAddress());
        employmentHistory2.setEmploymentInformation(getEmploymentInformation2());
        employmentHistory.add(employmentHistory2);



       /* EmploymentHistoryEmploymentScreening employmentHistory3 = new EmploymentHistoryEmploymentScreening();
        employmentHistory3.setOriginReportId("d745f9da-770e-11eb-9439-0242ac130002");
        employmentHistory3.setOriginSourceId("OriginSource");
        employmentHistory3.setEmployerIdentificationNumber("333333333");
        employmentHistory3.setEmployerName("Test3 Employer");
        employmentHistory3.setStepDone(2);
        employmentHistory3.setEmployerAddress(getEmployeeAddress());
        //employmentHistory3.setEmploymentInformation(getEmploymentInformation());
        employmentHistory.add(employmentHistory3);*/

        return employmentHistory;
    }

    private static List<EmploymentInformation> getEmploymentInformation2() {
        List<EmploymentInformation> lst =  new ArrayList<>();
        EmploymentInformation employmentInformation = new EmploymentInformation();
        employmentInformation.setMostRecentHireDate("06282009");
        employmentInformation.setOriginalHireDate("06282009");
        employmentInformation.setPositionTitle("Vice President");
        employmentInformation.setPositionTenure("P5Y1M14D");
        employmentInformation.setWorkStatus(getWorkStatus());
        employmentInformation.setEmploymentStatus(getEmploymentStatus());
        employmentInformation.setPositionEndDate(null);
        lst.add(employmentInformation);

        EmploymentInformation employmentInformation1 = new EmploymentInformation();
        employmentInformation1.setMostRecentHireDate("10282009");
        employmentInformation1.setOriginalHireDate("10282009");
        employmentInformation1.setPositionEndDate("02282015");
        employmentInformation1.setPositionTitle("App. Architect");
        employmentInformation1.setPositionTenure("P5Y4M0D");
        employmentInformation1.setWorkStatus(getWorkStatus());
        employmentInformation1.setEmploymentStatus(getEmploymentStatus());
        employmentInformation1.setPositionEndDate(null);
        lst.add(employmentInformation1);

        EmploymentInformation employmentInformation2 = new EmploymentInformation();
        employmentInformation2.setMostRecentHireDate("10282009");
        employmentInformation2.setOriginalHireDate("10282009");
        employmentInformation2.setPositionEndDate(null);
        employmentInformation2.setPositionTitle("Asoc App. Architect");
        employmentInformation2.setPositionTenure("P11Y9M14D");
        employmentInformation2.setWorkStatus(getWorkStatus());
        employmentInformation2.setEmploymentStatus(getEmploymentStatus());
        employmentInformation2.setPositionEndDate(null);
        lst.add(employmentInformation2);


        return lst;
    }

    private static List<EmploymentInformation> getEmploymentInformation1() {
        List<EmploymentInformation> lst =  new ArrayList<>();
        EmploymentInformation employmentInformation = new EmploymentInformation();
        employmentInformation.setEmploymentStatus(getEmploymentStatus());
        employmentInformation.setMostRecentHireDate("01012015");
        employmentInformation.setOriginalHireDate("01012015");
        employmentInformation.setPositionTenure("P11Y9M14D");
        employmentInformation.setPositionTitle("Software Engineer");
        employmentInformation.setWorkStatus(getWorkStatus());
        employmentInformation.setPositionEndDate(null);
        lst.add(employmentInformation);

        EmploymentInformation employmentInformation1 = new EmploymentInformation();
        employmentInformation1.setEmploymentStatus(getEmploymentStatus());
        employmentInformation1.setMostRecentHireDate("01012015");
        employmentInformation1.setOriginalHireDate("01012015");
        employmentInformation1.setPositionTenure("P11Y9M14D");
        employmentInformation1.setPositionTitle("Sr Software Engineer");
        employmentInformation1.setWorkStatus(getWorkStatus());
        employmentInformation1.setPositionEndDate(null);
        lst.add(employmentInformation1);

        EmploymentInformation employmentInformation2 = new EmploymentInformation();
        employmentInformation2.setEmploymentStatus(getEmploymentStatus());
        employmentInformation2.setMostRecentHireDate("01012019");
        employmentInformation2.setOriginalHireDate("01012015");
        employmentInformation2.setPositionTenure("P11Y9M14D");
        employmentInformation2.setPositionTitle("Lead Engineer");
        employmentInformation2.setWorkStatus(getWorkStatus());
        employmentInformation2.setPositionEndDate("01012017");
        lst.add(employmentInformation2);

        EmploymentInformation employmentInformation3 = new EmploymentInformation();
        employmentInformation3.setEmploymentStatus(getEmploymentStatus());
        employmentInformation3.setMostRecentHireDate("01012021");
        employmentInformation3.setOriginalHireDate("01012015");
        employmentInformation3.setPositionTenure("P11Y9M14D");
        employmentInformation3.setPositionTitle("Manager");
        employmentInformation3.setWorkStatus(getWorkStatus());
        employmentInformation3.setPositionEndDate("01012017");
        lst.add(employmentInformation3);

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
        incomeRequestor.setVerifierName("4999100");
        incomeRequestor.setVerifierName("Example Lender");
        return incomeRequestor;
    }
}


