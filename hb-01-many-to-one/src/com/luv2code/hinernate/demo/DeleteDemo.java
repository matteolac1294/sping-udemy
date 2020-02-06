package com.luv2code.hinernate.demo;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {

	public static void main(String[] args) {
		org.hibernate.SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			Course tempcourse = session.get(Course.class, 12);

		session.delete(tempcourse);
			
			
			session.getTransaction().commit();
		}

		catch (Exception e) {
			e.printStackTrace();

		} finally {
			session.close();
		}

	}

}
