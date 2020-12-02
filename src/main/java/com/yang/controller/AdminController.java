package com.yang.controller;


import com.yang.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.yang.domain.Admin;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/admin_login")
    public String admin_login(Admin admin, HttpSession session , ModelMap modelMap) throws Exception{
        if (admin.getAdmin_phone().equals("您的电话")||admin.getAdmin_password().equals("您的密码")){
            modelMap.addAttribute("message","账号和密码不能为空");
            return "failer";
        }


        if(adminService.login(admin)){
            Admin admin1=adminService.findByPhone(admin.getAdmin_phone());
            session.setAttribute("admin1",admin1);
            return "admin_index";
        }else{
            modelMap.addAttribute("message", "用户名或密码错误！");
            return "failer";
        }
    }

    @RequestMapping("admin_reg")
    public String admin_reg(Admin admin, HttpServletRequest httpServletRequest) throws Exception{
        if (adminService.findByUsername(admin.getAdmin_username())) {
            httpServletRequest.setAttribute("message", "用户名已存在！");
            return  "failer";
        } else if (adminService.findByPhone(admin.getAdmin_phone())!=null) {
            httpServletRequest.setAttribute("message", "电话已存在");
            return "failer";
        } else {
            java.util.Date date = new java.util.Date();
            java.sql.Date sql_date = new java.sql.Date(date.getTime());
            System.out.println("xxx" + sql_date);
            adminService.registerAdmin(admin);
            httpServletRequest.setAttribute("message", "注册成功！请登录");
        }
        return "admin_login";
    }
}
