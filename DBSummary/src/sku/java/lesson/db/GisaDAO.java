package sku.java.lesson.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GisaDAO {
	
	public boolean insert(ArrayList<Student> list ) throws SQLException {
		boolean flag = false;
		Connection con = ConnectionManager.getConnection();
		String sql = "insert into gisa values (?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		for(Student student : list) {
			pstmt.setInt(1, student.getStdNo());
			pstmt.setString(2, student.getEmail());
			pstmt.setInt(3, student.getKor());
			pstmt.setInt(4, student.getEng());
			pstmt.setInt(5, student.getMath());
			pstmt.setInt(6, student.getSci());
			pstmt.setInt(7, student.getHist());
			pstmt.setInt(8, student.getTotal());
			pstmt.setString(9, student.getMgrCode());
			pstmt.setString(10, student.getAccCode());
			pstmt.setString(11, student.getLocCode());
			int affectedCount = 0;
			affectedCount += pstmt.executeUpdate();
			
			if(affectedCount > 0) {
				flag = true;
			}
		}
		ConnectionManager.closeConnection(null, pstmt, con);
		return flag;
	}
	
	public ArrayList<Student> select(String sql) {
		ArrayList<Student> list = null;
		Connection con = ConnectionManager.getConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs != null) {
				int stdNo = rs.getInt(1);
				String email = rs.getString(2);
				int kor = rs.getInt(3);
				int eng = rs.getInt(4);
				int math = rs.getInt(5);
				int sci = rs.getInt(6);
				int hist = rs.getInt(7);
				int total = rs.getInt(8);
				String mgrCode = rs.getString(9);
				String accCode = rs.getString(10);
				String locCode = rs.getString(11);
				
				Student student = new Student(stdNo, email, kor, eng, math, sci, hist, total, mgrCode,
						accCode, locCode);
				
				list.add(student);
			}
		ConnectionManager.closeConnection(rs, pstmt, con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
}
