package com.yang.domain;

import java.io.Serializable;
import java.sql.Date;

public class Collection implements Serializable {

    private Integer collection_id;
    private Integer collection_rid;
    private Integer collection_uid;
    private Date collection_createtime;
    private String collection_product;

    public String getCollection_product() {
        return collection_product;
    }

    public void setCollection_product(String collection_product) {
        this.collection_product = collection_product;
    }

    public Integer getCollection_id() {
        return collection_id;
    }

    public void setCollection_id(Integer collection_id) {
        this.collection_id = collection_id;
    }

    public Integer getCollection_rid() {
        return collection_rid;
    }

    public void setCollection_rid(Integer collection_rid) {
        this.collection_rid = collection_rid;
    }

    public Integer getCollection_uid() {
        return collection_uid;
    }

    public void setCollection_uid(Integer collection_uid) {
        this.collection_uid = collection_uid;
    }

    public Date getCollection_createtime() {
        return collection_createtime;
    }

    public void setCollection_createtime(Date collection_createtime) {
        this.collection_createtime = collection_createtime;
    }



    @Override
    public String toString() {
        return "Collection{" +
                "collection_id=" + collection_id +
                ", collection_rid=" + collection_rid +
                ", collection_uid=" + collection_uid +
                ", collection_createtime=" + collection_createtime +
                ", collection_product='" + collection_product + '\'' +
                '}';
    }
}
