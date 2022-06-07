<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.5.1.js"></script>
    <script type="text/javascript">
        //
        $(function () {
            $("#btn").click(function () {
                var bhj = $("#bhj").val();
                $.ajax({
                    url:"queryJson",
                    data:{
                        "bhj":bhj
                    },
                    dataType:"json",
                    success:function (resp) {
                        $("#mcj").val(resp.name);
                        $("#jcj").val(resp.jiancheng);
                        $("#shj").val(resp.shenghui);
                    }
                })
            })
        })


    </script>
</head>
<body>
<div align="center">
    <table border="1px">
        <tr>
            <td>省份编号:</td>
            <td><input type="text" id="bhj"/></td>
            <td><input type="button" value="搜索" id="btn"/></td>
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
