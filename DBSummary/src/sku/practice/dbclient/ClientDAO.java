package sku.practice.dbclient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClientDAO {
	public ArrayList select(String sql) throws SQLException {
		ArrayList list = null;
		Connection con = ConnectionManager.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			//작업실시(데이터클래스 없이 rs 의 내용을 클라이언트 어떻게 전달할 것인가?
			int stdNo = rs.getInt(1);
		}
		ConnectionManager.closeConnection(rs,pstmt,con);
		return list;
	}
}
