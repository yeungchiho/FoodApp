package com.yang.controller;

import com.yang.domain.Admin;
import com.yang.domain.Product;
import com.yang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/addProduct")
    public ModelAndView addProduct(Product product, HttpSession session) throws Exception{
        ModelAndView mv=new ModelAndView();
        Admin admin = (Admin) session.getAttribute("admin1");
        java.util.Date date = new java.util.Date();
        java.sql.Date sql_date = new java.sql.Date(date.getTime());
        product.setProduct_createtime(sql_date);
        product.setProduct_aid(admin.getAdmin_id());
        product.setProduct_saleCount(0);
        productService.addProduct(product);
        session.setAttribute("product",product);
        mv.addObject("product",product);
        mv.setViewName("admin_product");
        return mv;
    }

    @RequestMapping("/findAllProduct")
    public ModelAndView findAllPosition(HttpSession session) throws Exception{
        ModelAndView mv=new ModelAndView();
        java.util.Date date = new java.util.Date();
//        java.sql.Date sql_date = new java.sql.Date(date.getTime());
//        position.setCreate_time(sql_date);
//        position.setUpdate_time(sql_date);
        List<Product> productList=productService.findAll();
        session.setAttribute("productList",productList);
        mv.addObject("productList",productList);
        mv.setViewName("admin_product");
        return mv;
    }
    @RequestMapping("/deleteProduct")
    public ModelAndView deleteProduct(Product product, HttpServletRequest request, HttpSession session) throws Exception{
        ModelAndView mv=new ModelAndView();
        int state=Integer.parseInt(request.getParameter("product_id"));
        productService.deleteProduct(state);
        mv.setViewName("admin_product");
        return mv;
    }

}
