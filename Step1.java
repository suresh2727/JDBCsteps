package com.ps.app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;
//import com.mysql.cj.xdevapi.DatabaseObject;

public class Step1 {
	public static void main(String[] args)  {
		try {
			Connection con = null;
			String url = "jdbc:mysql://localhost:3306/StudentApp";
			String user = "root";
			String password = "tiger";
			Statement stmt=null;
			String query = "INSERT INTO STUDENT_TABLE VALUES(1,'SURESH', 7878807288 , 'COOLSURU2727@GMAIL.COM' , 'CSE' , 'BANGALORE' , 'SURESH')";
			
			//Step 1: Loading and registering the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded and register Successfull");
			
			//step 2: Establishing connection 
			con=DriverManager.getConnection(url, user, password);
			System.out.println("Connection Est");
			
			
			
			//Step 3: Creating a Platform
			
			stmt = con.createStatement();
			System.out.println("Platform Created for Executing SQL queries");
			
			
			//step 4 : Executing the sql queries;
		
			boolean s =stmt.execute("select * from student_table");
			System.out.println(s);
			System.out.println("Data Added Successfull added");
			
			
			} catch (ClassNotFoundException | SQLException e) { 
			e.printStackTrace(); 
		}
	}
}
