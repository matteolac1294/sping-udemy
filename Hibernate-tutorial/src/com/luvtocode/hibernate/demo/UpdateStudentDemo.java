package com.luvtocode.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.luvtocode.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		org.hibernate.SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		try {
			
			session.beginTransaction();
		Student student =	session.get(Student.class, 1);
			System.out.println("before the name  was: "+ student.getFirstNamae() );
			student.setFirstNamae("Chris");
			session.getTransaction().commit();
			
			session = factory.getCurrentSession();
			session.beginTransaction();
		Student	student2 =	session.get(Student.class, 1);
			System.out.println("now the name is: "+ student2.getFirstNamae() );
			
			
		
			
		} finally {
			factory.close();
		}
	}

}
