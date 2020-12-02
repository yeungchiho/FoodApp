<%--
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
    <meta charset="UTF-8">
    <title>个人中心</title>
    <meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0" name="viewport"/>
    <meta content="yes" name="apple-mobile-web-app-capable"/>
    <meta content="black" name="apple-mobile-web-app-status-bar-style"/>
    <meta content="telephone=no" name="format-detection"/>
    <link href="css/local.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<header class="header">
    <a href="${pageContext.request.contextPath}/index.jsp" >
        <ins class="header-back"></ins>
    </a>
    <span class="header-title">个人中心</span>
</header>
<section class="flexView">
    <section class="scrollView">
        <div class="my-head">
            <div class="my-color">
                <div class="flex">
                    <div class="flex-box">
                        <h1>${user1.user_username}</h1>
                        <h2>${user1.user_phone}</h2>
                    </div>
                    <div class="my-user">
                        <img src="img/user-logo-004.png" alt="">
                    </div>
                </div>
                <div class="flex flex-color">
                    <div class="flex-box flex-box-one">
                        <a href="${pageContext.request.contextPath}/userordercenter.jsp">
                            <h3> <i class="icon icon-sml"></i> 我的订单</h3>
                        </a>

                    </div>
                    <div class="flex-box flex-box-two" >
                        <a href="${pageContext.request.contextPath}/collectioncenter.jsp">
                            <h3> <i class="icon icon-sal"></i> 我的收藏</h3>
                        </a>

                    </div>
                </div>
            </div>
        </div>
        <div class="course-list">
            <a href="javascript:;" class="flex ">
                <div class="cou-img">
                    <img src="img/my-wallet.png" alt="">
                </div>
                <div class="flex-box">
                    <p>我的钱包</p>
                </div>
                <div class="ren-arrow">
                    <span style="color:#feaa50">0.00元</span>
                </div>
            </a>
            <a href="javascript:;" class="flex ">
                <div class="cou-img">
                    <img src="img/suggest.png" alt="">
                </div>
                <div class="flex-box">
                    <p>意见反馈</p>
                </div>
                <div class="ren-arrow">
                    <span></span>
                </div>
            </a>
            <a href="javascript:;" class="flex ">
                <div class="cou-img">
                    <img src="img/help.png" alt="">
                </div>
                <div class="flex-box">
                    <p>帮助中心</p>
                </div>
                <div class="ren-arrow">
                    <span></span>
                </div>
            </a>
            <a href="javascript:;" class="flex ">
                <div class="cou-img">
                    <img src="img/help-phone.png" alt="">
                </div>
                <div class="flex-box">
                    <p>客服电话</p>
                </div>
                <div class="ren-arrow">
                    <span>138656565852</span>
                </div>
            </a>
            <a href="javascript:;" class="flex ">
                <div class="cou-img">
                    <img src="img/setting.png" alt="">
                </div>
                <div class="flex-box">
                    <p>系统设置</p>
                </div>
                <div class="ren-arrow">
                    <span></span>
                </div>
            </a>

        </div>
    </section>

</section>

</body>
</html>

