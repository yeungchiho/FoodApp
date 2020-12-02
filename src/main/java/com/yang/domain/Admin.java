package com.yang.domain;

import java.io.Serializable;

public class Admin implements Serializable {
    private Integer admin_id;
    private String admin_name;
    private String admin_username;
    private String admin_password;
    private String admin_phone;
    private String admin_alipay;

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_username() {
        return admin_username;
    }

    public void setAdmin_username(String admin_username) {
        this.admin_username = admin_username;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public String getAdmin_phone() {
        return admin_phone;
    }

    public void setAdmin_phone(String admin_phone) {
        this.admin_phone = admin_phone;
    }

    public String getAdmin_alipay() {
        return admin_alipay;
    }

    public void setAdmin_alipay(String admin_alipay) {
        this.admin_alipay = admin_alipay;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin_id=" + admin_id +
                ", admin_name='" + admin_name + '\'' +
                ", admin_username='" + admin_username + '\'' +
                ", admin_password='" + admin_password + '\'' +
                ", admin_phone='" + admin_phone + '\'' +
                ", admin_alipay='" + admin_alipay + '\'' +
                '}';
    }
}
