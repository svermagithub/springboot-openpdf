package com.pdf.example.response;

import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

public class CommonUtils {


    public static String getFormattedDate(String date) {
        if (date != null && date.length() == 7)
            return date.substring(0, 2) + "/0" + date.substring(2, 3) + "/" + date.substring(3, 6);
        if (date != null && date.length() == 8)
            return date.substring(0, 2) + "/" + date.substring(2, 4) + "/" + date.substring(4, 8);
        return "N/A";
    }

    public static String formatTenure(String positionTenure) {
        return Optional.ofNullable(positionTenure).map(pt -> {
            String years = StringUtils.substringBetween(pt, "P", "Y") + " Years, ";
            String months = StringUtils.substringBetween(pt, "Y", "M") + " Months";
            if(years.equals("0"))
                return months;
            else
                return years + months;

        }).orElse(positionTenure);

    }
}
