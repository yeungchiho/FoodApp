package com.yang.dao;

import com.yang.domain.Admin;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.jdbc.Sql;
import org.apache.ibatis.annotations.Select;

@Repository
public interface IAdminDAO {


    @Select("select * from admin where admin_username=#{admin_username}")
    @Results({
            @Result(id = true,property = "admin_id",column = "admin_id"),
            @Result(property = "admin_username",column = "admin_username"),
            @Result(property = "admin_name",column = "admin_name"),
            @Result(property = "admin_phone",column = "admin_phone"),
            @Result(property = "admin_password",column = "admin_password"),
            @Result(property = "admin_alipay" ,column = "admin_alipay")
    })
    public Admin findByUsername(String username) throws Exception;

    @Select("select * from admin where admin_phone=#{admin_phone} and admin_password=#{admin_password}")
    public Admin checkLogin(Admin admin) throws  Exception;

    @Insert("insert into admin(admin_username,admin_password,admin_phone,admin_alipay,admin_name) " +
            "values(#{admin_username},#{admin_password},#{admin_phone},#{admin_alipay},#{admin_name})")
    public void register(Admin admin) throws Exception;

    @Select("select * from admin where id=#{admin_id}")
    @Results({
            @Result(id = true,property = "admin_id",column = "admin_id"),
            @Result(property = "admin_username",column = "admin_username"),
            @Result(property = "admin_phone",column = "admin_phone")
    })
    Admin findById(String id) throws Exception;

    @Select("select * from admin where admin_phone=#{admin_phone}")
    public Admin findByPhone(String phone) throws Exception;
}
