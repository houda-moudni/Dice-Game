<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/Style/register-style.css"
          rel="stylesheet">
    <title>Register</title>
</head>
<body>

<div class="wrapper">
    <div class="title-text">
        <div class="title login">
            Account Register
        </div>
    </div>
    <div class="form-container">
        <div class="form-inner">

            <form method="POST" action="${pageContext.request.contextPath}/register" class="signup">
                <div class="field">
                    <input type="text" name="nom" placeholder="First Name" required>
                </div>
                <div class="field">
                    <input type="text" name="prenom" placeholder="Last Name" required>
                </div>
                <div class="field">
                    <input type="email" name="email" placeholder="Email" required>
                </div>
                <div class="field">
                    <input type="text" name="username" placeholder="Username" required>
                </div>
                <div class="field">
                    <input type="password" name="password" placeholder="Password" required>
                </div>
                <div class="field btn">
                    <div class="btn-layer"></div>
                    <input type="submit" value="SignUp">
                </div>

                <div class="signup-link">
                    You Already Have Account? <a href="${pageContext.request.contextPath}/LoginServlet">Login</a>
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
<%--  Time: 1:20 AM--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>register</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>Register</h1>--%>

<%--<form method="POST" action="${pageContext.request.contextPath}/register">--%>
<%--    firstname<input name="nom" type="text"> <br>--%>
<%--    lastname<input name="prenom" type="text"> <br>--%>
<%--    Username<input name="username" type="text"> <br>--%>
<%--    Password<input name="password" type="password"> <br>--%>
<%--    <input type="submit" name="submit">--%>
<%--    <a href="${pageContext.request.contextPath}/LoginServlet">Sign In</a>--%>
<%--</form>--%>

<%--</body>--%>
<%--</html>--%>
