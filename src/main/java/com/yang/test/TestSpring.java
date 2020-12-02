package com.yang.test;

import com.yang.domain.Ordered;
import com.yang.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    @Test
    public void run1() throws Exception {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderService orderService= (OrderService) ac.getBean("orderService");
//        Admin admin=new Admin();
//        Ordered order=orderService.findByUserId(1);

        List<Ordered> orderList=orderService.findByUserId(1);
        System.out.println(orderList.size());
//        order.setOrder_user_id(1);
//        List<Ordered> orderList =orderService.findByProductId(2);
//        System.out.println(orderList);
//        java.util.Date date = new java.util.Date();
//        java.sql.Date sql_date = new java.sql.Date(date.getTime());
//        order.setOrder_createtime(sql_date);
//        order.setOrder_user_id(1);
//        order.setOrder_product("duan1");
//        order.setOrder_product_id(2);
//        order.setOrder_receiver("yang1");
//        order.setOrder_num(6);
//        order.setOrder_phone("18151863436");
//        admin.setAdmin_phone("18151863435");
//        admin.setAdmin_password("19980801");
//        orderService.addOrder(order);
//        AccountService as= (AccountService) ac.getBean("accountService");
////        as.findAll();
//        ResumeService resumeService= (ResumeService) ac.getBean("resumeService");
//        Resume resume=resumeService.findResumeByUserId("1");
//        System.out.println(resume);

    }
}
