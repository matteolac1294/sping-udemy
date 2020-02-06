package com.luv2code.hinernate.demo;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

	public static void main(String[] args) {
		org.hibernate.SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			Instructor tempInstructor = session.get(Instructor.class, 1);

			Course course1 = new Course();
			course1.setTitle("test1");
			tempInstructor.addCorse(course1);
			
			session.save(course1);
			session.getTransaction().commit();
		}

		catch (Exception e) {
			e.printStackTrace();

		} finally {
			session.close();
		}

	}

}
