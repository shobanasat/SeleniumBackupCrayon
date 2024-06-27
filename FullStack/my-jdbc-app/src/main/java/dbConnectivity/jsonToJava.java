package dbConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jsonToJava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = null;
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business","root","root");

//Create Object of statement class to help execute queries
Statement st = conn.createStatement();
ResultSet rs = st.executeQuery("select * from CustomerInfo where Location ='Asia' LIMIT 1;");

if (rs.next());
{
	customerDetails c = new customerDetails();
	c.setCourseName(rs.getString(1));
	c.setPurchasedDate(rs.getString(2));
	c.setAmount(rs.getString(3));
	c.setLocation(rs.getString(4));
	
	System.out.println(c.getCourseName());
	System.out.println(c.getPurchasedDate());
	System.out.println(c.getAmount());
	System.out.println(c.getLocation());
}

	//rs.close();
	//st.close();
	conn.close();

	}

}
