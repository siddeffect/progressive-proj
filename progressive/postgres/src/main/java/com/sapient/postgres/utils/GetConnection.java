package com.sapient.postgres.utils;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class GetConnection {
	

	public static  Connection connection = null; 
	public PreparedStatement ps, ps1, ps2; 
	public ResultSet rs, rs1, rs2; 
	
	public static Connection getPostGressConn() {
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://172.17.0.2:5432/project", "postgres", "admin");
			return connection; 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; 
	}
 
}
