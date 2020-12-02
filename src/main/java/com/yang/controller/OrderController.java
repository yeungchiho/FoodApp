package com.yang.controller;

import com.yang.domain.*;
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
@RequestMapping("/ordered")
public class OrderController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderService orderService;
    @RequestMapping("/addOrder")
    public ModelAndView addOrder(Ordered ordered, HttpSession session) throws Exception{
        ModelAndView mv=new ModelAndView();
        User user= (User) session.getAttribute("user1");
        Product product= (Product) session.getAttribute("product");
        int count=product.getProduct_saleCount();
        product.setProduct_saleCount(count+1);
        System.out.println(user);
        System.out.println(product);
        java.util.Date date = new java.util.Date();
        java.sql.Date sql_date = new java.sql.Date(date.getTime());
        ordered.setOrder_createtime(sql_date);
        ordered.setOrder_user_id(user.getUser_id());
        ordered.setOrder_product(product.getProduct_name());
        ordered.setOrder_product_id(product.getProduct_id());
        productService.updateSaleCount(product);
        orderService.addOrder(ordered);
        session.setAttribute("ordered" ,ordered);
        mv.addObject("ordered",ordered);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("/deleteOrder")
    public ModelAndView deleteOrder(Ordered ordered,HttpSession httpSession) throws Exception{
        ModelAndView mv = new ModelAndView();
        return mv;
    }
}
