package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		String password=request.getParameter("upwd");
		String phone=request.getParameter("umobile");
		String email=request.getParameter("uemail");
		
		out.println("<html><body style='font-family:Arial'>");
		out.println("<h2 style='color:green'>User Registration Details</h2>");
		out.println("<p><b>User Name: </b>"+name+"</p>");
		out.println("<p><b>User Password: </b>"+password+"</p>");
		out.println("<p><b>User Mobile: </b>"+phone+"</p>");
		out.println("<p><b>User Email: </b>"+email+"</p>");
		out.println("</body></html>");
		out.close();		
	}

}
