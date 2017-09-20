<%--
  Created by IntelliJ IDEA.
  User: xc
  Date: 2017/9/13
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page  language="java" import="java.util" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    System.out.print(path);
    String basePath = request.getScheme() + ":\\" + request.getServerName() + ":" + request.getServerPort() + path + "/" ;
    System.out.print(basePath);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>Jsp message exchange</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
</head>
<body>
    <p>This is a message exchange test!</p>
    <form action=""

</body>
</html>
