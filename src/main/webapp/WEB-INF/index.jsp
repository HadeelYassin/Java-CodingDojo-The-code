<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08/01/2021
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        span{
            color: red;
        }
    </style>
</head>
<body>
<center>
   <span> <c:out value="${error}"/></span>
    <p>What is the code ?</p>
    <form method="POST" action="/checkcode">
    <input type="text" name="code">
    <input type="submit" value="Try the code">
    </form>
</center>

</body>
</html>
