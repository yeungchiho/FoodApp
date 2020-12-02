package com.yang.service;

import com.yang.domain.Collection;

import java.util.List;

public interface CollectionService {
    public List<Collection> findAll() throws Exception;

    public List<Collection> findByProductId(int id) throws Exception;

    public List<Collection> findByUserId(int id) throws Exception;

    public void addCollection(Collection collection) throws  Exception;

    public boolean deleteCollection(int id) throws Exception;

    public List<Collection> findByProductname(String productname) throws Exception;
}
