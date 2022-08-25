package com.Sorting;

import java.util.Collections;
import java.util.LinkedList;

public class Classroom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" ---Student List---");
		
		Student s1=new Student(021,"Chaithra",22,780);
		Student s2=new Student(022,"Bhavana",25,700);
		Student s3=new Student(023,"Kavitha",24,650);
		Student s4=new Student(024,"Thanuja",23,750);
		Student s5=new Student(025,"Nayana",28,580);
		LinkedList<Student> ll=new LinkedList<Student>();
		ll.add(s5);
		ll.add(s4);
		ll.add(s3);
		ll.add(s2);
		ll.add(s1);
		System.out.println("---Student List based on Age---");
		Collections.sort(ll,new AgeComparator());
		for(Student s:ll)
			System.out.println(s.studentId+ " is "+s.studentName+ " , Age : "+s.studentAge+ " is obtained "+s.studentMarks+" marks");
		System.out.println("---Student List based on Marks---");
		Collections.sort(ll,new MarksComparator());
		for(Student s:ll)
			System.out.println(s.studentId+ " is "+s.studentName+ " , Age : "+s.studentAge+ " is obtained "+s.studentMarks+" marks");
		
	}
}
