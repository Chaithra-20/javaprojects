package com.accout;
import java.sql.*;
public class cusdao {
	
	Connection con=null;
	public void connect()throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","789910");
	}
	
	public int registerCustomer(Customer c1)throws Exception {
		
		String query2="select * from banking where cname='"+c1.cname+"'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query2);
		if(rs.next())
		{
			return -1;
		}
		else {
			String query="insert into banking (cname,cpassword,cphone,caccbal) values (?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,c1.cname);
			pst.setString(2, c1.cpassword);
			pst.setString(3, c1.cphone);
			pst.setInt(4, c1.caccbal);
			
			int count=pst.executeUpdate();
			return count;
			
		}
	}
	public int login(String username,String pwd)throws Exception {
		
		String query2="select * from banking where cname='"+username+"'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query2);
		if(rs.next())
		{
			String password=rs.getString(3);
			if(password.equals(pwd)) {
				int cid=rs.getInt(1);
				return cid;
			}
			else {
				return 0;
			}
		}
		else {
			return -1;
		}
	}
	
	public int withdraw(int cid,int amount)throws Exception {
		String query="select * from banking where cid="+cid;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		int accbal=rs.getInt(5);
		if(accbal>amount) {
			accbal-=amount;
			String query2="update banking set caccbal="+accbal+" where cid="+cid;
			PreparedStatement pst=con.prepareStatement(query2);
			pst.executeUpdate();
			return accbal;
			
		}
		else {
			return -1;
		}
	}
	public int deposit(int cid,int amount)throws Exception {
		String query="select * from banking where cid="+cid;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		if(rs.next())
		{
		int accbal=rs.getInt(5);
		
			accbal+=amount;
			String query2="update banking set caccbal="+accbal+" where cid="+cid;
			PreparedStatement pst=con.prepareStatement(query2);
			pst.executeUpdate();
			return accbal;
		}
		else {
			return -1;
		}
		
	}
	
}
