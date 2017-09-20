<%@ page import="com.cheng.test.AccountBean" %><%--
  Created by IntelliJ IDEA.
  User: xc
  Date: 2017/9/5
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.cheng.servlet.*" %>
<html>
<head>
    <title>success</title>
</head>
<body>
    <%
        AccountBean account = (AccountBean)session.getAttribute("account");
    %>
    username:<%=account.getUsername()%><br>
    password:<%=account.getPassword()%>
    <h2>Welcome to "username" Login System!</h2>
    <p>This is the first javaWeb page</p>
</body>
</html>
