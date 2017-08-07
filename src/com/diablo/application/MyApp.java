package com.diablo.application;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.diablo.entity.Student;

public class MyApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Student st = new Student();
		st.setName("amit");
		st.setMarks(500);
		st.setJoindate(new Date());
		s.save(st);
		t.commit();
		s.close();
		System.out.println("inserted successfully");
		
		

	}

}
