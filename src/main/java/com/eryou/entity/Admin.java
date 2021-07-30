package com.eryou.entity;

public class Admin {

    // 管理员自然键
    private Integer id;

    // name
    private String name;

    // 邮箱
    private String email;

    // 密码
    private String password;

    // 授权人
    private Integer authorisedBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAuthorisedBy() {
        return authorisedBy;
    }

    public void setAuthorisedBy(Integer authorisedBy) {
        this.authorisedBy = authorisedBy;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", authorisedBy=" + authorisedBy +
                '}';
    }
}
