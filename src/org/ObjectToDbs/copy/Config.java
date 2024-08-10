package org.ObjectToDbs.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Config {
	
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	public Config()
	{
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		 conn= DriverManager.getConnection("mysal:jdbc://localhost:3306/demo2","root","root");
		
		 if(conn!=null)
		 {
			 System.out.println("Connection created ");
		 }else 
		 {
			 System.out.println("connection failed");
		 }
	}catch(Exception e)
	{
		System.out.println("At connection "+e);
	}
		
	
	}
	
	public static void main(String[] args) {
		
		Config c=new Config();
	}

}
