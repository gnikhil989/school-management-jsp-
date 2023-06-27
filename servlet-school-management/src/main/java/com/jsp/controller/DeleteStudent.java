package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@WebServlet("/deleteStudent")
public class DeleteStudent  extends HttpServlet{
	StudentService  studentService= new StudentService();
	Student student=new Student();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id= req.getParameter("id");
		int id1=Integer.parseInt(id);
		
		if(id1!=0) {
			boolean s= studentService.deleteStudentById(id1);
			if(s==true) {
				 PrintWriter printWriter=resp.getWriter();
				 printWriter.write("<html><body><h1>"+"Student Record With ID  "+id1+"is Successfully DELETED"+"</h1></body></html>");
				 
			}
		}
		
	}

}
