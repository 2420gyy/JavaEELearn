<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>全局刷新</title>
  </head>
  <body>
  <p>全局刷新计算bmi</p>
  <form action="bmiServlet" method="get"><br>
    姓名:<input type="text" name="name"><br>
    身高:<input type="text" name="height"><br>
    体重:<input type="text" name="weight">
    <input type="submit" value="提交">
  </form>
  </body>
</html>
