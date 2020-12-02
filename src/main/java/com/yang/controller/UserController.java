package com.yang.controller;


import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.yang.domain.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user, HttpSession session, ModelMap modelMap)throws Exception{
        if(user.getUser_phone().equals("您的电话")||user.getUser_password().equals("您的密码")){
            modelMap.addAttribute("message", "用户名和密码不能为空！");
            return "failer";
        }
        if(userService.login(user)){
            User user1=userService.findByPhone(user.getUser_phone());
            session.setAttribute("user1",user1);
            return "index";
        }else{
            modelMap.addAttribute("message", "用户名或密码错误！");
            return "failer";
        }
    }
    @RequestMapping("/reg_user")
    public String reg_user(User user, HttpServletRequest request)throws Exception{
        if(userService.findByUsername(user.getUser_username())){
            request.setAttribute("message", "当前用户名已存在");
        } else if(userService.findByPhone(user.getUser_phone())!=null){
            request.setAttribute("message", "当前注册电话已存在");
        }
        else{
            java.util.Date date = new java.util.Date();
            java.sql.Date sql_date = new java.sql.Date(date.getTime());
            System.out.println("xxx"+sql_date);
            userService.registerUser(user);
            request.setAttribute("message", "注册成功！请登录");
        }
        return "login";
    }

}
