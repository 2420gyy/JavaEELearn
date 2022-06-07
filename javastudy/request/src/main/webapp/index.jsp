<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>登录</h1>

<div>
    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名：<input type="username" name="username"> <br>
        密码：<input type="password" name="password"> <br>
        爱好：
        <input type="checkbox" name="hobbys" value="girl"> girl
        <input type="checkbox" name="hobbys" value="movie"> movie
        <input type="checkbox" name="hobbys" value="music"> music
        <input type="checkbox" name="hobbys" value="book"> book

        <br>
        <input type="submit">

    </form>
</div>
</body>
</html>
