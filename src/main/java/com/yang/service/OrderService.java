package com.yang.service;

import com.yang.domain.Ordered;
import java.util.List;

public interface OrderService {
    public List<Ordered> findAll() throws Exception;

    public void addOrder(Ordered ordered) throws  Exception;

    public  boolean deleteOrder(int id) throws  Exception;

    public List<Ordered> findByProductId(int id) throws Exception;

    public List<Ordered> findByUserId(int id) throws Exception;

    public Ordered findById(int id) throws  Exception;

}
