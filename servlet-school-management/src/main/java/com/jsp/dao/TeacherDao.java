package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;
import com.jsp.dto.Teacher;

public class TeacherDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikhil");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	public Teacher saveTeacher(Teacher teacher) {
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		return teacher;
	}
			

	public Teacher getTeacherById(int id) {
		
		Teacher teacher=entityManager.find(Teacher.class,id);
		return teacher;
	}
	public Student getStudentById(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikhil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		Student student=entityManager.find(Student.class,id);
		return student;
		
	}
	public Teacher updateTeacherById(int id,Teacher teacher) {
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		return teacher;
	}
	public boolean deleteTeacherById(int id) {
		Teacher teacher=entityManager.find(Teacher.class,id);
		entityTransaction.begin();
		entityManager.remove(teacher);
		entityTransaction.commit();
		return true;
	}
	public List<Student> getAllStudents(){
		String sql="SELECT s FROM Student s";
		Query query=entityManager.createQuery(sql);
		List<Student> students= query.getResultList();
		return students;
	}
	public boolean deleteStudentById(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikhil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		Student student= entityManager.find(Student.class, id);
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		return true;
	}
	public Student updateStudentById(Student student, int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikhil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		Student s2=entityManager.find(Student.class,id);
		if(s2!=null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
		}return student;
	}
}
