<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="com.bo.Game" %>

<%
    Game game = (Game) request.getSession().getAttribute("gameData");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/Style/game-style.css" rel="stylesheet">
    <title>game</title>
</head>
<body>
<section class="home" id="home">
    <div class="nav-bar">
        <ul>
            <li><a href="${pageContext.request.contextPath}/highscore" class="nav-link">HIGHEST SCORES</a></li>
            <li><a href="${pageContext.request.contextPath}/resetgame" class="nav-link">RESET GAME</a></li>
            <li><a href="${pageContext.request.contextPath}/signout" class="nav-link">SIGN OUT</a></li>
            <li>User Connected : <%=  game.getUser().getUsername() %></li>
        </ul>
    </div>

    <div class="user">

    </div>
    <form method="post"
          action="${pageContext.request.contextPath}/game">

        <img src="${pageContext.request.contextPath}/Style/static/dice.png" alt="">

        <div class="home-title-container">

            <label for="dice">Roll The Dice</label>
            <input name="userInputDice" type="text" id="dice" placeholder="Enter a number" required>
            <input type="submit" name="Play" class="button">

        </div>
    </form>
</section>
</body>
</html>



















