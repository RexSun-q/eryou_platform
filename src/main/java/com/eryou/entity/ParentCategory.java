package com.eryou.entity;

public class ParentCategory {

    // 职业代码
    private Integer categoryId;

    // 职业名称
    private String jobName;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return "ParentCategory{" +
                "categoryId=" + categoryId +
                ", jobName='" + jobName + '\'' +
                '}';
    }
}
