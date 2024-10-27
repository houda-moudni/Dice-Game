<%@ page import="com.bo.Game" %>
<%@ page import="com.bo.User" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%
    List<User> users = (List<User>) request.getAttribute("users");
    Game game = (Game) request.getSession().getAttribute("gameData");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/Style/score-style.css" rel="stylesheet">
    <title>Score</title>
</head>
<body>
<div class="nav-bar">
    <ul>
        <li><a href="${pageContext.request.contextPath}/highscore" class="nav-link">HIGHEST SCORES</a></li>
        <li><a href="${pageContext.request.contextPath}/resetgame" class="nav-link">RESET GAME</a></li>
        <li><a href="${pageContext.request.contextPath}/signout" class="nav-link">SIGN OUT</a></li>
        <li>User Connected : <%=  game.getUser().getUsername() %></li>
    </ul>
</div>

<div class="gameover">

    <h1>GAME OVER</h1>
    <span>Get User Score</span>


    <div class="score">
        Your Score :
        <%
            Game gameState = (Game) request.getSession().getAttribute("gameData");

            if (gameState != null && gameState.getUser() != null) {

                out.print(gameState.getUser().getScore());

            }
        %>

    </div>

</div>

</body>
</html>







<%--&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: houdamoudni--%>
<%--  Date: 3/24/24--%>
<%--  Time: 11:09 AM--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>game score</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--    <h1> Game Over</h1>--%>
<%--    <%--%>
<%--        Game gameState = (Game) request.getSession().getAttribute("gameData");--%>

<%--        if (gameState != null && gameState.getUser() != null) {--%>
<%--            out.print(gameState.getUser().getScore());--%>
<%--        }--%>
<%--    %>--%>

<%--    <a href="${pageContext.request.contextPath}/resetgame">Play</a>--%>


<%--</body>--%>
<%--</html>--%>
