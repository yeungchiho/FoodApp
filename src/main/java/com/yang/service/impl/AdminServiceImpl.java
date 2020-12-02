package com.yang.service.impl;

import com.yang.dao.IAdminDAO;
import com.yang.domain.Admin;
import com.yang.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService{
    @Autowired
    private IAdminDAO iAdminDAO;

    @Override
    public Admin findById(String id) throws Exception{
        return iAdminDAO.findById(id);
    }
    @Override
    public boolean login(Admin admin) throws Exception {
        return  iAdminDAO.checkLogin(admin) != null;
    }

    @Override
    public void registerAdmin(Admin admin) throws Exception{
        iAdminDAO.register(admin);
    }


    @Override
    public boolean findByUsername(String username) throws Exception {
        return iAdminDAO.findByUsername(username) != null;
    }

    @Override
    public Admin findByPhone(String phone) throws Exception {
        return  iAdminDAO.findByPhone(phone);
    }

}
