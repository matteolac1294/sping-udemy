package com.luvtocode.hibernate.demo.bi;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

	public static void main(String[] args) {
		org.hibernate.SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {

			session.beginTransaction();
			InstructorDetail detail = session.get(InstructorDetail.class, 1);

			System.out.println(detail.getInstructor());
		}

		catch (Exception e) {
			e.printStackTrace();

		} finally {
			session.close();
		}

	}

}
