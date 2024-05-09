package sku.lesson.db.practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseCenter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseCenter2 dc = new DatabaseCenter2();
		try {
			dc.connectionDatabase();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void connectionDatabase() throws ClassNotFoundException, SQLException {
		//아이디
		//비번
		//드라이버
		//로컬호스트
		//작업목록
		//connection
		String id = "";
		String pwd = "";
		String driver = "com.mysql.cj.jdbc.Driver";;
		String jdbcURL = "";
		Class.forName(driver);
		Connection con =  DriverManager.getConnection(jdbcURL,id,pwd);
		
		if(con != null) {
			System.out.println("connecting database");
			con.close();
		} else {
			System.out.println("connection fail");
		}
	}
}
