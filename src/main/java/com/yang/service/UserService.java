package com.yang.service;


import com.yang.domain.User;



public interface UserService {

    User findById(String id) throws Exception;

    public boolean login(User user) throws Exception;

    void registerUser(User user)throws Exception;

    public boolean findByUsername(String username) throws Exception;

    public User findByPhone(String phone) throws Exception;


}
