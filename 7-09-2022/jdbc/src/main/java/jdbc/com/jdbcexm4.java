package jdbc.com;

import java.sql.*;
import java.util.*;
public class jdbcexm4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner ck=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/anudip";
		String username="root";
		String password="789910";
		int empid,empsalary;
		String empname,empdomain;
		
		System.out.println("-------Welcome to Employee Management System---------");
		System.out.print("Enter Emp Id");
		empid=ck.nextInt();
		System.out.print("Enter Emp Name");
		empname=ck.next();
		System.out.print("Enter Emp Domain");
		empdomain=ck.next();
		System.out.print("Enter Emp Salary");
		empsalary=ck.nextInt();
		
		String query="insert into anudipemp values(?,?,?,?)";
	Connection con=DriverManager.getConnection(url,username,password);
	
	
	PreparedStatement pst=con.prepareStatement(query);
	pst.setInt(1, empid);
	pst.setString(2,empname);
	pst.setString(3, empdomain);
	pst.setInt(4, empsalary);
	int count=pst.executeUpdate();
	System.out.println(count+"row(s) affected");
	}

}
