package com.yang.service;

import com.yang.domain.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ProductService {
    public List<Product> findAll() throws Exception;

    public  Product findOne(int id) throws Exception;

    public  boolean deleteProduct(int id) throws  Exception;

    public void  addProduct(Product product) throws Exception;

    public List<Product> findProductByName(String name,int id) throws  Exception;

    public  void updateSaleCount(Product product) throws Exception;

    public List<Product> findProductBySubtitle(String name) throws  Exception;
}