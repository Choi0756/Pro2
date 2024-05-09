package sku.lesson.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseCenter dc = new DatabaseCenter();
		dc.testQuery();
	}
	
	public void testQuery() {
		BookDAO dao = new BookDAO();
		String sql = null;
		int number = 0;
		dao.select(sql,number);
	}
	
	public void test() {
		try {
			this.connectDatabase();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void connectDatabase() throws SQLException, ClassNotFoundException { // 이쪽에서 처리를 안함으로 위에서 처리해줘야함.
		String id = "root";
		String pwd = "1q2w3e4r";
		String driver = "com.mysql.cj.jdbc.Driver";
		String jdbcURL = "jdbc:mysql://localhost:3306/sku"; // URL  구성 : 프로토콜 + 머신주소 + 포트 + 서비스이름
		Class.forName(driver); // 작업목록도 알려줘야함.
		Connection con = DriverManager.getConnection(jdbcURL,id,pwd);
		if(con != null) {
			System.out.println("connecting database");
			con.close();
		} else {
			System.out.println("connection fail");
		}
		
	}
}
