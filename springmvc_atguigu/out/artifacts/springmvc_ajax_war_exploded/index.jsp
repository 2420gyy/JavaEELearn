<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script type="text/javascript" src="js/jquery-3.5.1.js"></script>
    <script type="text/javascript">
      $(function () {
        //绑定事件
        $("#btnAjax").on("click",function () {
          $.ajax({
            // url:"doajaxjson",
            //url:"doajaxjsonarray",
            url:"dostring",
            data:{
              name:"lisi",
              age:20
            },
            //dataType:"json",
            dataType:"text",
            success:function (resp) {
              // alert("resp=="+resp.name+"====="+resp.age);
              // $.each(resp,function (i,n) {
              //   alert("n name="+n.name+"===age="+n.age);
              //
              // })
              alert(resp);
            }
          })
        })
      })
    </script>
  </head>
  <body>
  <form action="doajaxjson" method="post">
    姓名:<input type="text" name="name"><br>
    <%--    Required String parameter 'username' is not present--%>
    年龄:<input type="text" name="age" required><br>
    <input type="submit" value="对象接收参数">
  </form>

  <br>
  <button id="btnAjax">发起异步请求(void)</button>
<br>
  <img src="img/a.jpg" alt="图片未显示"/>
  </body>
</html>
