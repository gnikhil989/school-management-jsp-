package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.TeacherService;

@WebServlet("/delete")
public class Deletestudenttable extends HttpServlet {
	TeacherService teacherService= new TeacherService();
	Student student= new Student();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id= req.getParameter("studentId");
		int id1=Integer.parseInt(id);
		boolean s= teacherService.deleteStudentById(id1);
		if(s==true) {
			 PrintWriter printWriter=resp.getWriter();
			 printWriter.write("<html><body><h1>"+" Record Deleted Successfully"+"</h1></body></html>");	
			
		}
	}

}
