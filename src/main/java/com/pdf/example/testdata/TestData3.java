
package com.pdf.example.testdata;

import com.pdf.example.response.*;

import java.util.ArrayList;
import java.util.List;

public class TestData3 {

    public static IncomeAndEmploymentResponse getIncomeAndEmploymentResponse() {

        IncomeAndEmploymentResponse incomeAndEmploymentResponse = new IncomeAndEmploymentResponse();
        incomeAndEmploymentResponse.setExpVerifyReport(getIncomeReport());

        return incomeAndEmploymentResponse;

    }

    private static IncomeReport getIncomeReport() {
        IncomeReportEnhanced incomeReport = new IncomeReportEnhanced();
        incomeReport.setReportId("50e16dda-2a59-45a7-8b75-c16cb45d507b");
        incomeReport.setReportType("ExpVerify-Premium");
        incomeReport.setReportGeneratedDate("1631501518");
        incomeReport.setRequestor(getRequestor());
        incomeReport.setConsumerPii(getConsumerPii());
        incomeReport.setResellerInfo(getResellerInfo());
        return incomeReport;


    }

    private static ResellerInfo getResellerInfo() {
        ResellerInfo resellerInfo = new ResellerInfo();
        resellerInfo.setEndUserName("pidepipper LLC");
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
        currentAddress.setLine1("217 EVANS ST");
        currentAddress.setLine2(null);
        currentAddress.setLine3(null);
        currentAddress.setCity("EAST TAWAS");
        currentAddress.setState("MI");
        currentAddress.setZipCode("48730-1512");
        return currentAddress;

    }

    private static List<EmploymentHistory> getEmploymentHistory() {
        List<EmploymentHistory> employmentHistory = new ArrayList<>();

        EmploymentHistoryEnhanced employmentHistory1 = new EmploymentHistoryEnhanced();
        employmentHistory1.setAsOfDate("05282021");
        employmentHistory1.setOriginReportId("bb5c3dc2-9f8c-435a-8200-39c8d0b8d48f");
        employmentHistory1.setOriginSourceId("00A");
        employmentHistory1.setEmployerIdentificationNumber("510349408");
        employmentHistory1.setEmployerName("MMBS Inc");
        employmentHistory1.setOriginalHireDate("11282009");
        employmentHistory1.setMostRecentHireDate("07282016");
        employmentHistory1.setWorkStatus(getWorkStatus());
        employmentHistory1.setEmploymentStatus(getEmploymentStatus());
        employmentHistory1.setPaymentHistory(getPaymentHistory());
        employmentHistory1.setTotalAnnualRemuneration(getTotalRenumeration());
        employmentHistory1.setEmployerAddress(getEmployeeAddress());
        employmentHistory1.setPositionTenure("P5Y1M16D");
        employmentHistory1.setPositionTitle("Data Engineer");
        employmentHistory1.setEmployerDisclaimers(null);

        employmentHistory.add(employmentHistory1);


        EmploymentHistoryEnhanced employmentHistory2 = new EmploymentHistoryEnhanced();

        employmentHistory2.setAsOfDate("08102021");
        employmentHistory2.setOriginReportId("bb5c3dc2-9f8c-435a-8200-39c8d0b8d48f");
        employmentHistory2.setOriginSourceId("00A");
        employmentHistory2.setEmployerIdentificationNumber("510349408");
        employmentHistory2.setEmployerName("Hara Inc");
        employmentHistory2.setOriginalHireDate("11282009");
        employmentHistory2.setMostRecentHireDate("11282009");
        employmentHistory2.setWorkStatus(getWorkStatus());
        employmentHistory2.setEmploymentStatus(getEmploymentStatus());
        employmentHistory2.setPaymentHistory(getPaymentHistory1());
        employmentHistory2.setTotalAnnualRemuneration(getTotalRenumeration1());
        employmentHistory2.setEmployerAddress(getEmployeeAddress());
        employmentHistory2.setPositionTenure("P5Y1M16D");
        employmentHistory2.setPositionTitle("Data Engineer");
        employmentHistory2.setEmployerDisclaimers(null);

        employmentHistory.add(employmentHistory2);



        return employmentHistory;
    }

    private static List<TotalAnnualRenumeration> getTotalRenumeration() {
        List<TotalAnnualRenumeration> totalAnnualRenumerations = new ArrayList<>();
        TotalAnnualRenumerationEnhanced totalAnnualRenumeration1 = new TotalAnnualRenumerationEnhanced();
        totalAnnualRenumeration1.setYear(2021);
        totalAnnualRenumeration1.setPayAmountYTD(getAmountYTD());
        totalAnnualRenumerations.add(totalAnnualRenumeration1);

        TotalAnnualRenumerationEnhanced totalAnnualRenumeration2 = new TotalAnnualRenumerationEnhanced();
        totalAnnualRenumeration2.setYear(2020);
        totalAnnualRenumeration2.setPayAmountYTD(getAmountYTD1());
        totalAnnualRenumerations.add(totalAnnualRenumeration2);

        return totalAnnualRenumerations;
    }

    private static List<TotalAnnualRenumeration> getTotalRenumeration1() {
        List<TotalAnnualRenumeration> totalAnnualRenumerations = new ArrayList<>();
        TotalAnnualRenumerationEnhanced totalAnnualRenumeration1 = new TotalAnnualRenumerationEnhanced();
        totalAnnualRenumeration1.setYear(2021);
        totalAnnualRenumeration1.setPayAmountYTD(getAmountYTD2());
        totalAnnualRenumerations.add(totalAnnualRenumeration1);

        return totalAnnualRenumerations;
    }

    private static PayAmountYTD getAmountYTD() {
        PayAmountYTD payAmountYTD = new PayAmountYTD();
        payAmountYTD.setGrossPayYTD(getRespPayYTD(62884.59,"USD" ));
        payAmountYTD.setBasePayYTD(getRespPayYTD(25384.59,"USD" ));
        payAmountYTD.setOvertimePayYTD(getRespPayYTD(0.0,"USD" ));
        payAmountYTD.setBonusPayYTD(getRespPayYTD(36000.0,"USD" ));
        payAmountYTD.setOtherPayYTD(getRespPayYTD(1500.0,"USD" ));

        return payAmountYTD;
    }

    private static PayAmountYTD getAmountYTD1() {
        PayAmountYTD payAmountYTD = new PayAmountYTD();
        payAmountYTD.setGrossPayYTD(getRespPayYTD(153766.21,"USD" ));
        payAmountYTD.setBasePayYTD(getRespPayYTD(59999.94,"USD" ));
        payAmountYTD.setOvertimePayYTD(getRespPayYTD(0.0,"USD" ));
        payAmountYTD.setBonusPayYTD(getRespPayYTD(90166.27,"USD" ));
        payAmountYTD.setOtherPayYTD(getRespPayYTD(3600.0,"USD" ));

        return payAmountYTD;
    }

    private static PayAmountYTD getAmountYTD2() {
        PayAmountYTD payAmountYTD = new PayAmountYTD();
        payAmountYTD.setGrossPayYTD(getRespPayYTD(81511.52,"USD" ));
        payAmountYTD.setBasePayYTD(getRespPayYTD(18461.52,"USD" ));
        payAmountYTD.setOvertimePayYTD(getRespPayYTD(0.0,"USD" ));
        payAmountYTD.setBonusPayYTD(getRespPayYTD(62000.0,"USD" ));
        payAmountYTD.setOtherPayYTD(getRespPayYTD(1050.0,"USD" ));

        return payAmountYTD;
    }

    private static RespPayYTD getRespPayYTD(double amount, String currencyCode) {
        RespPayYTD payYTD = new RespPayYTD();
        payYTD.setAmount(amount);
        payYTD.setCurrencyCode(currencyCode);
        return payYTD;
    }

    private static List<PaymentHistory> getPaymentHistory() {
        List<PaymentHistory> paymentHistory = new ArrayList<>();
        PaymentHistoryEnhanced paymentHistory1 = new PaymentHistoryEnhanced();
        paymentHistory1.setPayDate("08102021");
        paymentHistory1.setPayCycle("Bi-Weekly");
        paymentHistory1.setPayPeriod(getPayPeriod("07212021", "08032021"));
        paymentHistory1.setPayDescription("Hourly");
        paymentHistory1.setPayPeriodHours(0.0);
        paymentHistory1.setBasePayRate(getBasePayRate());
        paymentHistory1.setPayAmount(getRespPayAmount());
        paymentHistory1.setDeductions(getDeductions());
        paymentHistory1.setPayDistributions(getPayDistributions());
        paymentHistory.add(paymentHistory1);

        PaymentHistoryEnhanced paymentHistory2 = new PaymentHistoryEnhanced();
        paymentHistory2.setPayDate("12302021");
        paymentHistory2.setPayCycle("Bi-Weekly");
        paymentHistory2.setPayPeriod(getPayPeriod("12102021", "12232021"));
        paymentHistory2.setPayDescription("Hourly");
        paymentHistory2.setPayPeriodHours(0.0);
        paymentHistory2.setBasePayRate(getRespPayDetail(2307.69, "USD"));
        paymentHistory2.setPayAmount(getRespPayAmount1());
        paymentHistory2.setDeductions(getDeductions());
        paymentHistory2.setPayDistributions(getPayDistributions1());
        paymentHistory.add(paymentHistory2);

        return paymentHistory;
    }

    private static List<PaymentHistory> getPaymentHistory1() {
        List<PaymentHistory> paymentHistory = new ArrayList<>();
        PaymentHistoryEnhanced paymentHistory1 = new PaymentHistoryEnhanced();
        paymentHistory1.setPayDate("08102021");
        paymentHistory1.setPayCycle("Bi-Weekly");
        paymentHistory1.setPayPeriod(getPayPeriod("07212021", "08032021"));
        paymentHistory1.setPayDescription("Hourly");
        paymentHistory1.setPayPeriodHours(0.0);
        paymentHistory1.setBasePayRate(getBasePayRate());
        paymentHistory1.setPayAmount(getRespPayAmount());
        paymentHistory1.setDeductions(getDeductions());
        paymentHistory1.setPayDistributions(getPayDistributions());
        paymentHistory.add(paymentHistory1);

        PaymentHistoryEnhanced paymentHistory2 = new PaymentHistoryEnhanced();
        paymentHistory2.setPayDate("12302021");
        paymentHistory2.setPayCycle("Bi-Weekly");
        paymentHistory2.setPayPeriod(getPayPeriod("12102021", "12232021"));
        paymentHistory2.setPayDescription("Hourly");
        paymentHistory2.setPayPeriodHours(0.0);
        paymentHistory2.setBasePayRate(getRespPayDetail(2307.69, "USD"));
        paymentHistory2.setPayAmount(getRespPayAmount1());
        paymentHistory2.setDeductions(getDeductions());
        paymentHistory2.setPayDistributions(getPayDistributions1());
        paymentHistory.add(paymentHistory2);

        return paymentHistory;
    }

    private static List<RespPayDistributions> getPayDistributions() {
        List<RespPayDistributions> payDistributionsList = new ArrayList<>();
        RespPayDistributions payDistributions = new RespPayDistributions();

        RespDepositAmount depositAmount = new RespDepositAmount();
        depositAmount.setAmount(10500.29);
        depositAmount.setCurrencyCode("USD");

        RespDepositAccount depositAccount = new RespDepositAccount();
        depositAccount.setAccountNumber("XXX-XX-0000");
        depositAccount.setRoutingTransitID("000000000");
        depositAccount.setAccountTypeCode("Checking");
        payDistributions.setDepositAccount(depositAccount);

        payDistributionsList.add(payDistributions);

        return payDistributionsList;
    }

    private static List<RespPayDistributions> getPayDistributions1() {
        List<RespPayDistributions> payDistributionsList = new ArrayList<>();
        RespPayDistributions payDistributions = new RespPayDistributions();

        RespDepositAmount depositAmount = new RespDepositAmount();
        depositAmount.setAmount(1221.75);
        depositAmount.setCurrencyCode("USD");

        RespDepositAccount depositAccount = new RespDepositAccount();
        depositAccount.setAccountNumber("XXX-XX-0000");
        depositAccount.setRoutingTransitID("000000000");
        depositAccount.setAccountTypeCode("Checking");
        payDistributions.setDepositAccount(depositAccount);

        payDistributionsList.add(payDistributions);

        return payDistributionsList;
    }

    private static List<RespDeduction> getDeductions() {
        List<RespDeduction> deductions = new ArrayList<>();
        deductions.add(getRespDeduction("Federal tax",  3696.15, "USD"));
        deductions.add(getRespDeduction("State tax",  1037.21, "USD"));
        deductions.add(getRespDeduction("Local tax",  0.0, "USD"));

        return deductions;
    }

    private static RespDeduction getRespDeduction(String deductionCode, double amount, String currencyCode) {
        RespDeduction deduction = new RespDeduction();
        RespDeductionCode deductionCodeObj = new RespDeductionCode();
        deductionCodeObj.setName(deductionCode);
        deduction.setDeductionCode(deductionCodeObj);

        RespDeductionAmount deductionAmount = new RespDeductionAmount();
        deductionAmount.setAmount(amount);
        deductionAmount.setCurrencyCode(currencyCode);
        deduction.setDeductionAmount(deductionAmount);
        return deduction;
    }

    private static RespPayAmount getRespPayAmount() {
        RespPayAmount payAmount = new RespPayAmount();
        payAmount.setGrossPay(getRespPayDetail(17307.69,"USD"));
        payAmount.setBasePay(getRespPayDetail(2307.69, "USD"));
        payAmount.setOverTimePay(getRespPayDetail(0.0,"USD"));
        payAmount.setBonusPay(getRespPayDetail(15000.0,"USD"));
        payAmount.setOtherPay(getRespPayDetail(0.0,"USD"));
        return payAmount;
    }

    private static RespPayAmount getRespPayAmount1() {
        RespPayAmount payAmount = new RespPayAmount();
        payAmount.setGrossPay(getRespPayDetail(2307.69,"USD"));
        payAmount.setBasePay(getRespPayDetail(2307.69, "USD"));
        payAmount.setOverTimePay(getRespPayDetail(0.0,"USD"));
        payAmount.setBonusPay(getRespPayDetail(0.0,"USD"));
        payAmount.setOtherPay(getRespPayDetail(0.0,"USD"));
        return payAmount;
    }

    private static RespPayDetail getBasePayRate() {
        RespPayDetail basePayRate = new RespPayDetail();
        basePayRate.setAmount(2307.69);
        basePayRate.setCurrencyCode("USD");
        return basePayRate;
    }

    private static RespPayDetail getRespPayDetail(double amount, String CurrencyCode) {
        RespPayDetail basePayRate = new RespPayDetail();
        basePayRate.setAmount(amount);
        basePayRate.setCurrencyCode(CurrencyCode);
        return basePayRate;
    }

    private static PaymentHistory.PayPeriod getPayPeriod(String startDate, String endDate) {
        PaymentHistory.PayPeriod payPeriod = new PaymentHistory().new PayPeriod();
        payPeriod.setStartDate(startDate);
        payPeriod.setEndDate(endDate);
        return payPeriod;
    }

    private static EmployerAddress getEmployeeAddress() {
        EmployerAddress employerAddress = new EmployerAddress();
        employerAddress.setLineOne("52WMre t");
        employerAddress.setLineTwo("");
        employerAddress.setLineThree("");
        employerAddress.setCityName("Gogtw");
        employerAddress.setState("DE");
        employerAddress.setCountryCode("US");
        employerAddress.setPostalCode("99999");

        return employerAddress;
    }

    private static WorkStatus getWorkStatus() {
        WorkStatus workStatus = new WorkStatus();
        workStatus.setCode("A");
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


