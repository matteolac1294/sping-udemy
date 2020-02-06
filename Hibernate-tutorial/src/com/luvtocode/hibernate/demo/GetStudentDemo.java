package com.luvtocode.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.luvtocode.hibernate.demo.entity.Student;

public class GetStudentDemo {

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
			session = factory.getCurrentSession();
			session.beginTransaction();
			Student newStudent = session.get(Student.class, id);
			System.out.println(newStudent.getFirstNamae());
			
			session.close();
			
			session = factory.getCurrentSession();
		session.beginTransaction();
			List<Student> students = session.createQuery("from Student where firstName = 'matteo'").getResultList();

			for (Student s : students) {
				System.out.println(s.getLasttNamae());
			}

		} finally {
			factory.close();
		}
	}

}
