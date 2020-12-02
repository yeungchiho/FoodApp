package com.yang.service.impl;

import com.yang.domain.Ordered;
import com.yang.dao.IOrderDAO;
import com.yang.service.OrderService;
import org.apache.ibatis.annotations.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private IOrderDAO iOrderDAO;

    @Override
    public List<Ordered> findAll() throws Exception {
        return iOrderDAO.findAll();
    }

    @Override
    public void addOrder(Ordered ordered) throws Exception {
         iOrderDAO.addOrder(ordered);
    }

    @Override
    public boolean deleteOrder(int id) throws Exception {
        return false;
    }

    @Override
    public List<Ordered> findByProductId(int id) throws Exception {
        return iOrderDAO.findByProductId(id);
    }

    @Override
    public List<Ordered> findByUserId(int id) throws Exception {
        return iOrderDAO.findByUserId(id);
    }

    @Override
    public Ordered findById(int id) throws Exception {
        return null;
    }


}
