<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="com.yang.service.ProductService" %>
<%@ page import="com.yang.domain.Product" %>
<%@ page import="com.yang.domain.Ordered" %>
<%@ page import="com.yang.service.OrderService" %>
<%@ page import="com.yang.domain.User" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet" type="text/css" />
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="js/index.js"></script>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title>YZH</title>
    <script type="text/javascript">

        document.addEventListener('plusready', function(){
            //console.log("所有plus api都应该在此事件发生后调用，否则会出现plus is undefined。")

        });

    </script>
</head>
<body>
<%
    //
    ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
    ProductService productService = (ProductService) ac.getBean("productService");
    OrderService orderService = (OrderService) ac.getBean("orderService");
    User user= (User) session.getAttribute("user1");
    System.out.println(user);
    List<Ordered> orderList =orderService.findByUserId(user.getUser_id());
    System.out.println(orderList.size());
    List<Product> productList = new ArrayList<Product>();
    List<User> userList = new ArrayList<User>();
    if (orderList.size()<=0){
        productList = productService.findAll();
        Collections.sort(productList);
        session.setAttribute("productList",productList);
    }else{
        Set<Product> productSet = new HashSet<Product>();
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        int[] subtitle = new int[4];
        String[] restaurant={"中餐","西餐","甜品","饮品"};
        for(Ordered order:orderList){
            Product product = productService.findOne(order.getOrder_product_id());
            productSet.add(product);
        }
        for (Product product : productSet){
            if(product.getProduct_subtitle().equals("中餐")){
                subtitle[0]++;
            }
            else if(product.getProduct_subtitle().equals("西餐")){
                subtitle[1]++;
            }
            else if(product.getProduct_subtitle().equals("甜品")){
                subtitle[2]++;
            }
            else{
                subtitle[3]++;
            }
            int key = 0;
            for (int i = 0;i<subtitle.length;i++){
                if (subtitle[key]<subtitle[i]){
                    key = i;
                }
            }
            productList=productService.findProductBySubtitle(restaurant[key]);
            Collections.sort(productList);
            session.setAttribute("productList",productList);
        }
    }
%>
<div class="header-class">
    <header class="header">
        <span class="city">徐州</span>
        <div class="search">
            <div class="input-group">
                <input type="text" class="form-control" placeholder="请输入商家名..">
                <span class="input-group-btn">
						<button class="btn btn-default" type="button">Go!</button>
					</span>
            </div>
        </div>
        <div class="my-enter">
<%--            <button class="my-btn">--%>
                <a href="${pageContext.request.contextPath}/local.jsp?user_id=${user1.user_id}"></a>
<%--                    <img src="${pageContext.request.contextPath}/img/个人中心.png" class="my-img"/></a>--%>
<%--            </button>--%>
        </div>
    </header>
</div>
<div class="pic-show" id="pic-show">
    <div class="con1">
        <li><img src="${pageContext.request.contextPath}/img/pic-show1.jpg" class="showpics"/></li>
        <li><img src="${pageContext.request.contextPath}/img/pic-show2.jpg" class="showpics"/></li>
    </div>
    <div class="con2"></div>
</div>
<div class="catagory">
    <a class="sort">
        <img class="sort-img" src="${pageContext.request.contextPath}/img/meal-sort1.png" />
        <span class="sort-text1">中餐</span>
    </a>
    <a class="sort">
        <img class="sort-img" src="${pageContext.request.contextPath}/img/meal-sort3.png" />
        <span class="sort-text3">西餐</span>
    </a>
    <a class="sort">
        <img class="sort-img" src="${pageContext.request.contextPath}/img/meal-sort2.png" />
        <span class="sort-text2">甜品</span>
    </a>
    <a class="sort">
        <img class="sort-img" src="${pageContext.request.contextPath}/img/meal-sort4.png" />
        <span class="sort-text4">饮品</span>
    </a>
</div>
<div class="banner"></div>

<div class="discount">
    <a class="discount-text"></a>
    <c:forEach items="${productList}" var="product" begin="0" end="2">

            <a class="discount-goods" href="${pageContext.request.contextPath}/detail.jsp?product_id=${product.product_id}">
                <div class="discount-goods-img">
                    <img class="discount-img" src="${pageContext.request.contextPath}/img/discount2.png" />
                </div>
                <div class="discount-goods-title">${product.product_name}</div>
                <div class="discount-goods-price">
                    <ins class="price-current">
                        销量：${product.product_saleCount}
                    </ins>

                </div>
            </a>

    </c:forEach>





<%--    <a class="discount-goods">--%>
<%--        <div class="discount-goods-img">--%>
<%--            <img class="discount-img" src="${pageContext.request.contextPath}/img/discount1.png" />--%>
<%--        </div>--%>
<%--        <div class="discount-goods-title">麻辣烫</div>--%>
<%--        <div class="discount-goods-price">--%>
<%--            <ins class="price-current">--%>
<%--                15--%>
<%--            </ins>--%>
<%--            <del class="price-old">--%>
<%--                20--%>
<%--            </del>--%>
<%--        </div>--%>
<%--    </a>--%>
<%--    <a class="discount-goods">--%>
<%--        <div class="discount-goods-img">--%>
<%--            <img class="discount-img" src="${pageContext.request.contextPath}/img/discount2.png" />--%>
<%--        </div>--%>
<%--        <div class="discount-goods-title">炒面</div>--%>
<%--        <div class="discount-goods-price">--%>
<%--            <ins class="price-current">--%>
<%--                10--%>
<%--            </ins>--%>
<%--            <del class="price-old">--%>
<%--                12--%>
<%--            </del>--%>
<%--        </div>--%>
<%--    </a>--%>
<%--    <a class="discount-goods">--%>
<%--        <div class="discount-goods-img">--%>
<%--            <img class="discount-img" src="${pageContext.request.contextPath}/img/discount3.png" />--%>
<%--        </div>--%>
<%--        <div class="discount-goods-title">土豆泥</div>--%>
<%--        <div class="discount-goods-price">--%>
<%--            <ins class="price-current">--%>
<%--                4--%>
<%--            </ins>--%>
<%--            <del class="price-old">--%>
<%--                7--%>
<%--            </del>--%>
<%--        </div>--%>
<%--    </a>--%>
</div>
<div class="banner"></div>
<div class="favorite">
    <div class="like-title">餐厅列表</div>
    <div class="like-content">

<%--        <c:forEach items="${productList}" var="productPublished" varStatus="vs">--%>
<%--            <tr>--%>
<%--                <td>${productPublished.product_id}</td>--%>
<%--                <td>${productPublished.product_name}</td>--%>
<%--                <td>${productPublished.product_address}</td>--%>
<%--                <td>${productPublished.product_subtitle}</td>--%>
<%--                <td>${productPublished.product_createtime}</td>--%>
<%--                <td class="text-center">--%>
<%--                    <button type="button" class="btn bg-maroon btn-xs" onclick='location.href="all-product-line-edit.html"'>删除</button>--%>
<%--                </td>--%>

<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--        --%>

        <c:forEach items="${productList}" var="productPublished" varStatus="vs" >
            <a class="content-item" href="${pageContext.request.contextPath}/detail.jsp?product_id=${productPublished.product_id}">
                <div class="pic">
                    <img src="${pageContext.request.contextPath}/img/list.JPG" style="width: 100px; height: 100px;"/>
                </div>
                <div class="content">
                    <div class="shop-name">${productPublished.product_name}</div>
                    <div class="shop-sub">${productPublished.product_subtitle}</div>
                    <div class="shop-sale">${productPublished.product_address}</div>
                </div>
            </a>
        </c:forEach>





    </div>
</div>

</body>
</html>
