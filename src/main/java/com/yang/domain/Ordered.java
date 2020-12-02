package com.yang.domain;

import java.io.Serializable;
import java.sql.Date;

public class Ordered implements Serializable {
    private Integer order_id;
    private String order_receiver;
    private Integer order_num;
    private Date order_createtime;
    private Integer order_user_id;
    private Integer order_product_id;
    private String order_product;
    private String order_phone;

    @Override
    public String toString() {
        return "Ordered{" +
                "order_id=" + order_id +
                ", order_receiver='" + order_receiver + '\'' +
                ", order_num=" + order_num +
                ", order_createtime=" + order_createtime +
                ", order_user_id=" + order_user_id +
                ", order_product_id=" + order_product_id +
                ", order_product='" + order_product + '\'' +
                ", order_phone='" + order_phone + '\'' +
                '}';
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getOrder_receiver() {
        return order_receiver;
    }

    public void setOrder_receiver(String order_receiver) {
        this.order_receiver = order_receiver;
    }

    public Integer getOrder_num() {
        return order_num;
    }

    public void setOrder_num(Integer order_num) {
        this.order_num = order_num;
    }

    public Date getOrder_createtime() {
        return order_createtime;
    }

    public void setOrder_createtime(Date order_createtime) {
        this.order_createtime = order_createtime;
    }

    public Integer getOrder_user_id() {
        return order_user_id;
    }

    public void setOrder_user_id(Integer order_user_id) {
        this.order_user_id = order_user_id;
    }

    public Integer getOrder_product_id() {
        return order_product_id;
    }

    public void setOrder_product_id(Integer order_product_id) {
        this.order_product_id = order_product_id;
    }

    public String getOrder_product() {
        return order_product;
    }

    public void setOrder_product(String order_product) {
        this.order_product = order_product;
    }

    public String getOrder_phone() {
        return order_phone;
    }

    public void setOrder_phone(String order_phone) {
        this.order_phone = order_phone;
    }
}
