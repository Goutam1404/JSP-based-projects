package master.dao;

import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import master.utilities.ConnectionFactory;

public class Bookingdao {
	private Connection cn=null;
	private Statement st=null;
//	private PreparedStatement ps=null;
	private ResultSet rs=null;
	
	private String select_sql="select * from bookings";
	
	public ResultSet getData()
	{
		try {
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			st=cn.createStatement();
			rs=st.executeQuery(select_sql);
//			rs=st.executeQuery(search_sql);
//		    ps.setString(1,fdto.getFid());
		
//		    ps.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return rs;
	}
}
