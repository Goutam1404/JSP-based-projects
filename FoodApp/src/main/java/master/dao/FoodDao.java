package master.dao;
import java.sql.*;

import master.dto.FoodDto;
import master.utilities.ConnectionFactory;
public class FoodDao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
//	private String select_sql="select * from customer_dtls";
	private String insert_sql="insert into FOOD values(?,?,?)";
//	private String delete_sql="delete from customer_dtls where cid=?";
//	private String update_sql="update customer_dtls set cname=?,cphno=? where cid=?";
	public void insertData(FoodDto fdto)
	{
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(insert_sql);
		    ps.setString(1,fdto.getFid());
		    ps.setString(2,fdto.getFname());
		    ps.setDouble(3,fdto.getFprice());
		    ps.executeUpdate();//insert data
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}


}
