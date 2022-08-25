package com.Sorting;

import java.util.Comparator;

public class AgeComparator implements Comparator <Student> {

	@Override
	public int compare(Student s1,Student s2) {
		 
		if(s1.studentAge==s2.studentAge)
			return 0;
		if(s1.studentAge>s2.studentAge)
			return 1;
		else
			return -1;
		
}
	
}
