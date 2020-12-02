package com.yang.controller;

import com.yang.domain.*;
import com.yang.service.CollectionService;
import com.yang.service.ProductService;
import com.yang.service.AdminService;
import com.yang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("collection")
public class CollectionController {
    @Autowired
    private CollectionService collectionService;

    @RequestMapping("/addCollection")
    public ModelAndView addCollection(Collection collection, HttpSession httpSession) throws Exception{
        ModelAndView mv = new ModelAndView();
        User user = (User) httpSession.getAttribute("user1");
        Product product = (Product) httpSession.getAttribute("product");
        java.util.Date date = new java.util.Date();
        java.sql.Date sql_date = new java.sql.Date(date.getTime());
        collection.setCollection_createtime(sql_date);
        collection.setCollection_rid(product.getProduct_id());
        collection.setCollection_uid(user.getUser_id());
        collection.setCollection_product(product.getProduct_name());
        collectionService.addCollection(collection);
        httpSession.setAttribute("collection",collection);
        mv.addObject("collection",collection);
        mv.setViewName("collectioncenter");
        return mv;
    }
}
