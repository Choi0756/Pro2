package sku.lesson2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import sku.lesson2.dto.MemberDTO;
import sku.lesson2.utils.ConnectionManager;

public class MemberDAO {
	public boolean insert(MemberDTO member) {
		boolean flag = false;
		Connection con = ConnectionManager.getConnection();
		String sql = "insert into member values (?,?,?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getUserId());
			pstmt.setString(2, member.getUserPwd());
			pstmt.setString(3, member.getUserName());
			pstmt.setTimestamp(4, member.getRegistDate());
			int affectedCount = pstmt.executeUpdate();
			if(affectedCount>0) {
				flag = true;
			}
			ConnectionManager.closeConnection(null, pstmt, con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}
}
