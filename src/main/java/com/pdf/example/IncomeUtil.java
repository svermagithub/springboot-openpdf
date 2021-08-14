package com.pdf.example;

public class IncomeUtil {

    public static boolean isEnhancedReportType(String reportType) {
        return (isPremiumOrVOIE(reportType) || isCoreOrVOE(reportType) );

    }


    public static boolean isPremiumOrVOIE(String reportType) {
        return (IncomeandEmploymentConstants.REPORT_TYPE_PREMIUM.equalsIgnoreCase(reportType)
                || IncomeandEmploymentConstants.REPORT_TYPE_REVERIFY_VOIE.equalsIgnoreCase(reportType)
                || IncomeandEmploymentConstants.REPORT_TYPE_PREMIUM_REVERIFICATION_VOIE.equalsIgnoreCase(reportType));

    }
    public static boolean isCoreOrVOE(String reportType) {
        return (IncomeandEmploymentConstants.REPORT_TYPE_ENHANCED_CORE.equalsIgnoreCase(reportType)
                || IncomeandEmploymentConstants.REPORT_TYPE_REVERIFY_VOE.equalsIgnoreCase(reportType)
                || IncomeandEmploymentConstants.REPORT_TYPE_PREMIUM_REVERIFICATION_VOE.equalsIgnoreCase(reportType));

    }
    public static boolean isReverify(String reportType) {
        return (IncomeandEmploymentConstants.REPORT_TYPE_REVERIFY_VOIE.equalsIgnoreCase(reportType)
                || IncomeandEmploymentConstants.REPORT_TYPE_PREMIUM_REVERIFICATION_VOIE.equalsIgnoreCase(reportType)
                || IncomeandEmploymentConstants.REPORT_TYPE_REVERIFY_VOE.equalsIgnoreCase(reportType)
                || IncomeandEmploymentConstants.REPORT_TYPE_PREMIUM_REVERIFICATION_VOE.equalsIgnoreCase(reportType));

    }
}