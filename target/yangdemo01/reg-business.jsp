<%--
  Created by IntelliJ IDEA.
  User: yangzihao
  Date: 2020-05-18
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <link href="css/reg-business.css" rel="stylesheet" type="text/css" />
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="js/index.js"></script>
    <title>商家注册</title>
</head>
<body style="background-color: #F0F0F0">
<header class="header">
    <a href="register-pick.html" >
        <ins class="header-back"></ins>
    </a>
    <span class="header-title">商家注册</span>
</header>
<div class="banner"></div>
<div class="register">
    <div class="reg-row">
        <div class="phone">手机号</div>
        <input type="text" placeholder="请输入手机号" class="reg-input"/>
    </div>
    <div class="reg-row">
        <div class="username">用户名</div>
        <input type="text" placeholder="请输入用户名" class="reg-input"/>
    </div>
    <div class="reg-row">
        <div class="name">姓名</div>
        <input type="text" placeholder="请输入真实姓名" class="reg-input"/>
    </div>
    <div class="reg-row">
        <div class="alipay">支付宝</div>
        <input type="text" placeholder="请输入支付宝账号" class="reg-input"/>
    </div>
    <div class="reg-row">
        <div class="password">密码</div>
        <input type="password" placeholder="请设置密码" class="reg-input"/>
    </div>
</div>
<div class="banner"></div>
<div class="agree">
    <input type="checkbox" />我已同意
    <a>《用户使用准则》</a>
</div>
<div class="banner"></div>
<div class="reg-btn">
    <button class="btn">注册</button>
</div>
</body>
</html>

