package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtility {

	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "vijay");
		return con;
		
	}
	
	public static void insertUserDetails(String userName, String password, String email) {
		try {
			Connection con = getConnection();
			Statement statment = con.createStatement();
			String sql = "insert into userDetails(name, password, email) values('" + userName + "','" + password + "','"
					+ email + "')";
			int result = statment.executeUpdate(sql);
			System.out.println("execute result for the default build ccagain....");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static UserDetails retrieveDetails() {
		UserDetails details=null;
		try {
			Connection con = getConnection();
			Statement statment = con.createStatement();
			String sql = "select * from userDetails";
				
			ResultSet rs = statment.executeQuery(sql); 
			while(rs.next()){
			details=new UserDetails();
			details.setUserName(rs.getString("name"));
			details.setPassword(rs.getString("password"));
			details.setEmail(rs.getString("email"));
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return details;
		
		
	}

}
