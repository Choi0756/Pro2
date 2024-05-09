package sku.lesson.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import sku.lesson.dto.StudentDTO;

public class StudentDAO {
	String id = "root";
	String pwd = "1q2w3e4r";
	String driver = "com.mysql.cj.jdbc.Driver";
	String jdbcURL = "jdbc:mysql://localhost:3306/sku";
	
	public StudentDAO() {
        try{
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 실제로 DB에 접근하여 데이터를 가져오는 역할을 하는 메서드
    public ArrayList<StudentDTO> select() {
        ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();

        Connection con = null;
       
        PreparedStatement pstmt = null;
        
        ResultSet rs = null;

     
        try{
            con = (Connection) DriverManager.getConnection(jdbcURL, id, pwd); 
            String sql = "SELECT * FROM gisa"; 
            pstmt = con.prepareStatement(sql); 
            rs = pstmt.executeQuery(); 

            while(rs.next()){
                int stdNo = rs.getInt("stdNo");
                String email = rs.getString("email");
                int kor = rs.getInt("kor");
                int eng = rs.getInt("eng");
                int math = rs.getInt("math");
                int sci = rs.getInt("sci");
                int hist = rs.getInt("hist");
                int total = rs.getInt("total");
                String mgrCode = rs.getString("mgrCode");
                String accCode = rs.getString("accCode");
                String locCode = rs.getString("locCode");
                
                StudentDTO studentDTO = new StudentDTO(stdNo, email, kor,eng, math, sci, hist,total, mgrCode,
            			accCode, locCode); 
                list.add(studentDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(con != null) con.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return list;
    }
}

