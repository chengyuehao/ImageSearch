<%--
  Created by IntelliJ IDEA.
  User: xc
  Date: 2017/9/5
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util" %>
<%
    String
%>
<html>
<head>
    <title>Title</title>
    <script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js">
    </script>
</head>
<body>
    <h1>图片搜索</h1>
    <form action="index">
        username:<input type="text" name="username"><br>
        password:<input type="password" name="pwd"><br>
        <input type="submit">
    </form>


    <label for="thumbnail" class="col-md-3 control-label">缩略图</label>
    <div class="col-md-6">
        <input type="file" class="form-control" id="thumbnail" name="thumbnail">
    </div>


</body>
</html>
