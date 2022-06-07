<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>按钮</title>
    <link rel="stylesheet" href="resources/layui/css/layui.css">
</head>
<body>

<fieldset class="layui-elem-field site-demo-button" style="margin-top: 30px;">
    <legend>按钮主题</legend>
    <%--    只要是容器就可以--%>
    <div>
        <button type="button" class="layui-btn layui-btn-primary">原始按钮</button>
        <a class="layui-btn layui-btn-normal">A提交A</a>
        <button type="button" class="layui-btn">默认按钮</button>
        <button type="button" class="layui-btn layui-btn-normal">百搭按钮</button>
        <button type="button" class="layui-btn layui-btn-warm">暖色按钮</button>
        <button type="button" class="layui-btn layui-btn-danger">警告按钮</button>
        <button type="button" class="layui-btn layui-btn-disabled">禁用按钮</button>
    </div>
</fieldset>

<fieldset class="layui-elem-field site-demo-button" style="margin-top: 30px;">
    <legend>按钮尺寸</legend>
    <div>
        <button type="button" class="layui-btn layui-btn-lg">大型按钮</button>
        <button type="button" class="layui-btn ">默认按钮</button>
        <button type="button" class="layui-btn layui-btn-sm">小型按钮</button>
        <button type="button" class="layui-btn layui-btn-xs">迷你按钮</button>
        <button type="button" class="layui-btn layui-btn-sm layui-btn-danger">小型警告按钮</button>
        <a class="layui-btn layui-btn-normal layui-btn-sm">A提交A</a>
    </div>
</fieldset>
<fieldset>
    <legend>灵活的图标按钮（更多图标请阅览：文档-图标）</legend>
    <div>
        <%--    这个是在class里面写全，--%>
        <button type="button" class="layui-btn layui-icon layui-icon-key">钥匙</button>

        <button type="button" class="layui-btn"><i class="layui-icon">&#xe68c;爱心</i></button>
        <br>
        <button type="button" class="layui-btn layui-btn-danger"><i class="layui-icon">&#xe68f;</i></button>
        <button type="button" class="layui-btn layui-btn-danger">
            <span class="layui-icon">&#xe68f;爱心</span>
        </button>
        <br>
        <button type="button" class="layui-btn layui-btn-primary layui-btn-sm"><i class="layui-icon">&#xe68f;</i>
        </button>
        <button type="button" class="layui-btn layui-btn-primary layui-btn-sm"><i class="layui-icon">&#xe68c;</i>
        </button>

        <button type="button" class="layui-btn layui-btn-sm"><i class="layui-icon">&#xe68f;</i></button>
        <button type="button" class="layui-btn layui-btn-sm"><i class="layui-icon">&#xe68c;</i></button>

        <button type="button" class="layui-btn layui-btn-normal layui-btn-sm"><i class="layui-icon">&#xe68f;</i>
        </button>
        <button type="button" class="layui-btn layui-btn-normal layui-btn-sm"><i class="layui-icon">&#xe68c;</i>
        </button>
        <br>
        <button type="button" class="layui-btn layui-btn-normal layui-btn-radius">百搭按钮-圆角</button>
        <br>
        <legend>按钮组</legend>
        <div class="layui-btn-group">
            <button type="button" class="layui-btn" id="add">增加</button>
            <button type="button" class="layui-btn ">编辑</button>
            <button type="button" class="layui-btn">删除</button>
        </div>
    </div>
</fieldset>

<script src="resources/layui/layui.js"></script>
<%--这个必须在.js下面--%>
<script type="text/javascript">
    layui.use(["jquery"], function () {
        var $ = layui.jquery;
        // $(".layui-btn").click(function () {
        // alert($(this).html())
        // })
        $("#add").click(function () {
            alert($(this).html())
        })
    })
</script>


</body>
</html>
