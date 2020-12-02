<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"  isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" type="text/css" />
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="js/index.js"></script>
    <title>login</title>
</head>
<body style="background-color: #F0F0F0">
<header class="header">
    <a href="index.html" >
        <ins class="header-back"></ins>
    </a>
    <span class="header-title">用户登录</span>
</header>
<div class="banner"></div>
<form method="post" action="${pageContext.request.contextPath}/user/login">
    <div class="login">
        <div class="login-row">
            <div class="phone">手机号</div>
            <input type="text" placeholder="请输入手机号" name="user_phone" class="login-input"/>
        </div>
        <div class="login-row">
            <div class="password">密码</div>
            <input type="password" placeholder="请输入密码" name="user_password" class="login-input"/>
        </div>
    </div>
    <div class="banner"></div>
    <div class="login-btn">
        <button type="submit" class="btn">登录</button>
    </div>
    <div class="banner"></div>
    <div class="reg">
        <a class="reg-enter" href="reg_user.jsp">未注册？点击进行注册</a>
    </div>
</form>

<div class="footer">登录即表示您同意
    <a>《用户使用协议》</a>
</div>
</body>
</html>
