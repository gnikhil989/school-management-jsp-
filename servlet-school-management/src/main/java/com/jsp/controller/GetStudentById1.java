package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

@WebServlet("/getStudentById1")
public class GetStudentById1 extends HttpServlet {

	TeacherService teacherService = new TeacherService();
	Teacher teacher = new Teacher();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		int id1 = Integer.parseInt(id);
		Student student = teacherService.getStudentById(id1);
		if (student != null) {
			 PrintWriter printWriter=resp.getWriter();
			 printWriter.write("<html><body><h3>"+"ID of the student is :-  "+student.getId()+"</h3></body></html>");	
			 printWriter.write("<html><body><h3>"+"Name of the student is :-  "+student.getStudent_name()+"</h3></body></html>");	
			 printWriter.write("<html><body><h3>"+"Emailof the student is :-  "+student.getStudent_email()+"</h3></body></html>");	
			 printWriter.write("<html><body><h3>"+"Password of the student is :-  "+student.getPassword()+"</h3></body></html>");			
			 
		}

	}
}
