package com.yang.service.impl;

import com.yang.dao.IProductDAO;
import com.yang.domain.Product;
import com.yang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private IProductDAO iProductDAO;
    @Override
    public List<Product> findAll() throws Exception {
        return iProductDAO.findAll();
    }

    @Override
    public Product findOne(int id) throws Exception {
        return iProductDAO.findOne(id);
    }

    @Override
    public boolean deleteProduct(int id) throws Exception {
        return iProductDAO.deleteProduct(id);
    }

    @Override
    public void addProduct(Product product) throws Exception {
        iProductDAO.addProduct(product);
    }

    @Override
    public List<Product> findProductByName(String name, int id) throws Exception {
        return iProductDAO.findProductByName(name,id);
    }

    @Override
    public  void updateSaleCount(Product product) throws Exception{
        iProductDAO.updateSaleCount(product);
    }

    @Override
    public List<Product> findProductBySubtitle(String name) throws Exception {
        return iProductDAO.findProductBySubtitle(name);
    }
}

