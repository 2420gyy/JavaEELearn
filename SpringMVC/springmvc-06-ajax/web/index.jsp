<%--
  Created by IntelliJ IDEA.
  User: 24201
  Date: 2020/11/26
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>

    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.js"></script>
    <script>
        function a() {
            $.post({
                url: "${pageContext.request.contextPath}/a1",
                data: {"name": $("#username").val()},
                success: function (data, status) {
                    // alert(data);
                    console.log("data=" + data);
                    console.log("status=" + status);//200成功 300重定向或转发 400客户端错误 500服务器错误
                }
            })
        }
    </script>

</head>
<body>

<%--  失去焦点的时候，发起一个请求(携带信息)到后台--%>
<%--<a href="/t1"></a>这个是同步的时候进行的操作--%>
用户名：<input type="text" id="username" onblur="a()">


</body>
</html>
