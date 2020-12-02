package com.yang.service;

import com.yang.domain.Admin;

public interface AdminService {

    Admin findById(String id) throws Exception;

    public boolean login(Admin admin) throws Exception;

    void registerAdmin(Admin admin)throws Exception;

    public boolean findByUsername(String username) throws Exception;

    public Admin findByPhone(String phone) throws Exception;
}
