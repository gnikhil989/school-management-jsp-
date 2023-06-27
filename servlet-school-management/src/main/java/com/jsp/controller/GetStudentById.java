package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@WebServlet("/getStudentById")
public class GetStudentById extends HttpServlet{
	
	StudentService studentService=new StudentService();
	Student student= new Student();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 PrintWriter printWriter=resp.getWriter();
		 printWriter.write("<html><body><h1>"+"You Are UnAuthorize To Access Others Details"+"</h1></body></html>");
	}

}
