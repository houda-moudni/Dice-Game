package com.web.Sevlet;

import com.bo.Messages;
import com.bo.User;
import com.web.helpers.GameContextManagement;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/Register.jsp").forward(req, resp);
        return;

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext cntx = getServletContext();

        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User(nom, prenom, email, username, password, 0, 0);

        GameContextManagement gameContext = GameContextManagement.getInstance(getServletContext());

        if (gameContext.getUserByLogin(username) != null) {

            request.setAttribute("msg", "ERROR : Username Already exist");
            cntx.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
            return;

        }
        gameContext.insertUser(user);
        cntx.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        return;
    }
}
