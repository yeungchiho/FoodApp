package com.yang.dao;

import com.yang.domain.Ordered;
import com.yang.domain.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderDAO {
    @Select("select * from ordered")
    public List<Ordered> findAll() throws Exception;

    @Select("select * from ordered where order_id=#{order_id}")
    public Ordered findById(int id) throws  Exception;


    @Select("select  *from ordered where order_user_id=#{order_user_id}")
    public List<Ordered> findByUserId(int id) throws Exception;


    @Select("select * from ordered where oorder_product_id=#{order_product_id}")
    public List<Ordered> findByProductId(int id) throws Exception;


    @Insert("insert into ordered (order_user_id,order_product_id,order_receiver,order_phone,order_num,order_product,order_createtime) " +
            "values (#{order_user_id},#{order_product_id},#{order_receiver},#{order_phone},#{order_num},#{order_product},#{order_createtime" +
            "})")
    public void addOrder(Ordered ordered) throws  Exception;

    @Delete("delete from ordered where order_id=#{order_id}")
    public  boolean deleteOrder(int id) throws  Exception;

}
