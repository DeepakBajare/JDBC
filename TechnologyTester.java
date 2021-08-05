package com.xworkz.Technology.TechnologyTester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TechnologyTester {
	public static void main(String[] args) {

		String userName = "root";
		String passWord = "Deepak@9998";
		String url = "jdbc:mysql://LocalHost:3306/charlie_9998";
		String fqn = "com.mysql.cj.jdbc.Driver";

		Connection connection = null;

		try {
			Class.forName(fqn);
			connection = DriverManager.getConnection(url, userName, passWord);
			String query = "insert into technology_table values(2,102,'Camera','canon',35000,'mateBlack')";
			Statement statement = connection.createStatement();
			statement.execute(query);

			System.out.println(connection);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
