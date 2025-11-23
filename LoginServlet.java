package com.codegnan.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		String password=request.getParameter("upwd");
		out.println("<html><body>");
		out.println("<h1 style='color:red' align='center'>");
		if(name.equals("Naganjali")&&password.equals("Naga@123")) {
			out.print("Success");
		}else {
			out.println("Failure");
		}
		out.println("</h1>");
		out.println("<h3 align='center'>");
		out.println("<a href='./register.html'>|Login Form|</a>");
		out.print("</h3></body></html>");
		out.close();
	}

}
