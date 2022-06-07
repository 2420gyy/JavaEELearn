<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function doSearch() {

        var xmlHttp = new XMLHttpRequest();
        xmlHttp.onreadystatechange = function () {
            if (xmlHttp.readyState == 4 && xmlHttp.status ==200){
                var  data = xmlHttp.responseText;
                var jsonobj = eval("("+data+")");
                document.getElementById("mcj").value = jsonobj.name;
                document.getElementById("jcj").value = jsonobj.jiancheng;
                document.getElementById("shj").value = jsonobj.shenhui;
            }
        }
        var id = document.getElementById("bhj").value;
        xmlHttp.open("get","queryJson?bhj="+id,true);
        xmlHttp.send();
        }
    </script>
</head>
<body>
<div align="center">
    <table border="1px">
        <tr>
            <td>省份编号:</td>
            <td><input type="text" id="bhj"/></td>
            <td><input type="button" value="搜索" onclick="doSearch()"/></td>
        </tr>
        <tr>
            <td>省份名称:</td>
            <td colspan="2" ><input type="text" id="mcj"/></td>
        </tr>
        <tr>
            <td>省份简称:</td>
            <td colspan="2"><input type="text" id="jcj"/></td>
        </tr>
        <tr>
            <td>省会名称:</td>
            <td colspan="2"><input type="text" id="shj"/></td>
        </tr>
    </table>
</div>
</body>
</html>
