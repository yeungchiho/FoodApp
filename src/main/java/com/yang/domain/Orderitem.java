package com.yang.domain;

import java.io.Serializable;

public class Orderitem implements Serializable {
    private Integer orderitem_id;
    private Integer orderitem_rid;
    private Integer orderitem_uid;
    private Integer orderitem_oid;
    private Integer orderitem_number;

    public Integer getOrderitem_id() {
        return orderitem_id;
    }

    public void setOrderitem_id(Integer orderitem_id) {
        this.orderitem_id = orderitem_id;
    }

    public Integer getOrderitem_rid() {
        return orderitem_rid;
    }

    public void setOrderitem_rid(Integer orderitem_rid) {
        this.orderitem_rid = orderitem_rid;
    }

    public Integer getOrderitem_uid() {
        return orderitem_uid;
    }

    public void setOrderitem_uid(Integer orderitem_uid) {
        this.orderitem_uid = orderitem_uid;
    }

    public Integer getOrderitem_oid() {
        return orderitem_oid;
    }

    public void setOrderitem_oid(Integer orderitem_oid) {
        this.orderitem_oid = orderitem_oid;
    }

    public Integer getOrderitem_number() {
        return orderitem_number;
    }

    public void setOrderitem_number(Integer orderitem_number) {
        this.orderitem_number = orderitem_number;
    }

    @Override
    public String toString() {
        return "Orderitem{" +
                "orderitem_id=" + orderitem_id +
                ", orderitem_rid=" + orderitem_rid +
                ", orderitem_uid=" + orderitem_uid +
                ", orderitem_oid=" + orderitem_oid +
                ", orderitem_number=" + orderitem_number +
                '}';
    }
}
