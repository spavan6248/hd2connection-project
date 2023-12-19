package com.database.main;
import java.sql.*;

public class MysqlDbConnection {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver"); //updated version previously it is com.mysql.jdbc.Driver
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","pavankalyan");
		
		Statement stmt =con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from emp");
		
		while (rs.next()) {
			
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		
		con.close();
		
		
		}
		catch (Exception e) {
			System.out.println(e);
			
		}
		
	}

}
