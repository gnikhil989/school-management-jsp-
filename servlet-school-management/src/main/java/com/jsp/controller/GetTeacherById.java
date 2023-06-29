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

@WebServlet("/getTeacherById")
public class GetTeacherById extends HttpServlet {
TeacherService teacherService= new TeacherService();

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String id=req.getParameter("id");
int id1= Integer.parseInt(id);
Teacher teacher=teacherService.getTeacherById(id1);
if(teacher!=null) {
	PrintWriter printWriter=resp.getWriter();
	 printWriter.write("<html><body><h3>"+"ID of the Tacher is :-  "+teacher.getId()+"</h3></body></html>");	
	 printWriter.write("<html><body><h3>"+"Name of the Teacher is :-  "+teacher.getTeacher_name()+"</h3></body></html>");	
	 printWriter.write("<html><body><h3>"+"Email of the Teacher is :-  "+teacher.getTeacher_email()+"</h3></body></html>");	
	 printWriter.write("<html><body><h3>"+"Password of the Teacher is :-  "+teacher.getTeacher_password()+"</h3></body></html>");			
	 
}

	}
}
