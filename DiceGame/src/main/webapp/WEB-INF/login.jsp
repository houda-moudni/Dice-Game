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
                    Account Login
                </div>
            </div>
            <div class="form-container">
                <div class="form-inner">
                        <form method="POST" action="${pageContext.request.contextPath}/LoginServlet" class="login">
                                <div class="field">
                                    <input type="text" name="username" placeholder="Username" required>
                                </div>
                                <div class="field">
                                    <input type="password" name="password" placeholder="Password" required>
                                </div>
                                <div class="pass-link">
                                    <a href="${pageContext.request.contextPath}/resetpassword">Reset password?</a>
                                </div>
                                <div class="field btn">
                                    <div class="btn-layer"></div>
                                    <input type="submit" value="Login">
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












































                <%--&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: houdamoudni--%>
<%--  Date: 3/24/24--%>
<%--  Time: 1:19 AM--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Login</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--    <h1>Login</h1>--%>
<%--    <form method="POST"--%>
<%--          action="${pageContext.request.contextPath}/LoginServlet">--%>
<%--        Username<input name="username" type="text"> <br>--%>
<%--        Password<input name="password" type="password"> <br>--%>
<%--        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>--%>
<%--        <a href="${pageContext.request.contextPath}/register">Register</a>--%>

<%--    </form>--%>

<%--</body>--%>
<%--</html>--%>
