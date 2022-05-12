package com.chainsys.jdbconnetivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertImage {

	public static void main(String[] args) {
		InsertImage ii=new InsertImage();
		
		ii.insert();
	//	ii.retrive();
	}
	public  void insert() {
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","Sbarathkumar1206");  
			              
			PreparedStatement ps=con.prepareStatement("insert into InsertImage values(?,?)");  
			ps.setString(1,"chainsys");  
			  
			FileInputStream fin=new FileInputStream("D:\\photos\\chainsys.jpg");  
			ps.setBinaryStream(2,fin,fin.available());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");  
			          
			con.close();  
}
catch (Exception e) 
{
	e.printStackTrace();
				
				
}
}
	public void retrive() {
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","Sbarathkumar1206");  
			      
			PreparedStatement ps=con.prepareStatement("select * from InsertImage");  
			ResultSet rs=ps.executeQuery();  
			if(rs.next()){//now on 1st row  
			              
			Blob b=rs.getBlob(2);//2 means 2nd column data  
			byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
			              
			FileOutputStream fout=new FileOutputStream("d:\\barath.jpg");  
			fout.write(barr);  
			              
			fout.close();  
			}//end of if  
			System.out.println("ok");  
			              
			con.close();  
			}
		catch (Exception e)
{
e.printStackTrace(); 
}  
}  
}


