package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

@WebServlet("/teacherinfo")
public class TeacherSaveController extends HttpServlet{

	TeacherService teacherService= new  TeacherService();
	Teacher teacher= new Teacher();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String name=req.getParameter("teacher_name");
		 String email= req.getParameter("teacher_email");
		 String password= req.getParameter("password");
		 Teacher t1=teacherService.saveTeacher(teacher);
		 if(t1!=null) {
			 PrintWriter printWriter=resp.getWriter();
			 printWriter.write("<html><body><h1>"+"Registration of Teacher is Successful"+"</h1></body></html>");
			 
		 }
	}
	
}
