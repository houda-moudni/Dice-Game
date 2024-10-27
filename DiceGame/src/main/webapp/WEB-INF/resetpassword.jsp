<%--
  Created by IntelliJ IDEA.
  User: houdamoudni
  Date: 3/25/24
  Time: 9:47 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/Style/login-style.css"
          rel="stylesheet">
    <title>Login</title>
</head>
<body>
<div class="wrapper">
    <div class="title-text">
        <div class="title login">
            Reset Password
        </div>
    </div>
    <div class="form-container">
        <div class="form-inner">
            <form method="POST" action="${pageContext.request.contextPath}/resetpassword" class="login">
                <div class="field">
                    <input type="email" name="email" placeholder="email" required>
                </div>
                <div class="field btn">
                    <div class="btn-layer"></div>
                    <input type="submit" value="Submit">
                </div>
                <div class="signup-link">
                    Don't Have Account? <a href="${pageContext.request.contextPath}/register">Create A New</a>
                </div>
            </form>
        </div>
    </div>



</div>
</body>
</html>
