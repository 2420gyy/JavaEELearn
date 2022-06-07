<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>局部刷新</title>
    <script type="text/javascript">
        //使用内存中的异步对象，代替浏览器发送请求

        function doAjax() {

            var xmlHttp = new XMLHttpRequest();
            xmlHttp.onreadystatechange = function () {
                //alert("readyState属性值"+xmlHttp.readyState)
                if(xmlHttp.readyState == 4 && xmlHttp.status ==200){
                    // alert(xmlHttp.responseText);
                    var data = xmlHttp.responseText;
                    // document.getElementById("mydata").innerText = data;
                    document.getElementById("mydata").setAttribute('value',data);
                }
            }
            //获取dom对象的value值
            var name = document.getElementById("name").value;
            var w = document.getElementById("w").value;
            var h = document.getElementById("h").value;

            var param = "name="+name+"&w="+w+"&h="+h;
            xmlHttp.open("get","bmiAjaxServlet?"+param,true);
            xmlHttp.send();

        }
    </script>
</head>
<body>
    <p>局部刷新计算bmi</p>
    <div>
        姓名:<input type="text" id="name"><br>
        体重:<input type="text" id="w"><br>
        身高:<input type="text" id="h"><br>
        <input type="button" value="计算" onclick="doAjax()"><br>
        BMI为:<input type="text" id="mydata" value="等待数据更新。。。。">
<%--        <div id="mydata">等待数据更新。。。。</div>--%>
    </div>
</body>
</html>
