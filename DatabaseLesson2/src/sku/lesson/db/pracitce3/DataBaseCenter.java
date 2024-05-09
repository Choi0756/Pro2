package sku.lesson.db.pracitce3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DataBaseCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBaseCenter db = new DataBaseCenter();
		db.testQuery();
	}
	
	public void testQuery() {
		BookDAO dao = new BookDAO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력하세요: ");
		String sql = scanner.nextLine();
		dao.select(sql);
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
	
	public void connectDatabase() throws ClassNotFoundException, SQLException {
		String id = "root";;
		String pwd = "1q2w3e4r";
		String jdbcURL = "jdbc:mysql://localhost:3306/sku";
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbcURL,id,pwd);
	}
}
