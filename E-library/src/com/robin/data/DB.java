package com.robin.data;

import java.sql.*;

public class DB {

		public static Connection getCon() throws Exception {
			
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Elibrary","root","root");
			
			return con;
		}
	

}
