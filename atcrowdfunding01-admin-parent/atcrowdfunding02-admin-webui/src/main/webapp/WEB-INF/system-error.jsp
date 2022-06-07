<%--
  Created by IntelliJ IDEA.
  User: 24201
  Date: 2021/5/24
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统级别异常</title>
</head>
<body>

<h2>出错了</h2>
<%--从请求域中取出exception对象，再进一步访问message属性就能显示异常信息--%>
${requestScope.exception.message}
</body>
</html>
