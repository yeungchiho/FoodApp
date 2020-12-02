package com.yang.domain;

import java.io.Serializable;
import java.sql.Date;

public class Review implements Serializable {
    private Integer review_id;
    private Integer review_rid;
    private Integer review_uid;
    private String review_comment;
    private Date review_createtime;

    public Integer getReview_id() {
        return review_id;
    }

    public void setReview_id(Integer review_id) {
        this.review_id = review_id;
    }

    public Integer getReview_rid() {
        return review_rid;
    }

    public void setReview_rid(Integer review_rid) {
        this.review_rid = review_rid;
    }

    public Integer getReview_uid() {
        return review_uid;
    }

    public void setReview_uid(Integer review_uid) {
        this.review_uid = review_uid;
    }

    public String getReview_comment() {
        return review_comment;
    }

    public void setReview_comment(String review_comment) {
        this.review_comment = review_comment;
    }

    public Date getReview_createtime() {
        return review_createtime;
    }

    public void setReview_createtime(Date review_createtime) {
        this.review_createtime = review_createtime;
    }

    @Override
    public String toString() {
        return "Review{" +
                "review_id=" + review_id +
                ", review_rid=" + review_rid +
                ", review_uid=" + review_uid +
                ", review_comment='" + review_comment + '\'' +
                ", review_createtime=" + review_createtime +
                '}';
    }
}
