package com.banking;

import java.util.Scanner;
import static java.lang.System.*;
public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ck=new Scanner(System.in); //creating new scanner object
		datavalidation dv=new datavalidation(); // create new object for datavalidation
		out.println("Welcome to Signup Page");
		out.println("Enter username"); // get input from the user for username
		String username=ck.next(); // reading the entered username
		try {
			if(dv.checkUsername(username)) {//checking the username 
			
				out.println("Enter Password"); // get input from the user for password
				String password=ck.next(); // reading the entered password
					try {
						if(dv.checkPassword(password))//checking password
						{
							out.println("Phone Number");
							String phone=ck.next();
							try {
								if(dv.checkPhone(phone))
								{
									out.println("Signup successful");
									out.println("username :" +username+ "password "+password+ "phone number "+phone);
							}
						}
							catch(Exception e) {
								out.println(e.getMessage());
							}
						}
					}
					catch(Exception e) {
						out.println(e.getMessage());
					}				
			}
			
		}
		catch(Exception e) {
			out.println(e.getMessage());
		}
	ck.close();//close scanner
	}


	}


