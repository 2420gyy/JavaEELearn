<%--
  Created by IntelliJ IDEA.
  User: 24201
  Date: 2020/11/7
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--两个页面合二为一--%>
<%@include file="common/hander.jsp" %>
<h1>网页主体</h1>
<%@include file="common/footer.jsp" %>
<hr>

<%--jsp标签--%>
<%--拼接页面，存静态资源，取地址--%>
<h1>网页主体-jsp</h1>
<jsp:include page="/common/hander.jsp"/>
</body>
</html>
