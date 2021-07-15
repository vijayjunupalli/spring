package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conutil {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "vijay");
		Statement stmt = con.createStatement();
		int result = stmt.executeUpdate("insert into REGISTRATION ('1',''VIJAY) VALUES)");
		if (result > 0)
			System.out.println("successfully inserted");

		else
			System.out.println("unsucessful insertion ");
		con.close();

	}

}
