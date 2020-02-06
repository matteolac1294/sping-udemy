package com.luvtocode.hibernate.demo.uni;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

	public static void main(String[] args) {
		org.hibernate.SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Instructor tempInstructor = new Instructor("Matteo", "Lacitignola", "matteolac@email.com");

		InstructorDetail detail = new InstructorDetail("matteo_youtube.com", "music");

		tempInstructor.setInstructorDetail(detail);

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(tempInstructor);
		session.getTransaction().commit();
		
		session.close();

	}

}
