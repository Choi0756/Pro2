package gisa.lesson.file2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GisaDAO { // 요청이 들어오면 arraylist 로 만들어서 전달해줘야함.
	
	public ArrayList<Student> select(String sql){
		ArrayList<Student> list = null;
		
		Connection con = ConnectionManager.getConnection();;

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			list = new ArrayList<Student>();
			Student student = null;
			while(rs.next()) {
				int stdNo = rs.getInt(1);
				String email = rs.getString(2);
				int kor = rs.getInt(3);
				int eng = rs.getInt(4);
				int math = rs.getInt(5);
				int sci = rs.getInt(6);
				int hist = rs.getInt(7);
				int total = rs.getInt(8);
				String mrgCode = rs.getString(9);
				String accCode = rs.getString(10);
				String locCode = rs.getString(11);
				student = new Student(stdNo, email, kor,  eng, math,  sci, hist, total, mrgCode,
						accCode, locCode);
				
				list.add(student);
			}
		ConnectionManager.closeConnection(rs,pstmt,con); // 자바에서는 자원을 연결하고 일이 다 끝나면 close를 해야함.
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;	
	}
	
}
