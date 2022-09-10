package jdbc.com;
import java.sql.*;
public class jdbcexm1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/anudip";
		String username="root";
		String password="789910";
		String query="select * from anudipemp where eid=101";
	Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String data=rs.getString(1)+" is "+rs.getString(2)+" worked with "+rs.getString(3)+" with "+rs.getInt(4);
		System.out.println(data);
		con.close();
	}

}
