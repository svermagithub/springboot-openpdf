package com.pdf.example.response;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class CommonUtils {


    public static String getFormattedDate(String date) {
        if (date != null && date.length() == 7)
            return date.substring(0, 2) + "/0" + date.substring(2, 3) + "/" + date.substring(3, 6);
        if (date != null && date.length() == 8)
            return date.substring(0, 2) + "/" + date.substring(2, 4) + "/" + date.substring(4, 8);
        return "N/A";
    }

    public static Date getFormattedDateObject(String date) {
        date = getFormattedDate(date);
        Date dateObj = null;
        try {
            dateObj = new SimpleDateFormat("dd/mm/yyyy").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateObj;
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

    public static String sumOfTenure(String positionTenure1, String positionTenure2) {

        int years1 = Optional.ofNullable(positionTenure1).map(pt -> Integer.parseInt(StringUtils.substringBetween(pt, "P", "Y"))).orElse(0);
        int months1 = Optional.ofNullable(positionTenure1).map(pt -> Integer.parseInt(StringUtils.substringBetween(pt, "Y", "M"))).orElse(0);
        int days1 = Optional.ofNullable(positionTenure1).map(pt -> Integer.parseInt(StringUtils.substringBetween(pt, "M", "D"))).orElse(0);

        int years2 = Optional.ofNullable(positionTenure2).map(pt -> Integer.parseInt(StringUtils.substringBetween(pt, "P", "Y"))).orElse(0);
        int months2 = Optional.ofNullable(positionTenure2).map(pt -> Integer.parseInt(StringUtils.substringBetween(pt, "Y", "M"))).orElse(0);
        int days2 = Optional.ofNullable(positionTenure2).map(pt -> Integer.parseInt(StringUtils.substringBetween(pt, "M", "D"))).orElse(0);

        int days = days1 + days2;
        int months = months1 + months2;
        int years = years1 + years2;

        if(days > 30){
            months = months + (days / 30) ;
            days = days % 30;
        }

        if(months > 12) {
            years = years + (months / 12);
            months = months % 12;
        }

        return "P"+years+"Y"+months+"M"+days+"D";
    }

}
