package com.yang.dao;

import com.yang.domain.Collection;
import com.yang.domain.Product;
import com.yang.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICollectionDAO {
    @Select("select * from collection")
    public List<Collection> findALL() throws Exception;

    @Select("select collection_rid from collection")
    public List<Collection> findByProductId(int id) throws Exception;

    @Select("select collection_uid from collection")
    public List<Collection> findByUserId(int id) throws Exception;

    @Select("select collection_product from collection")
    public List<Collection> findByProductname(String productname) throws Exception;

    @Insert("insert into collection (collection_uid,collection_rid,collection_createtime,collection_product) " +
            "values (#{collection_uid},#{collection_rid},#{collection_createtime},#{collection_product})")
    public void addCollection(Collection collection) throws  Exception;

    @Delete("delete from collection where collection_id=#{collection_id}")
    public boolean deleteCollection(int id) throws Exception;
}
