package com.mindgate.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AcceptDetailsServlet")
public class AcceptDetailsServlet extends HttpServlet {
	private PrintWriter out;
	private double number1;     
	private double number2;   
	private double result;   
   
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		number1=Double.valueOf(request.getParameter("txtNumber1"));
		number2=Double.parseDouble( request.getParameter("txtNumber1"));
		result=number1+number2;
		out=response.getWriter();
		out.println("Addition of : "+number1 +" and :"+ number2 +" Result :" + result );
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
