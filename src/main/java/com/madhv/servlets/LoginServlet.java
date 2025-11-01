package com.madhv.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Simple validation
        if (username != null && password != null && !username.isEmpty() && !password.isEmpty()) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("employee.html");
        } else {
            response.sendRedirect("login.html?error=1");
        }
    }
}
