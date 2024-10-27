<%@ page import="com.bo.Messages" %><%--
  Created by IntelliJ IDEA.
  User: houdamoudni
  Date: 3/24/24
  Time: 1:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/Style/error.css" rel="stylesheet">
    <title>Document</title>
</head>
<head>
    <title>error</title>
</head>
<body>
    <div class="error">

        <div class="text">
            <h2>
                <%= request.getAttribute("msg")%>
            </h2>
    </div>


</div>
</body>
</html>
