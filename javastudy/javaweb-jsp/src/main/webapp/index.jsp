<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--jsp注释--%>
<%= new java.util.Date()%>

<%
    int sum = 0;
    for (int i = 1; i <= 5; i++) {

%>
<h1>hello ${i}</h1>

<%
        sum += i;
    }
%>
<%
    out.print("<h1>sum=" + sum + "</h1>");
    kuang();
%>
<p>文档</p>
<hr>
<%!
    public void kuang() {
        System.out.println("this is kuang");
    }
%>

<!--html注释-->
<%--jsp注释 不会显示在客户端--%>

</body>
</html>
