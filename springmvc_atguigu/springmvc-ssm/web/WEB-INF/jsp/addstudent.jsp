<%--
  Created by IntelliJ IDEA.
  User: 24201
  Date: 2021/3/27
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册学生</title>
</head>
<body>
<div align="center">
    <form action="student/addStudent" method="post">
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td>$nbsp;$nbsp;$nbsp;$nbsp;$nbsp;</td>
            <td><input type="submit" value="注册"></td>
        </tr>
    </form>
</div>

</body>
</html>
