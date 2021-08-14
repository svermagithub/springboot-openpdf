package com.pdf.example.response;

public class RespName {

    private String lastName;
    private String firstName;
    private String middleName;
    private String generationCode;
    public RespName(){
    }
    public RespName(String lastName,String firstName,String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getGenerationCode() {
        return generationCode;
    }
    public void setGenerationCode(String generationCode) {
        this.generationCode = generationCode;
    }

}