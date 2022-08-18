package com.string;

/*@Chaithra K
 java program to print common elements in two arrays  
 */
import java.util.*;
import static java.lang.System.*;
public class similarElements {
	public static void main(String args[])
	{
		Scanner ck=new Scanner(System.in); // creating scanner object
		out.println("Enter the length of an array"); //get input length of an array from the user
		int len=ck.nextInt();// reading array length
		out.println("Enter the Elements of first array :"); // getting elements of first array
		int a[]=new int[len]; 
		for(int i=0;i<len;i++) 	
		{
			 a[i]=ck.nextInt();//reading first array elements
		}
		out.println("Enter the Elements of second array :"); //getting elements of second array
		int b[]=new int[len];
		for(int i=0;i<len;i++) 	
		{
			 b[i]=ck.nextInt();//reading second array elements
		}
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
		{
			if(a[i] == (b[j]))// comparing 2 array elements and print
			{
				out.println("common elements is "+a[i]);
			}
		
	
		}
		}
		ck.close();// closing scanner
	}

}