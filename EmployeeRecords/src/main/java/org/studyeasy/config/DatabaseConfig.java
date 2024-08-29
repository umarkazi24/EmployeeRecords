package org.studyeasy.config;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DatabaseConfig {
	public static Connection getConnection(){
		//Initialize all the information regardinf
		//Database Connection
		String dbURL = "jdbc:mysql://localhost:3306/studyeasy?useSSL=false";
		//Database name to access
		String dbUsername = "root";
		String dbPassword = "admin";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
		
	}
}
