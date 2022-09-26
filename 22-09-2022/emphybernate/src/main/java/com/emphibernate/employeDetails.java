package com.emphibernate;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class employeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf=new Configuration().configure().addAnnotatedClass(employee.class).addAnnotatedClass(fresherEmployee.class).addAnnotatedClass(ExperienceEmployee.class);
	
		SessionFactory sf=conf.buildSessionFactory();	
		Session ses=sf.openSession();
		
		Transaction tc=ses.beginTransaction();
		
		fresherEmployee f1= new fresherEmployee();
		f1.setEmpId(1);
		f1.setEmpName("Chaithra");
		f1.setContractPeriod(2);
		f1.setIncrement(5);
		
		fresherEmployee f2= new fresherEmployee();
		f2.setEmpId(2);
		f2.setEmpName("Bharath");
		f2.setContractPeriod(3);
		f2.setIncrement(2);
		
		fresherEmployee f3= new fresherEmployee();
		f3.setEmpId(3);
		f3.setEmpName("Nayana");
		f3.setContractPeriod(2);
		f3.setIncrement(4);
		
		ExperienceEmployee e1=new ExperienceEmployee();
		e1.setEmpId(4);
		e1.setEmpName("Sushi");
		e1.setExperience(5);
		e1.setHike(10);
		
		ExperienceEmployee e2=new ExperienceEmployee();
		e2.setEmpId(5);
		e2.setEmpName("Thanu");
		e2.setExperience(3);
		e2.setHike(5);
		
		ExperienceEmployee e3=new ExperienceEmployee();
		e3.setEmpId(6);
		e3.setEmpName("Rathan");
		e3.setExperience(7);
		e3.setHike(15);
		
		ses.save(e3);
		ses.save(e2);
		ses.save(e1);
		ses.save(f3);
		ses.save(f2);
		ses.save(f1);
		
		tc.commit();
	
		
	}

}
