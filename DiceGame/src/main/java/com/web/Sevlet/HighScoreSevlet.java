package com.web.Sevlet;

import com.bo.User;
import com.web.helpers.GameContextManagement;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/highscore")
public class HighScoreSevlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        GameContextManagement contextGame = GameContextManagement.getInstance(getServletContext());

        List<User> users = contextGame.getAllUsers();
        req.setAttribute("users", users);

        getServletContext().getRequestDispatcher("/WEB-INF/highscore.jsp").forward(req,resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doGet(req, resp);
    }



}
