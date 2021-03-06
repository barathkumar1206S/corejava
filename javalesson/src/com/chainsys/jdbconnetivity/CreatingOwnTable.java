package com.chainsys.jdbconnetivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreatingOwnTable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		CreatingOwnTable cot=new CreatingOwnTable();
		//cot.insert();
		//cot.view();
//cot.delete();
	cot.update();
		//cot.drop();
}
	public void insert() {
		 try {
             Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sbarathkumar1206");
            // Statement  mystat = con.createStatement();
          //   ResultSet myRs =mystat.executeQuery("create table Student2 (id number, name varchar(20),dept varchar(20),year number, mark number)");
          PreparedStatement stmt =con.prepareStatement("insert into Student2"+" values(?,?,?,?,?)"); 
          Scanner sc= new  Scanner(System.in);
         Scanner scan =new Scanner(System.in);
          System.out.println("please enter the Student2 rollno: ");
          int rollno= sc.nextInt();
          System.out.println("entern name:");
          String name= sc.next();
          System.out.println("enter dept");
          String dept=sc.next();
          System.out.println("enter year");
          int year=sc.nextInt();
          System.out.println("mark:");
          int mark=sc.nextInt();
          
          stmt.setInt(1, rollno);
          stmt.setString(2, name);
          stmt.setString(3,dept);
          stmt.setInt(4,year);
          stmt.setInt(5,mark);
          int rows=stmt.executeUpdate();
          System.out.println(rows+"updated....");
          
         
          }catch(Exception err) {
              err.printStackTrace();
              
         } 
	
		 
			}
	public void delete() throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sbarathkumar1206");
        PreparedStatement stmt =con.prepareStatement("delete Student2 where id=?"); 
        stmt.setInt(1,101 );
        int i=stmt.executeUpdate();
        System.out.println(i+"deleted");
        stmt.close();

		
		
	}
	public void view() throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sbarathkumar1206");
        Statement  mystat = con.createStatement();
       String query = "select *from Student2 where id=121";
        ResultSet myRs =mystat.executeQuery(query);
       while(myRs.next()) {
        System.out.println(myRs.getInt(1)+" "+myRs.getString(2)+" "+myRs.getString(3));

       }
		
	}
	public void update() throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sbarathkumar1206");
        PreparedStatement stmt =con.prepareStatement("UPDATE Student2  SET mark=? WHERE id= ?"); 
        stmt.setInt(1,95);
        stmt.setInt(2,121);
        int i=stmt.executeUpdate();
        System.out.println(i+"Updated");
        stmt.close();
        	
	}
	public void drop() throws SQLException {
       Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sbarathkumar1206");
       Statement  mystat = con.createStatement();
       String query = "drop table Student2";
       int myRs =mystat.executeUpdate(query);
       if(myRs==0) {
    	   System.out.println("table is dropped");
       }
       else {
    	   System.out.println("table is not Dropped");
       }
}
	
	}


