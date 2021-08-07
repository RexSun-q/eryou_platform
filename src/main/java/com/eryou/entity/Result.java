package com.eryou.entity;

public class Result {


    private Integer resultId;

    private String studentId;

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultId=" + resultId +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
