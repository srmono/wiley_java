package com.wiley.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class DBConnection { 
	static Connection conn;
	
	public static Connection createDBConnection() {
		ResourceBundle bundle = ResourceBundle.getBundle("db");
		
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			// connection string
			String url = "jdbc:mysql://localhost:3306/mysqljdbc";
			String username = "root";
			String password = "password";
			
			conn = DriverManager.getConnection(bundle.getString("url"), bundle.getString("username"), bundle.getString("password"));
			//conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
