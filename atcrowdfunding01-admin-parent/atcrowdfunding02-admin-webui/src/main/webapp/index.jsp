<%--
  Created by IntelliJ IDEA.
  User: 24201
  Date: 2021/5/17
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--http://localhost:8080/atcrowdfunding02_admin_webui/test/ssm.html--%>
<base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
<script src="jquery/jquery-3.5.1.js"></script>
<script type="text/javascript">
    $(function () {
        $("#btnObj").click(function () {
            var student ={
                "stuId": 5,
                "stuName": "tom",
                "address": {
                    "province": "广东",
                    "city": "深圳",
                    "street": "后瑞"
                },
                "subjectList": [
                    {
                        "subjectName": "JavaSE",
                        "subjectScore": 100
                    }, {
                        "subjectName": "SSM",
                        "subjectScore": 99
                    }
                ],
                "map": {
                    "k1": "v1",
                    "k2": "v2"
                }
            };
            var requestBody = JSON.stringify(student);
            // 发送Ajax请求
            $.ajax({
                "url": "send/compose/object.json",
                "type": "post",
                "data": requestBody,
                "contentType": "application/json;charset=UTF-8",
                "dataType": "json",
                "success": function (response) {
                    console.log(response);
                },
                "error": function (response) {
                    console.log(response);
                }
            });
        });

        $("#btnArr").click(function () {
            //
            var array=[5,8,12];
            var requestBody = JSON.stringify(array);
            $.ajax({
                "url":"send/array.html",
                "type":"post",
                "data":requestBody,
                "contentType": 'application/json;charset=utf-8',
                "dataType":"text",
                "success":function (response) {
                    alert(response);
                },
                "error":function (response) {
                    alert(response);
                }
            })
        })
    })
</script>
<head>
    <title>Title</title>
</head>
<body>

<%--/atcrowdfunding02_admin_webui--%>
<%--    <a href="${pageContext.request.contextPath}/test/ssm.html">测试SSM环境整合</a>--%>
<a href="test/ssm.html">测试SSM环境整合</a>
<br/>
<button id="btnArr">Send [5,8,12] One</button>
<br/>
<button id="btnObj">Send Compose Object</button>

</body>
</html>
