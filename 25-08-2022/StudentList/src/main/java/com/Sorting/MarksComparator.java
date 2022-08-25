package com.Sorting;

import java.util.Comparator;

public class MarksComparator implements Comparator <Student>{

	@Override
	public int compare(Student s1,Student s2) {
		
		if(s1.studentMarks==s2.studentMarks)
			return 0;
		if
		(s1.studentMarks>s2.studentMarks)
			return 1;
		else
			return -1;
		
}
}
