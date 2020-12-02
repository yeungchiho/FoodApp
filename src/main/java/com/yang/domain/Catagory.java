package com.yang.domain;

import java.io.Serializable;

public class Catagory implements Serializable{

    private Integer catagory_id;
    private String catagory_name;

    public Integer getCatogory_id() {
        return catagory_id;
    }

    public void setCatogory_id(Integer catogory_id) {
        this.catagory_id = catogory_id;
    }

    public String getCatagory_name() {
        return catagory_name;
    }

    public void setCatagory_name(String catagory_name) {
        this.catagory_name = catagory_name;
    }

    @Override
    public String toString() {
        return "Catagory{" +
                "catagory_id=" + catagory_id +
                ", catagory_name='" + catagory_name + '\'' +
                '}';
    }
}
