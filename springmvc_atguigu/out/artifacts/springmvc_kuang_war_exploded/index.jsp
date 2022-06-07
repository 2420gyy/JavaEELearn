<%--
  Created by IntelliJ IDEA.
  User: 24201
  Date: 2021/3/22
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$<br>
  <a href="myHello">发起请求</a></br>
  <a href="modelTest">发起mode请求</a>
  </br><br>
  <a href="myHello">发起get请求</a></br>
  <form method="get" action="modelTest">
    <input type="submit" value="post请求">
  </form><br>
  <a href="parampter.jsp">登录界面</a><br>
  <a href="returnString.jsp">返回值是字符串</a>

<%--  不能有/--%>
<%--  tomcat打包没有依赖！！！！--%>
  <br>
  <img src="C:\Users\24201\Pictures\Saved Pictures\a.jpg" alt="图片不显示"/>
  </body>
</html>
