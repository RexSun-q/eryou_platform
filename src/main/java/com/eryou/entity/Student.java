package com.eryou.entity;

import java.util.Date;

public class Student {

    // 自然id 主键
    private Integer studentId;

    // 学生姓名
    private String studentName;

    // 学生性别
    private String studentGender;

    // 学生出生日期
    private Date birth;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
