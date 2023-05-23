package com.wiley.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		PreparedStatement ps = null;
		PreparedStatement psSkills = null;
		ResultSet rs = null;
		
		try {
			DBConnection dbcon = new DBConnection();
			conn = dbcon.createDBConnection();
			
			/*JDBC Transactions*/
			
			//Disable the autocommit
			conn.setAutoCommit(false);
			
			//Here is your transaction
			
			//If everything is ok, commit the transaction
			conn.commit();
			
			//insert the candidate
			String sqlInsert = "INSERT INTO candidates(first_name, last_name, dob, phone, email) VALUES(?,?,?,?,?)";
			
			ps = conn.prepareStatement(sqlInsert);
			
			
			
//			//create statement object
//			Statement stmt = conn.createStatement();
//			
//			//MySQL query
//			String sql = "SELECT first_name, last_name, email FROM candidates ";
//			
//			ResultSet rs = stmt.executeQuery(sql);
//			
//			while(rs.next()) {
//				System.out.println(
//						rs.getString("first_name") + "\t" + rs.getString("last_name") + "\t" + rs.getString("email")
//						);
//			}
//			
//			try {
//				rs.close();
//				stmt.close();
//			} catch (SQLException e) {
//				System.out.println(e.getMessage());
//			}
			
		} catch (SQLException e) {
			//in case of exception, rollback the transaction
			conn.rollback();
			e.printStackTrace();
		}
	}
}