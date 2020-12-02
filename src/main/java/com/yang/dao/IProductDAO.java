package com.yang.dao;

import com.yang.domain.Product;
import javafx.geometry.Pos;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface IProductDAO {



        @Select("select * from product")
        public List<Product> findAll() throws Exception;

        @Select("select * from product where ")
        public List<Product> findUnPublish(String state) throws Exception;

        @Select("select * from Product where product_id=#{product_id}")
        public  Product findOne(int id) throws Exception;

        @Delete("delete from product where product_id=#{product_id}")
        public  boolean deleteProduct(int id) throws  Exception;


        @Insert("insert into product (product_name,product_aid,product_createtime,product_subtitle,product_address,product_saleCount)"+
                "values(#{product_name},#{product_aid},#{product_createtime},#{product_subtitle},#{product_address},#{product_saleCount})")
        public void  addProduct(Product product ) throws Exception;

        @Select("select * from product where name like '%${subtitle}%' ")
        public List<Product> findProductByName(String name,int id) throws  Exception;

        @Select("select * from product where product_subtitle=#{product_subtitle} ")
        public List<Product> findProductBySubtitle(String name) throws  Exception;

        @Update("update product set product_saleCount=#{product_saleCount} where product_id=#{product_id}")
        public  void updateSaleCount(Product product) throws Exception;

//    public updatePositionPublishState(Position position)


}
