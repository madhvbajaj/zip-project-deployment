package com.madhv.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get employee data
        String employeeName = request.getParameter("name");
        String employeeId = request.getParameter("id");
        
        response.setContentType("text/html");
        response.getWriter().println("<h1>Employee Information</h1>");
        response.getWriter().println("<p>Name: " + employeeName + "</p>");
        response.getWriter().println("<p>ID: " + employeeId + "</p>");
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
