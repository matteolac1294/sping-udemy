package com.luvtocode.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.luvtocode.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		org.hibernate.SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
Student student = new Student("Matteo4", "lacitignola", "lacitignoalemail.com");
		try {
			
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
			int id = student.getId();
			
			
		} finally {
			factory.close();
		}
	}

}
