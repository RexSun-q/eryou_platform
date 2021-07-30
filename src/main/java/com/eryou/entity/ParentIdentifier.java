package com.eryou.entity;

public class ParentIdentifier {
    // 家长的主键
    private Integer parentId;

    // 家长的身份证号
    private String cardId;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "ParentIdentifier{" +
                "parentId=" + parentId +
                ", cardId='" + cardId + '\'' +
                '}';
    }
}
