<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="com.yang.service.OrderService" %>
<%@ page import="com.yang.domain.Ordered" %>
<%@ page import="java.util.List" %>
<%@ page import="com.yang.domain.Collection" %>
<%@ page import="com.yang.service.CollectionService" %><%--
  Created by IntelliJ IDEA.
  User: yangzihao
  Date: 2020-05-21
  Time: 09:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <link href="${pageContext.request.contextPath}/css/userorders.css" rel="stylesheet" type="text/css" />
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="js/index.js"></script>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title>我的收藏</title>
</head>
<body style="background-color: #F0F0F0">
<header class="header">
    <a href="${pageContext.request.contextPath}/local.jsp" >
        <ins class="header-back"></ins>
    </a>
    <span class="header-title">我的收藏</span>
</header>

<%
    //
    ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
    CollectionService collectionService = (CollectionService) ac.getBean("collectionService");
    List<Collection> collectionList = collectionService.findAll();
    session.setAttribute("collectionList",collectionList);
    for(int i=0;i<collectionList.size();i++){
        System.out.println(collectionList.get(i));
    }
%>

<div class="banner"></div>
<div class="like-content">

    <c:forEach items="${collectionList}" var="collectionPublished" varStatus="vs">
        <a class="content-item">
            <div class="pic">
                <img src="${pageContext.request.contextPath}/img/star.png" style="width: 100px; height: 100px;"/>
            </div>
            <div class="content">
                <div class="shop-name">${collectionPublished.collection_product}</div>
                <div class="shop-sale">${collectionPublished.collection_createtime}</div>
            </div>
        </a>
    </c:forEach>



</div>

</body>
</html>

