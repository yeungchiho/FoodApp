package com.yang.service.impl;


import com.yang.dao.IUserDAO;
import com.yang.domain.User;
import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private IUserDAO iUserDAO;

    @Override
    public User findById(String id) throws Exception {
        return  iUserDAO.findById(id);
    }

    @Override
    public boolean login(User user) throws Exception {
        return  iUserDAO.checkLogin(user) != null;
    }

    @Override
    public void registerUser(User user) throws Exception{
        iUserDAO.register(user);
    }


    @Override
    public boolean findByUsername(String username) throws Exception {
        return iUserDAO.findByUsername(username) != null;
    }

    @Override
    public User findByPhone(String phone) throws Exception {
        return  iUserDAO.findByPhone(phone);
    }





}
