<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="com.yang.service.ProductService" %>
<%@ page import="com.yang.domain.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: yangzihao
  Date: 2020-05-21
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <link href="css/detail.css" rel="stylesheet" type="text/css" />
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/detail.js"></script>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title>用户注册</title>
</head>
<body style="background-color: #F0F0F0">
<header class="header">
    <a href="${pageContext.request.contextPath}/index.jsp" >
        <ins class="header-back"></ins>
    </a>
    <span class="header-title">商品详情</span>
</header>
<%
    ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
    ProductService productService= (ProductService) ac.getBean("productService");
//                UserInfo userInfo= (UserInfo) session.getAttribute("userInfo1");
    int state =Integer.parseInt(request.getParameter("product_id"));
    System.out.println(state);
    Product product= productService.findOne(state);
    System.out.println(product);
    session.setAttribute("product",product);
%>

<section>
    <div class="res-img">
        <img src="${pageContext.request.contextPath}/img/detail1.png" style="width: 100%; height: 100%; "/>
    </div>
    <c:forEach items="${productList}" var="productPublished" varStatus="vs">

    </c:forEach>
    <div class="res-info">
        <p class="title">${product.product_name}</p>
        <div class="score">
            <div class="star">
                <img src="${pageContext.request.contextPath}/img/star.png" style="width: 20px; height: 20px;"/>
                <img src="${pageContext.request.contextPath}/img/star.png" style="width: 20px; height: 20px;"/>
                <img src="${pageContext.request.contextPath}/img/star.png" style="width: 20px; height: 20px;"/>
                <img src="${pageContext.request.contextPath}/img/star.png" style="width: 20px; height: 20px;"/>
                <img src="${pageContext.request.contextPath}/img/star.png" style="width: 20px; height: 20px;"/>
            </div>
            <div class="star-num">4.8分 ${product.product_saleCount}预约</div>
        </div>
        <div class="discount">
            <div class="obvious">预定送惊喜</div>
            <div class="discount-text">仅限今晚，先到先得！</div>
        </div>
        <div class="lable"><p>${product.product_subtitle}</p></div>
    </div>
    <div class="banner"></div>
    <div class="comment">
        <div class="comment-title">用户评论</div>
        <div class="comment-item">
            <div class="user-title">
                <img src="${pageContext.request.contextPath}/img/detail.jpg" class="profile"/>
                <div style="float: left; ">
                    <div class="user-name">
                        南天霸
                    </div>
                    <div class="user-star">
                        <img src="${pageContext.request.contextPath}/img/star.png" style="width: 20px; height: 20px;"/>
                        <img src="${pageContext.request.contextPath}/img/star.png" style="width: 20px; height: 20px;"/>
                        <img src="${pageContext.request.contextPath}/img/star.png" style="width: 20px; height: 20px;"/>
                        <img src="${pageContext.request.contextPath}/img/star.png" style="width: 20px; height: 20px;"/>
                        <img src="${pageContext.request.contextPath}/img/star.png" style="width: 20px; height: 20px;"/>
                    </div>
                </div>
                <div class="user-time">2020.04.02</div>
            </div>
            <div class="com-detail">
                <p> 一般来说， 带着这些问题，我们来审视一下火锅。 现在，解决火锅的问题，是非常非常重要的。 所以， 要想清楚，火锅，到底是一种怎么样的存在。 现在，解决火锅的问题，是非常非常重要的。 所以， 在这种困难的抉择下，本人思来想去，寝食难安。 我认为， 那么， 我们不得不面对一个非常尴尬的事实，那就是， 现在，解决火锅的问题，是非常非常重要的。</p>
            </div>
        </div>
    </div>
</section>
<footer class="footer">
    <form method="post" action="${pageContext.request.contextPath}/collection/addCollection">
        <a class="collect">
            <div style="float: left;"><img src="${pageContext.request.contextPath}/img/collect.png" style="width: 30px; height: 30px; margin-left: 15px; margin-top: 12px;"/></div>
            <div style="float: left;background-color: white; border: none;font-size: 22px; color: orange; margin-top: 12px; margin-left: 5px;"><input type="submit" class="collection-btn"></div>
        </a>
    </form>

    <form method="post" action="${pageContext.request.contextPath}/buy.jsp?product_id=${product.product_id}" >
        <div style="float: right;"><input class="buy-btn" type="submit"  placeholder="预定"  /></div>
    </form>

</footer>
</body>
</html>

