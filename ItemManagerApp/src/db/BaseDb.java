package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDb {
	
	protected Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/prsdb";
		String username = "prs_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;
	}
	
}