package com.chainsys.jdbconnetivity;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
             System.out.println("enter the password:");
             Class.forName("oracle.jdbc.driver.OracleDriver");
             java.util.Scanner sc=new java.util.Scanner(System.in);
             String password =sc.next();
             sc.close();
             Connection myCon1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system",password);
             PreparedStatement ps = myCon1.prepareStatement("insert into Employee values(?,?,?,?,?)");
           System.out.println("Please enter Employee Eno,name,salary,manager,Dept ");
             File f = new File("D:\\Success\\Test.txt");
             FileReader fr = new FileReader(f);
             ps.setInt(1, 106);
        //    ps.setCharacterStream(6, fr,(int)f.length());
            ps.setString(2, "Barath");
             ps.setInt(3, 100000);
             ps.setInt(4, 10);
             ps.setString(5,"Administration");
       int i = ps.executeUpdate();
       System.out.println(i+" "+"record inserted");
            myCon1.close();
            fr.close();
         }catch(Exception err) {
             err.printStackTrace();
         }


	}

}
