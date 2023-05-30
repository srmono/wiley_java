package com.wiley.bookpub.dao;

import java.sql.PreparedStatement;

import com.wiley.bookpub.model.Admin;

public class AdminDaoImpl implements IAdminDAO{
	
	PreparedStatement pst;
	boolean result = false;
	
	public boolean adminLogin(Admin admin) {
		// TODO Auto-generated method stub
		
		try {
			// db query username, and pw
			// while if rs.next()  result = true
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
}
