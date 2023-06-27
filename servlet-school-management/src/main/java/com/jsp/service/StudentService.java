package com.jsp.service;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
	StudentDao studentDao = new StudentDao();

	public Student saveStudent(Student student) {
		if (student != null) {
			return studentDao.saveStudent(student);
		} else {
			return null;

		}
	}
	public Student getStudentById(int id) {
		if(id>0) {
			return studentDao.getStudentById(id);
		
		}else {
			return null;
		}
	}
	public Student updateStudentById(int id, String name, String email, String password) {
		Student student2=studentDao.getStudentById(id);
		student2.setStudent_name(name);
		student2.setStudent_email(email);
		student2.setPassword(password);
		return studentDao.saveStudent(student2);
				
	}

	public boolean deleteStudentById(int id) {
		if(id>0) {
			return studentDao.deleteStudentById(id);
		}else {
			return false;
		}
	}
}
