package sku.lesson.db.practice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String id = "root";
		String pwd = "";
		String driver = "";
		String jdbcURL = "";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbcURL,id,pwd);
		
		return con;
		
	}
	
	public static void closeConnection(ResultSet rs, Statement psmt, Connection con) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
