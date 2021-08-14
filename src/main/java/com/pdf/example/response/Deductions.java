package com.pdf.example.response;

public class Deductions {
    private Double current;
    private String deduction;
    private Double ytdTotal;

    public Double getCurrent() {
        return current;
    }

    public void setCurrent(Double current) {
        this.current = current;
    }

    public String getDeduction() {
        return deduction;
    }

    public void setDeduction(String deduction) {
        this.deduction = deduction;
    }

    public Double getYtdTotal() {
        return ytdTotal;
    }

    public void setYtdTotal(Double ytdTotal) {
        this.ytdTotal = ytdTotal;
    }
}
