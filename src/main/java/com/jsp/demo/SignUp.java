package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SignUp extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(req, res);
		
	}

}
