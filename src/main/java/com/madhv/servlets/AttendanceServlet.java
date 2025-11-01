package com.madhv.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class AttendanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String employeeId = request.getParameter("employeeId");
        String status = request.getParameter("status");
        Date date = new Date();
        
        // Process attendance
        response.setContentType("text/html");
        response.getWriter().println("<h1>Attendance Recorded</h1>");
        response.getWriter().println("<p>Employee ID: " + employeeId + "</p>");
        response.getWriter().println("<p>Status: " + status + "</p>");
        response.getWriter().println("<p>Date: " + date + "</p>");
    }
}
