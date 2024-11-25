package master.dao;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

import master.dto.Tourdto;
import master.utilities.ConnectionFactory;

//import master.utilities.ConnectionFactory;
import java.sql.*;
public class Tourdao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from tours";
	private String search_sql="select * from tours where tour_id=?";
	private String insert_sql="insert into tours values(?,?,?,?,?,?,?,?)";
	private String delete_sql="delete from tours where tour_id=?";
	private String update_sql="update tours set tour_name=?,price=? where tour_id=?";
	
	public void insertData(Tourdto tdto)
	{
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(insert_sql);
		    ps.setString(1,tdto.getTid());
		    ps.setString(2,tdto.getTname());
		    ps.setDouble(3,tdto.getTprice());
		    ps.executeUpdate();//insert data
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void deleteData(Tourdto tdto)
	{
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(delete_sql);
		    ps.setString(1,tdto.getTid());
		
		    ps.executeUpdate();//insert data
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
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
	
	public void updateData(Tourdto tdto)
	{
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(update_sql);
		    ps.setString(1,tdto.getTid());
		    ps.setString(2,tdto.getTname());
		    ps.setDouble(6,tdto.getTprice());
		    ps.executeUpdate();//insert data
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
//	public void searchData(Tourdto tdto)
//	{
//		try
//		{
//			ConnectionFactory con=new ConnectionFactory();
//			cn=con.getConn();
//			ps=cn.prepareStatement(search_sql);
//			ps.setString(2,tdto.getTname());
//			ps.executeUpdate();		    
//		}
//		
//		catch(SQLException se)
//		{
//			se.printStackTrace();
//		}
//	}
	public ResultSet searchData(Tourdto tdto)
	{
		try {
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
//			st=cn.createStatement();
			ps=cn.prepareStatement(search_sql);
			ps.setString(2,tdto.getTname());
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
