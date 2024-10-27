package com.web.Sevlet;

import com.bo.Game;
import com.bo.User;
import com.web.helpers.GameContextManagement;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/game")
public class GameServlet extends HttpServlet {

    protected void play(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = request.getServletContext();
        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("users");
        Integer highScore = (Integer) context.getAttribute("highScore");

        Game game = (Game) session.getAttribute("gameData");

        GameContextManagement gameContext = GameContextManagement.getInstance(context);

        int userInputDice = Integer.parseInt(request.getParameter("userInputDice"));

        if(userInputDice >=1 && userInputDice <= 3) {

            boolean gameOver = game.play(user, userInputDice);
            if (gameOver){
                if(highScore == null || highScore < user.getScore()){

                    user.setHighScore(user.getScore());
                    gameContext.updateScore(user);
                }
                request.getRequestDispatcher("/WEB-INF/score.jsp").forward(request,response);
            } else {
                request.getRequestDispatcher("/WEB-INF/game.jsp").forward(request, response);
            }
        }
            else{
            request.setAttribute("msg","ERROR : Roll one of the dices {1 , 2 , 3}." );
            request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        play(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        play(req,resp);
    }
}












