package jdbc.com;
import java.sql.*;
public class empdao {
	
	Connection con=null;
	public void connect() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","789910");
		
	}
	public int addEmployee(employee e1)throws Exception  {
		String query="insert into anudipemp values(?,?,?,?)";
		
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, e1.eid);
		pst.setString(2, e1.ename);
		pst.setString(3, e1.edomain);
		pst.setInt(4,e1.esalary);
		int count=pst.executeUpdate();
		return count;
		
	}

	public employee getEmployee(int eid)throws Exception {
		String query="select * from anudipemp where eid="+eid;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		employee e1=new employee();
		if(rs.next()) {
			e1.eid=rs.getInt(1);
			e1.ename=rs.getString(2);
			e1.edomain=rs.getString(3);
			e1.esalary=rs.getInt(4);
			return e1;		
		}
		else {
			return e1;
		}
}
	public String getEmpName(int eid)throws Exception
	{
		String query="select * from anudipemp where eid="+eid;
		 Statement st=con.createStatement();
		 ResultSet rs=st.executeQuery(query);
		 if(rs.next())
		 {
			 String empname=rs.getString(2);
			 return empname;
			 
		 }
		 else {
			 return null;
		 }
	}
	public String getEmpDomain(String ename)throws Exception
	{
		String query="select * from anudipemp where ename='"+ename+"'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		if(rs.next())
		{
			String empdomain=rs.getString(3);
			return empdomain;
		}
		else {
			return null;
		}
	}
}
