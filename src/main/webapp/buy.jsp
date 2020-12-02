<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="com.yang.service.ProductService" %>
<%@ page import="com.yang.domain.Product" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %><%--
  Created by IntelliJ IDEA.
  User: yangzihao
  Date: 2020-05-26
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"  isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <link href="${pageContext.request.contextPath}/css/buy.css" rel="stylesheet" type="text/css" />
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="js/index.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/iCheck/square/blue.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/morris/morris.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/select2/select2.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/dist/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title>login</title>
</head>
<body style="background-color: #F0F0F0">
<header class="header">
    <a href="${pageContext.request.contextPath}/detail.jsp" >
        <ins class="header-back"></ins>
    </a>
    <span class="header-title">预约确认</span>
</header>
<%--<%--%>
<%--    ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");--%>
<%--    ProductService productService= (ProductService) ac.getBean("productService");--%>
<%--//                UserInfo userInfo= (UserInfo) session.getAttribute("userInfo1");--%>
<%--    int state =Integer.parseInt(request.getParameter("product_id"));--%>
<%--    System.out.println(state);--%>
<%--    Product product= productService.findOne(state);--%>
<%--    System.out.println(product);--%>
<%--    session.setAttribute("product",product);--%>
<%--%>--%>
<div class="banner">${product.product_name}</div>
<form method="post" action="${pageContext.request.contextPath}/ordered/addOrder" >
    <div class="submit">
        <label>
            <span>预约姓名:</span>
            <input  class="form-control"   type="text" name="order_receiver" />
        </label><br>
        <label>
            <span>用餐人数:</span>
            <input  class="form-control"  type="text" name="order_num" />
        </label><br>
        <label>
            <span>联系方式:</span>
            <input  class="form-control"  type="text" name="order_phone" />
        </label><br>
        <input type="submit" value="预约" class="btn btm-success">
    </div>

</form>
</body>
</html>
