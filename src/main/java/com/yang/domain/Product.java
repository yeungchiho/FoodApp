package com.yang.domain;

import java.io.Serializable;
import java.sql.Date;

public class Product implements Serializable,Comparable<Product>{
    private Integer product_id;
    private Integer product_cid;
    private String product_name;
    private Date product_createtime;
    private String product_subtitle;
    private Integer product_saleCount;
    private Integer product_comCount;
    private String product_address;
    private Integer product_aid;

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getProduct_cid() {
        return product_cid;
    }

    public void setProduct_cid(Integer product_cid) {
        this.product_cid = product_cid;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Date getProduct_createtime() {
        return product_createtime;
    }

    public void setProduct_createtime(Date product_createtime) {
        this.product_createtime = product_createtime;
    }

    public String getProduct_subtitle() {
        return product_subtitle;
    }

    public void setProduct_subtitle(String product_subtitle) {
        this.product_subtitle = product_subtitle;
    }

    public Integer getProduct_saleCount() {
        return product_saleCount;
    }

    public void setProduct_saleCount(Integer product_saleCount) {
        this.product_saleCount = product_saleCount;
    }

    public Integer getProduct_comCount() {
        return product_comCount;
    }

    public void setProduct_comCount(Integer product_comCount) {
        this.product_comCount = product_comCount;
    }

    public String getProduct_address() {
        return product_address;
    }

    public void setProduct_address(String product_address) {
        this.product_address = product_address;
    }

    public Integer getProduct_aid() {
        return product_aid;
    }

    public void setProduct_aid(Integer product_aid) {
        this.product_aid = product_aid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_cid=" + product_cid +
                ", product_name='" + product_name + '\'' +
                ", product_createtime=" + product_createtime +
                ", product_subtitle='" + product_subtitle + '\'' +
                ", product_saleCount=" + product_saleCount +
                ", product_comCount=" + product_comCount +
                ", product_address='" + product_address + '\'' +
                ", product_aid=" + product_aid +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        return o.getProduct_saleCount()-this.product_saleCount;
    }
}
