package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private String name;
	private double salary;
	private PrintWriter out;
	private EmployeeDAO employeeDAO=new EmployeeDAO();
	private boolean result;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out=response.getWriter();
		name=request.getParameter("textName");
		salary =Double.parseDouble(request.getParameter("txtSalary"));
		out.println("name :: "+ name);
		out.println("salary :: "+salary);
		Employee employee=new Employee(0, name, salary);
		result=employeeDAO.addEmployee(employee);
		response.setContentType("text/html");
		if(result) {
			out.println("Record added sucessfully");
		out.println("<a href = employee.html>Home page</a>");}
		else {
			out.println("Failed to add record");
		out.println("<a href = employee.html>Home page</a>");}

		
	}

}
