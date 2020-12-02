package com.yang.domain;

import java.io.Serializable;

public class Productimage implements Serializable {
    private Integer productimage_id;
    private Integer productimage_rid;
    private String productimage_type;

    public Integer getProductimage_id() {
        return productimage_id;
    }

    public void setProductimage_id(Integer productimage_id) {
        this.productimage_id = productimage_id;
    }

    public Integer getProductimage_rid() {
        return productimage_rid;
    }

    public void setProductimage_rid(Integer productimage_rid) {
        this.productimage_rid = productimage_rid;
    }

    public String getProductimage_type() {
        return productimage_type;
    }

    public void setProductimage_type(String productimage_type) {
        this.productimage_type = productimage_type;
    }

    @Override
    public String toString() {
        return "Productimage{" +
                "productimage_id=" + productimage_id +
                ", productimage_rid=" + productimage_rid +
                ", productimage_type='" + productimage_type + '\'' +
                '}';
    }
}
