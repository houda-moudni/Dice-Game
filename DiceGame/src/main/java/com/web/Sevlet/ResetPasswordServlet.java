
package com.web.Sevlet;

import com.bo.User;
import com.web.helpers.GameContextManagement;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.UUID;
import java.util.Properties;

@WebServlet("/resetpassword")
public class ResetPasswordServlet extends HttpServlet {

    private void sendEmail(String recipientEmail, String subject, String body)
            throws MessagingException {

        String senderEmail = "moudnihouda261@gmail.com";
        String senderPassword = "Your_password";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(senderEmail));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
        message.setSubject(subject);
        message.setText(body);

        Transport.send(message);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/resetpassword.jsp").forward(req,resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");

        GameContextManagement gameContextManagement = GameContextManagement.getInstance(req.getServletContext());
        User user = gameContextManagement.getUserByEmail(email);

        if(user != null){
            String resetToken = UUID.randomUUID().toString();
            System.out.println(resetToken);
            gameContextManagement.updateUserPassword(email, resetToken);
            String emailBody = "Your password has been reset. Your new password is: [TOKEN] ." + resetToken +
                    "Please use this token as your password to log in. " ;

            try {
                sendEmail(email, "RESET PASSWORD", emailBody);
                req.setAttribute("msg", "INFO : Check your email for your updated password");
                req.getRequestDispatcher("/WEB-INF/error.jsp").forward(req, resp);
                return;

            } catch (MessagingException e) {
                System.out.println(e);
                req.setAttribute("msg", "ERROR : Failed to send email. Please try again later.");
                req.getRequestDispatcher("/WEB-INF/error.jsp").forward(req, resp);
                return;
            }
        } else {
            req.setAttribute("msg", "ERROR : Email Incorrect");
            req.getRequestDispatcher("/WEB-INF/error.jsp").forward(req, resp);
            return;
        }



    }
}

