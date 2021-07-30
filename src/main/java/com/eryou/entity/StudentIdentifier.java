package com.eryou.entity;

public class StudentIdentifier {
    // 学生的主键
    private Integer studentId;

    // 学生的身份证号
    private String cardId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "StudentIdentifier{" +
                "studentId=" + studentId +
                ", cardId='" + cardId + '\'' +
                '}';
    }
}
