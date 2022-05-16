package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private String login;
	private String password;
	private PrintWriter printWriter;
	boolean result;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		login= request.getParameter("txtlogin");
//		password=request.getParameter("txtPassword");
//		
//		printWriter=response.getWriter();
//		if(login.equals("Santosh@11") && password.equals("Admin@123"))
//		{    printWriter.println("Login sucessfully");
//			printWriter.println("Welcome user");
//		}
//		else
//		{
//			printWriter.println("Invalid id passsword");
//		}
//		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		login= request.getParameter("txtlogin");
		password=request.getParameter("txtPassword");
		
		printWriter=response.getWriter();
		if(login.equals("Santosh@11") && password.equals("Admin@123"))
		{    printWriter.println("Login sucessfully");
			printWriter.println("Welcome user");
		}
		else
		{
			printWriter.println("Invalid id passsword");
		}
	}

}
