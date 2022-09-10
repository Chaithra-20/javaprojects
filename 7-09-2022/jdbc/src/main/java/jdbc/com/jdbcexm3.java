package jdbc.com;
import java.sql.*;
public class jdbcexm3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/anudip";
		String username="root";
		String password="789910";
		String query="insert into anudipemp values(105,'Nayana','Python',40000)";
	Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		int res=st.executeUpdate(query);
		
		System.out.println(res+" row(s) affected");
		con.close();
	
		
	}

}
