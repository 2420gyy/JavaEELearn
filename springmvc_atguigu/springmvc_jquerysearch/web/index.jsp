<%--
  Created by IntelliJ IDEA.
  User: 24201
  Date: 2021/4/9
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>省市级联查询</title>
  </head>
  <body>
  <p>省市级联查询</p>
  <div>
    <table>
      <tr>
        <td>
          省份名称
        </td>
        <td>
          <select id="provide">
            <option value="0">请选择。。。</option>
          </select>
        </td>
        <input type="button" value="load数据" id="btnload">
      </tr>
      <tr>
        <td>城市:</td>
        <select id="city">
          <option value="0">请选择。。。</option>
        </select>
      </tr>
    </table>
  </div>
  </body>
</html>
