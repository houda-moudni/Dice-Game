<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.List" %>
<%@ page import="com.bo.User" %>
<%@ page import="com.bo.Game" %>

<%
    List<User> users = (List<User>) request.getAttribute("users");
    Game game = (Game) request.getSession().getAttribute("gameData");
%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Style/bootstrap.min.css">
    <link href="${pageContext.request.contextPath}/Style/highscore-style.css" rel="stylesheet">

    <title>HighScore</title>
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
    <h1>Highest Scores</h1>
    <div class="container-fluid">
        <table class="table table-striped">
            <thead>
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Username</th>
                <th scope="col">HighScore</th>
            </tr>
            </thead>
            <tbody>
            <%

                //On affiche le best score
                for (User it : users) {
                    out.print("<tr><td>" + it.getNom() + " " + it.getPrenom() + "</td><td>" + it.getUsername() + "</td><td>" + it.getHighScore() + "</td></tr>");

                }
                out.print("</table>");
            %>
            </tbody>
        </table>
    </div>








<%--    <%--%>
<%--        for(User user : users){--%>
<%--            out.print(" HighestScore : " +user.getHighScore());--%>
<%--        }--%>

<%--    %>--%>



</div>

</body>
</html>










<%--
  Created by IntelliJ IDEA.
  User: houdamoudni
  Date: 3/24/24
  Time: 1:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>

<%--<%--%>
<%--    List<User> users = (List<User>) request.getAttribute("users");--%>
<%--    Game game = (Game) request.getSession().getAttribute("gameData");--%>
<%--%>--%>

<%--<html>--%>
<%--<head>--%>
<%--    <title>Score</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--    <h2> HIGH SCORE </h2>--%>
<%--        <%--%>
<%--            for(User user : users){--%>
<%--                out.print(user.getUsername() + " : " +user.getHighScore());--%>
<%--            }--%>

<%--        %>--%>

<%--    <br>--%>
<%--    <a href="${pageContext.request.contextPath}/resetgame">Play</a>--%>



<%--</body>--%>
<%--</html>--%>
