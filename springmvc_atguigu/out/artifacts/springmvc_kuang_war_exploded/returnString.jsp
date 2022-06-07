<%--
  Created by IntelliJ IDEA.
  User: 24201
  Date: 2021/3/24
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="st2" method="post">
    姓名:<input type="text" name="name"><br>
    <%--    Required String parameter 'username' is not present--%>
    年龄:<input type="text" name="age" required><br>
    <input type="submit" value="对象接收参数">
</form>
</body>
</html>
