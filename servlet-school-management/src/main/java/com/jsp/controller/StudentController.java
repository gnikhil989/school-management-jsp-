package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/students")
public class StudentController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String register = req.getParameter("register");
		String delete = req.getParameter("delete");
		String update = req.getParameter("update");
		String getbyid = req.getParameter("getbyid");

		if (register != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("studentinfo.jsp");
			requestDispatcher.forward(req, resp);

		} else if (delete != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("deleteStudent.jsp");
			requestDispatcher.forward(req, resp);

		} else if (update != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("updatestudent.jsp");
			requestDispatcher.forward(req, resp);

		} else if (getbyid != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("getStudentById.jsp");
			requestDispatcher.forward(req, resp);


		}

	}

}
