// Java program to print sum of odd numbers in arrayList 
// using lambda expression with Stream API 


package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.System.*;

public class sumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(20);
		al.add(1);
		al.add(4);
		al.add(13);
		al.add(7);
		
		int res=al.stream().filter(i->i%2!=0).reduce(0,(i,j)->i+j);
		
		System.out.println(res);
	}

}
