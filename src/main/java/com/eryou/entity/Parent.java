package com.eryou.entity;

public class Parent {

    // 自然id 主键
    private Integer parentId;

    // 家长姓名
    private String parentName;

    // 家长性别
    private String parentGender;

    // 孩子的主键id
    private Integer childId;

    // 特殊职业代码
    private Integer categoryId;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentGender() {
        return parentGender;
    }

    public void setParentGender(String parentGender) {
        this.parentGender = parentGender;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "parentId=" + parentId +
                ", parentName='" + parentName + '\'' +
                ", parentGender='" + parentGender + '\'' +
                ", childId=" + childId +
                ", categoryId=" + categoryId +
                '}';
    }
}
