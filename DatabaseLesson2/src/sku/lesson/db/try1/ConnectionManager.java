package sku.lesson.db.try1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
   
   public static Connection getConnection() {
      
      String id = "root";
       String pwd = "1q2w3e4r";
       String jdbcURL = "jdbc:mysql://localhost:3306/sku";
       Connection con = null;
      try {
         con = DriverManager.getConnection(jdbcURL,id,pwd);
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
         
      return con;
   }
   
   public static void closeConnection(ResultSet rs, Statement stmt, Connection con) {
      if(rs != null) {
    	  try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
      
      if(stmt != null) {
    	  try {
			stmt.close();
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