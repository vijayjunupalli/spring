package com.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");

		ConnectionUtility.insertUserDetails(userName, password, email);
		UserDetails userDetails = ConnectionUtility.retrieveDetails();

		request.setAttribute("user", userDetails.getUserName());
		request.setAttribute("pwd", userDetails.getPassword());
		request.setAttribute("email", userDetails.getEmail());
		request.getRequestDispatcher("/details.jsp").forward(request, response);

	}

}
