//package master.utilities;
//
//public class ConnectionFactory {
//
//}
package master.utilities;
import java.sql.*;
public class ConnectionFactory {
	private Connection cn=null;
	public Connection getConn()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");//REGISETR AND LOAD THE DRIVER
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_dbs","root","1404@gk");//establish the connection		   
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();//check line number where exception occur
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return cn;
	}
}

