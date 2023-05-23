package com.wiley.jdbcapp;

import java.sql.*;


public class EmployeeDaoImpl implements EmployeeDao {
	Connection conn;

	public void createEmployee(Employee emp) {
		conn = DBConnection.createDBConnection();
		String query = "INSERT INTO employee values(?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(4, emp.getAge());
			int count = ps.executeUpdate();
			if(count !=0) {
				System.out.println("Employee inserted successfully...!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getAllEmployees() {
		conn = DBConnection.createDBConnection();
		String query ="SELECT * from employee";
		
		System.out.println("--------------------------------------------");
		System.out.format("%s\t%s\t%s\\t%s\\t", "ID", "NAME", "SALARY", "AGE");
		System.out.println("--------------------------------------------");
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\\t",
						rs.getInt(1),
						rs.getString(2),
						rs.getDouble(3),
						rs.getInt(4)
						);
				System.out.println("--------------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getEmpById(int id) {
		conn = DBConnection.createDBConnection();
		String query ="SELECT * from employee where id="+id;
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\\t",
						rs.getInt(1),
						rs.getString(2),
						rs.getDouble(3),
						rs.getInt(4)
						);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateEmpNameById(int id, String name) {
		conn = DBConnection.createDBConnection();
		String query ="update employee set name=? where id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setInt(2, id);
			
			int count = ps.executeUpdate();
			if(count !=0)
				System.out.println("Employee details updated successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void deleteEmpById(int id) {
		conn = DBConnection.createDBConnection();
		String query ="delete employee where id=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			int count = ps.executeUpdate();
			if(count !=0)
				System.out.println("Employee deleted  successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
