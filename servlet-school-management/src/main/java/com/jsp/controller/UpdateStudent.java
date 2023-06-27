package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@WebServlet("/updatestudent")
public class UpdateStudent extends HttpServlet {
	StudentService studentService=new StudentService();
	Student student= new Student();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name= req.getParameter("student_name");
	String email= req.getParameter("student_email");
	String password= req.getParameter("password");
	String id= req.getParameter("id");
	int id1=Integer.parseInt(id);

	
	if(id1 !=0 && name!=null && email!=null && password!=null) {
		student.setStudent_name(name);
		student.setStudent_email(email);
		student.setPassword(password);
		
		Student s= studentService.updateStudentById(id1, name, email, password);
		if(s!=null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("register.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
	System.out.println("All Good");
	
}
	
	}

