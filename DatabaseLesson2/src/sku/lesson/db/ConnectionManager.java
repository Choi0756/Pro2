package sku.lesson.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class ConnectionManager {
	public static Connection getConnection() throws SQLException, ClassNotFoundException { // 이쪽에서 처리를 안함으로 위에서 처리해줘야함.
		String id = "root";
		String pwd = "1q2w3e4r";
		String driver = "com.mysql.cj.jdbc.Driver";
		String jdbcURL = "jdbc:mysql://localhost:3306/sku"; // URL  구성 : 프로토콜 + 머신주소 + 포트 + 서비스이름
		Class.forName(driver); // 작업목록도 알려줘야함.
		Connection con = DriverManager.getConnection(jdbcURL,id,pwd);
		
		return con;
	}
	
	public static void closeConeection(ResultSet rs, Statement pstmt, Connection con) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
