package com.chainsys.miniproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.miniproject.pojo.Appointment;

public class AppointmentDao {
	private static Connection getConnection()
	{
		String drivername = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "Sbarathkumar1206";
		try 
		{
			Class.forName(drivername);
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	private static java.sql.Date convertTosqlDate(java.util.Date date) {
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		return sqldate;

	}
// To insert new row to the table employees
	public static int insertAppointment(Appointment newapp)
	{
		String insertquery = "insert into Appointment( app_ID,app_date,doc_id,patient_name,fees_collected,fees_nature) values (?,?,?,?,?,?)";
		Connection con = null;
		int rows =0;
//		//int rows ;
		PreparedStatement ps = null;
		try 
		{
			con = getConnection();
			ps = con.prepareStatement(insertquery);
			ps.setInt(1, newapp.getApp_Id());
			ps.setDate(2, convertTosqlDate(newapp.getApp_date()));
			ps.setInt(3, newapp.getDoc_id());
			//ps.setDate(3, convertTosqlDate(newapp.getDob()));
			// convert java.util.Date to java.sql.date
			ps.setString(4, newapp.getPatient_name());
			ps.setFloat(5,newapp.getFees_collected());
			ps.setString(6,newapp.getFees_nature());
			rows = ps.executeUpdate();
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			try {
				ps.close();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
			try 
			{
				con.close();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return rows;
	}
// for updating all the columns of the table
	public  static int updateAppointment(Appointment newapp) 
	{
		String updatequery = "update Appointment set app_date=?,doc_id=?,patient_name=?,fees_collected=?,fees_nature=? where app_ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try 
		{
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setInt(6, newapp.getApp_Id());
			ps.setDate(1, convertTosqlDate(newapp.getApp_date()));
			ps.setInt(2, newapp.getDoc_id());
			ps.setString(3, newapp.getPatient_name());
			ps.setFloat(4,newapp.getFees_collected());
			ps.setString(5, newapp.getFees_nature());
			ps.executeUpdate();
			rows = ps.executeUpdate();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}finally 
		{
			try
			{
				ps.close();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
			try
			{
				con.close();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}

		return rows;
	}
	
	public static int deleteAppointment(int id) 
	{
		String deletequery = "delete Appointment where app_ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
	
		try 
		{
			con = getConnection();
			ps = con.prepareStatement(deletequery);
			ps.setInt(1, id);
			rows = ps.executeUpdate();	
		}catch(SQLException e) 
		{
			e.printStackTrace();
		}finally
		{
			try 
			{
				ps.close();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			try 
			{
				con.close();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return rows;
	}
	//To retrive specific Employee data using employee_id
	public static Appointment getAppoitmentById(int id) 
	{
		Appointment app =null;
		String selectquery = "select app_ID,app_date,doc_id,patient_name,fees_collected,fees_nature from Appointment where app_ID = ? ";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs  = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setInt(1, id);
			rs =ps.executeQuery();
			app = new Appointment();
			   if(rs.next()) {
				   app.setApp_Id(rs.getInt(1));
				   java.util.Date date = new java.util.Date(rs.getDate(2).getTime());
				   app.setApp_date(date);
				   app.setDoc_id(rs.getInt(3));
				   app.setPatient_name(rs.getString(4));
				   app.setFees_collected(rs.getFloat(5)); 
		        }
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return app;
	
	}
	//To retrieve all employee data
	public static List<Appointment> getAllAppointment(){
		 List<Appointment> listOfAppointment = new ArrayList<Appointment>();
		 Appointment app = null;
			String selectquery = "select app_ID,app_date,doc_id,patient_name,fees_collected,fees_nature from Appointment ";
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs  = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(selectquery);
				rs =ps.executeQuery();
				while(rs.next()) 
				{
					   app = new Appointment();
					   app.setApp_Id(rs.getInt(1));
					   java.util.Date date = new java.util.Date(rs.getDate(2).getTime());
					   app.setApp_date(date);
					   app.setDoc_id(rs.getInt(3));
					   app.setPatient_name(rs.getString(4));
					   app.setFees_collected(rs.getFloat(5)); 
			           listOfAppointment.add(app);
			   }
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		 return  listOfAppointment;
	 }


}
