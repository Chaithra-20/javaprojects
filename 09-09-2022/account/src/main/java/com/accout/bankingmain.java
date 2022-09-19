package com.accout;
import java.util.*;
public class bankingmain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner ck=new Scanner(System.in);
		cusdao dao=new cusdao();
		System.out.println("\t\t------Welcome to Anudip Bank------\t\t");
		System.out.println("Select operation: \n 1. for Register account /n 2. for Login");
		int op=ck.nextInt();
		Customer c1=new Customer();
		switch(op) {
		
		case 1-> {
				System.out.println("Enter details to Register");
				System.out.print("Enter the Customer Name : ");
				String cusname=ck.next();
				System.out.print("Enter Customer Password ");
				String cuspwd=ck.next();
				System.out.print("Enter Customer Phone Number ");
				String cusphone=ck.next();
				System.out.print("Enter Customen minimum Balance ");
				int cusbal=ck.nextInt();
				c1.cname=cusname;
				c1.cpassword=cuspwd;
				c1.cphone=cusphone;
				c1.caccbal=cusbal;
				dao.connect();
				int res=dao.registerCustomer(c1);
				if(res==1) {
					System.out.println("Registered Succesfully");
				}
				else {
					System.out.println("User is already exist");
				}
				
		}
		case 2-> {
			System.out.println("Enter data to Login");
			System.out.println("Enter Customer name :");
			String cusname=ck.next();
			System.out.println("Enter Customer password :");
			String cuspwd=ck.next();
			dao.connect();
			int res=dao.login(cusname, cuspwd);
			if(res==0) {
				System.out.println("Invalid username or password ");
			}
			else if(res==-1) {
				System.out.println("User not found...Please Register");
			}
			else {
				System.out.println("Login Successful");
				
				System.out.println("Select operation: /n 1. for Withdraw /n 2. for Deposit /n 3. for check balance /n 4. for pin change ");
				int op2=ck.nextInt();
				switch(op2) {
				
				case 1-> {
					System.out.println("Enter amount to withdraw: ");
					int amount=ck.nextInt();
					int bal=dao.withdraw(res, amount);
					if(bal==-1) {
						System.out.println("Not enough balance ");
					}
					else {
						System.out.println("Withdraw done.... Available balance is : "+bal);
					}
				}
				case 2-> {
					System.out.println("Enter amount to deposit: ");
					int amount=ck.nextInt();
					int bal=dao.deposit(res, amount);
					if(bal==-1) {
					System.out.println("Deposit cancelled..try again after some time");	
					}
					else {
						System.out.println("Deposition done succesfully.....Available balance is :"+bal);
					}
				}
				case 3-> {
					System.out.println("Available Balance : "+dao.checkBalance(res));
				}
				case 4-> {
					System.out.println("Enter Present Password ");
					String oldPwd=ck.next();
					System.out.println("Enter new Password");
					String newPwd=ck.next();
					int count=dao.pinChange(res,oldPwd,newPwd);
					
					if(count==-1)
					{
						System.out.println("Password Wrong");
					}
					else {
						System.out.println("Password changed Susccessfully");
					}
				}
				default->System.out.println("Logout Successful");
				}
			}
		}
		}
		
	}

}
