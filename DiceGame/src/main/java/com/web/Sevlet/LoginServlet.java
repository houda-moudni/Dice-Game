package com.web.Sevlet;

import com.bo.Game;
import com.bo.User;
import com.web.helpers.GameContextManagement;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(req,resp);


    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        GameContextManagement contextManagement = GameContextManagement.getInstance(getServletContext());
        User user = contextManagement.getUserByLogin(username.trim());

        if(user != null){
            if(user.getPassword()!= null && user.getPassword().equals(password)){

                req.getSession().setAttribute("gameData", new Game(user));
                req.getSession().setAttribute("users", user);

                getServletContext().getRequestDispatcher("/WEB-INF/game.jsp").forward(req,resp);
                return;

            } else {
                req.setAttribute("msg","ERROR : Username or password incorrect");
                getServletContext().getRequestDispatcher("/WEB-INF/error.jsp").forward(req,resp);

            }
        }else {
            req.setAttribute("msg","ERROR : Username or password incorrect");
            getServletContext().getRequestDispatcher("/WEB-INF/error.jsp").forward(req,resp);

        }
        }

}

