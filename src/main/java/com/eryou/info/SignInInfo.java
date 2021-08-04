package com.eryou.info;

import java.util.Date;

public class SignInInfo {
    private String studentName;
    private String studentIdentifier;
    private String studentGender;
    private Date studentBirth;
    private String fatherName;
    private String fatherIdentifier;
    private String motherName;
    private String motherIdentifier;
    private boolean agree;

    public boolean isAgree() {
        return agree;
    }

    public void setAgree(boolean agree) {
        this.agree = agree;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentIdentifier() {
        return studentIdentifier;
    }

    public void setStudentIdentifier(String studentIdentifier) {
        this.studentIdentifier = studentIdentifier;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public Date getStudentBirth() {
        return studentBirth;
    }

    public void setStudentBirth(Date studentBirth) {
        this.studentBirth = studentBirth;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherIdentifier() {
        return fatherIdentifier;
    }

    public void setFatherIdentifier(String fatherIdentifier) {
        this.fatherIdentifier = fatherIdentifier;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherIdentifier() {
        return motherIdentifier;
    }

    public void setMotherIdentifier(String motherIdentifier) {
        this.motherIdentifier = motherIdentifier;
    }

    @Override
    public String toString() {
        return "SignInInfo{" +
                "studentName='" + studentName + '\'' +
                ", studentIdentifier='" + studentIdentifier + '\'' +
                ", studentGender='" + studentGender + '\'' +
                ", studentBirth=" + studentBirth +
                ", fatherName='" + fatherName + '\'' +
                ", fatherIdentifier='" + fatherIdentifier + '\'' +
                ", motherName='" + motherName + '\'' +
                ", motherIdentifier='" + motherIdentifier + '\'' +
                '}';
    }
}
