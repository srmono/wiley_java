package com.wiley.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) {
		try {
			DBConnection dbcon = new DBConnection();
			Connection conn = dbcon.createDBConnection();
			
			//create statement object
			Statement stmt = conn.createStatement();
			
			//MySQL query
			String sql = "SELECT first_name, last_name, email FROM candidates ";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(
						rs.getString("first_name") + "\t" + rs.getString("last_name") + "\t" + rs.getString("email")
						);
			}
			
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}
}