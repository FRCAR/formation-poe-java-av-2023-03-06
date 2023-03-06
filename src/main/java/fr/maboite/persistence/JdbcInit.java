package fr.maboite.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcInit {

	public void launchQueries(Connection con) {
		String dropTableQuery = "drop table COMPANY";
		String createTableQuery = "create table COMPANY ("
				+ "       ID bigint not null,"
				+ "        NAME varchar(255),"
				+ "        primary key (ID) "
				+ "    )";
		String insertQuery = "insert into COMPANY(ID, NAME) VALUES (1, 'bigCorp')";
		String selectQuery = "select ID, NAME from COMPANY";
		try (Statement stmt = con.createStatement()) {
			try {
				stmt.executeUpdate(dropTableQuery);
			} catch (SQLException e) {
				System.out.println("Could not drop table");
			}
			try {
				stmt.executeUpdate(createTableQuery);
			} catch (SQLException e) {
				System.out.println("Could not create table");
			}
			stmt.executeUpdate(insertQuery);
			ResultSet rs = stmt.executeQuery(selectQuery);
			while (rs.next()) {
				long id = rs.getLong("ID");
				String name = rs.getString("NAME");
				System.out.println("id : " + id + " , name : " + name);
			}
		} catch (SQLException e) {
			throw new RuntimeException("SQL Error", e);
		}
	}

	public static void main(String[] args) {
		Properties connectionProps = new Properties();
		connectionProps.put("user", "javav");
		connectionProps.put("password", "javav");
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:derby://localhost:1527/javav;create=true",
					connectionProps);
			JdbcInit jdbcInit = new JdbcInit();
			jdbcInit.launchQueries(connection);
		} catch (SQLException e) {
			throw new RuntimeException("Could not connect to database ", e);
		}

	}

}