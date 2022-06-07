<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function search() {
            //发起ajax请求，传递参数给服务器
            var xmlHttpRequest = new XMLHttpRequest();

            xmlHttpRequest.onreadystatechange = function (){
                if(xmlHttpRequest.readyState==4 && xmlHttpRequest.status==200){
                       //alert(xmlHttpRequest.responseText);
                    //document.getElementById("mc").value=xmlHttpRequest.responseText;
                    document.getElementById("mc").setAttribute("value",xmlHttpRequest.responseText);
                }
            }
            //获得参数
            var bh = document.getElementById("bh").value;
            xmlHttpRequest.open('get',"searchAjaxServlet?bh="+bh,true);

            xmlHttpRequest.send();
        }
    </script>
</head>
<body>
<div align="center">
    <table border="1px">
        <tr>
            <td>省份编号:</td>
            <td><input type="text" id="bh"/></td>
            <td><input type="submit" value="搜索" onclick="search()"/></td>
        </tr>
        <tr>
            <td>省份名称:</td>
            <td colspan="2" ><input type="text" id="mc"/></td>
        </tr>
        <tr>
            <td>省份简称:</td>
            <td colspan="2"><input type="text" id="jc"/></td>
        </tr>
    </table>
</div>

</body>
</html>
