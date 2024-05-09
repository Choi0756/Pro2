package sku.lesson.db.practice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseCenter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBaseCenter2 dc = new DataBaseCenter2();
		dc.testQuery();
	}
	
	public void testQuery() {
		BookDAO dao = new BookDAO();
		dao.select("select * from book");
	}
	
	public void test() {
		try {
			this.connectionDatabase();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void connectionDatabase() throws ClassNotFoundException, SQLException {
		String id = "root";
		String pwd = "";
		String driver = "";
		String jdbcURL = "";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbcURL,id,pwd);
		
		if(con != null) {
			System.out.println("connecting database");
			con.close();
		} else {
			System.out.println("connection fail");
		}
	}
}
