package sku.lesson.db.pracitce3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDAO {
	public void select(String sql) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			con = ConnectionManager.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String attr1 = rs.getString(0);
				String attr2 = rs.getString(1);
				String attr3 = rs.getString(2);
				String attr4 = rs.getString(3);
				String attr5 = rs.getString(4);
				String attr6 = rs.getString(5);
				String attr7 = rs.getString(6);
				String attr8 = rs.getString(7);
				String attr9 = rs.getString(8);
				String attr10 = rs.getString(9);
				String attr11 = rs.getString(10);
				
				System.out.println(attr1 + "," + attr2 + "," + attr3 + "," + attr4 + "," + attr5 + "," + attr6 + "," + attr7 + "," + attr8 + "," +
						attr9 + "," + attr10 + "," + attr11);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	ConnectionManager.closeConnection(rs,stmt,con);
	}

	private void getString(int i) {
		// TODO Auto-generated method stub
		
	}
}
