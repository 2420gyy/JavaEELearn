<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录测试</title>
    <link rel="stylesheet" href="resources/layui/css/layui.css">
    <script src="resources/layui/layui.js"></script>
</head>
<body>
<form class="layui-form" action="${pageContext.request.contextPath}/login" method="get">
    <%--    action="${pageContext.request.contextPath}/login"--%>
    <div class="layui-form-item">
        <label class="layui-form-label">用户名:</label>
        <div class="layui-input-inline">
            <input type="text" name="username" lay-verify="required" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">密码:</label>
        <div class="layui-input-inline">
            <input type="password" name="password" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" type="submit" lay-submit lay-filter="formDemo">提交</button>
        </div>
    </div>
</form>
<form action="${pageContext.request.contextPath}/register">
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn layui-btn-primary">注册</button>
        </div>
    </div>
</form>


<script type="text/javascript">
    layui.use(['element'], function () {
    })
</script>
</body>
</html>
