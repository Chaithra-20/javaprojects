package com.emphibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf=new Configuration().configure().addAnnotatedClass(student.class).addAnnotatedClass(laptop.class);
		
		SessionFactory sf=conf.buildSessionFactory();
		Session ses=sf.openSession();
		
		Transaction tc=ses.beginTransaction();
		
		student s1=new student();
		s1.setStuId(28);
		s1.setStuName("Chaithra");
		s1.setStuBranch("Computer Science");
		
		laptop l1=new laptop();
		l1.setLapId(101);
		l1.setLapName("Lenovo ideapad S340");
		
		laptop l2=new laptop();
		l2.setLapId(102);
		l2.setLapName("HP 240 G8(53L43PA");
		
		laptop l3=new laptop();
		l3.setLapId(103);
		l3.setLapName("Realme Book(Slim)");
		
		laptop l4=new laptop();
		l4.setLapId(104);
		l4.setLapName("Acer Extensa 15");
		
		List<laptop> ll=new ArrayList<laptop>();
		ll.add(l1);
		ll.add(l2);
		ll.add(l3);
		ll.add(l4);
		
		s1.setStuLap(ll);
		ses.save(s1);
		ses.save(l1);
		ses.save(l2);
		ses.save(l3);
		ses.save(l4);
		
		tc.commit();
	}

}
