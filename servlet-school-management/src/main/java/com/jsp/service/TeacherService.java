package com.jsp.service;

import java.util.List;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Student;
import com.jsp.dto.Teacher;

public class TeacherService {

	TeacherDao teacherDao= new TeacherDao();
	
	public Teacher saveTeacher(Teacher teacher) {
		if(teacher!=null) {
			return teacherDao.saveTeacher(teacher);
		}else {
			return null;
		}
	}
	public Teacher updateTeacherById(int id,String teacher_name, String teacher_email, String password) {
		Teacher teacher=teacherDao.getTeacherById(id);
		teacher.setTeacher_name(teacher_name);
		teacher.setTeacher_email(teacher_email);
		teacher.setTeacher_password(password);
		return teacherDao.saveTeacher(teacher);
	}
	public Teacher getTeacherById(int id) {
	
		if(id>0) {
			return teacherDao.getTeacherById(id);
		}else {
			return null;
		}
	}
	public Student getStudentById(int id) {
		if(id>0) {
			return teacherDao.getStudentById(id);
		}else {
			return  null;
		}
	}
	public boolean deleteTeacherById(int id) {
		if(id>0) {
			return teacherDao.deleteTeacherById(id);
		}else {
			return false;
		}
	}
	public List<Student> getAllStudents(){
		return teacherDao.getAllStudents();
	}
	public Student updateStudentById(Student student,int id) {
		return teacherDao.updateStudentById(student, id);
		
	}
	
}
