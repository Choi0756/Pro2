package gisa.basic.lesson.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GisaDAO {
	public ArrayList<Student> select(String sql){
		ArrayList<Student> list = null;
		Connection con = ConnectionManager.getConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);
			list = new ArrayList<Student>();
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
				
				Student student = new Student(stdNo, email, kor, eng, math, sci, hist, total, mrgCode,
						accCode, locCode);
				
				list.add(student);
				
			}
			ConnectionManager.closeConnection(rs,pstmt,con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public String solveQusetion1(String queryAnswer1) {
		// TODO Auto-generated method stub
		String answer = null;
		
		return answer;
	}

	public String solveQusetion2(String queryAnswer2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String solveQusetion3(String queryAnswer3) {
		// TODO Auto-generated method stub
		return null;
	}

	public String solveQusetion4(String queryAnswer4) {
		// TODO Auto-generated method stub
		String answer = null;
		
		GisaDAO gisa = new GisaDAO();
	      
	    StringBuilder sb = new StringBuilder("select count(*)");
	    sb.append("from(select* from gisa where accCode = 'A' or accCode = 'B') A");
	    sb.append(false);
	    sb.append(false);
	    sb.append(false);
	    sb.append(false);
	    sb.append(false);
	    sb.append(false);
	    sb.append(false);
	    sb.append(false);
	    sb.append(false);
	    queryAnswer4 =sb.toString();
	     
		return answer;
	}
	
	/*
	 	select count(*)
		from
		(select*
		from gisa
		where accCode = 'A' or accCode = 'B') A
		
		where kor+(case 
			when locCode = 'A' then 5
			when locCode = 'B' then 10
			when locCode = 'C' then 15 end) >=50;
	 
	 */
}
