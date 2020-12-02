package com.yang.service.impl;


import com.yang.domain.Collection;
import com.yang.dao.ICollectionDAO;
import com.yang.service.CollectionService;
import org.apache.ibatis.annotations.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("collectionService")
public class CollectionServiceImpl implements CollectionService{
    @Autowired
    private ICollectionDAO iCollectionDAO;


    @Override
    public List<Collection> findAll() throws Exception {
        return iCollectionDAO.findALL();
    }

    @Override
    public List<Collection> findByProductId(int id) throws Exception {
        return null;
    }

    @Override
    public List<Collection> findByUserId(int id) throws Exception {
        return null;
    }

    @Override
    public void addCollection(Collection collection) throws Exception {
        iCollectionDAO.addCollection(collection);
    }

    @Override
    public boolean deleteCollection(int id) throws Exception {
        return false;
    }

    @Override
    public List<Collection> findByProductname(String productname) throws Exception{
        return null;
    }
}
