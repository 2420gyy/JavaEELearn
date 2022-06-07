<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Success</h1>
<hr>

<p>你的个人信息为：</p>
<p>账号 :${username}</p>
<p>密码 :${password}</p>
<%
    String[] hobby = request.getParameterValues("hobbys");
%>
<p>爱好:</p>
<%
    if (hobby != null) {
        for (String hob : hobby) {
            out.print(hob + " ");
        }
    }
%>

</body>
</html>
