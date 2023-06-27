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
import com.jsp.service.TeacherService;

@WebServlet("/update")
public class Updatestudenttable extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TeacherService teacherService= new TeacherService();
		Student student= new Student();
		
		String id=req.getParameter("studentId");
		int id1= Integer.parseInt(id);
		String name= req.getParameter("studentname");
		String email= req.getParameter("studentemail");
		Student s= teacherService.getStudentById(id1);
		if(s!=null) {
			s.setStudent_name(name);
			s.setStudent_email(email);
		}
		Student s1=teacherService.updateStudentById(s, id1);
		 PrintWriter printWriter=resp.getWriter();
		 printWriter.write("<html><body><h1>"+"New Record is Updated Successfully"+"</h1></body></html>");	
		
		System.out.println(id1);
	}

}
