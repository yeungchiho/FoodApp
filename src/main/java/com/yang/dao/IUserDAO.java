package com.yang.dao;

//用户的持久层接口

import com.yang.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.jdbc.Sql;
import org.apache.ibatis.annotations.Select;

@Repository
public interface IUserDAO {



    @Select("select * from user where user_username=#{user_username}")
    @Results({
            @Result(id = true,property = "user_id",column = "user_id"),
            @Result(property = "user_username",column = "user_username"),
            @Result(property = "user_email",column = "user_email"),
            @Result(property = "user_phone",column = "user_phone"),
            @Result(property = "roles",column = "user_role-id")
    })
    public User findByUsername(String username) throws Exception;

    @Select("select * from user where user_phone=#{user_phone} and user_password=#{user_password}")
    public User checkLogin(User user) throws  Exception;
    @Insert("insert into user(user_username,user_password,user_phone) " +
            "values(#{user_username},#{user_password},#{user_phone})")
    public void register(User user) throws Exception;
    @Select("select * from user where id=#{user_id}")
    @Results({
            @Result(id = true,property = "user_id",column = "user_id"),
            @Result(property = "user_username",column = "user_username"),
            @Result(property = "user_phone",column = "user_phone"),
            @Result(property = "roles",column = "user_role-id")
    })
    User findById(String id) throws Exception;

    @Select("select * from user where user_phone=#{user_phone}")
    public User findByPhone(String phone) throws Exception;
}
