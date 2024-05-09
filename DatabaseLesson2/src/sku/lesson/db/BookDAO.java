package sku.lesson.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDAO {
	
	public void select(String sql , int number) {
		// connection 이 있어야 데이터를 보낼 스트림을 제작 가능.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null; // rs 행을 처리함. 가장 먼저 테이블 헤드를 가리킨다. 그래서 한칸 내려옴 . 한칸내려올때 사용하는 next()
		// table 의 본문이 다 끝나고 end에 올떄 false.
		try {
			con = ConnectionManager.getConnection(); // 연결
			stmt = con.createStatement();// 쿼리가 지나가는 스트림 // 쿼리를 보내는 장소
			rs = stmt.executeQuery(sql); // 그 결과를 받아내는
			
			while(rs.next()) { // 결과처리
				//행처리 . 들어오게되면 한행이되고, 여러속성이 있음, 여러속성을 어트케 처리하는지.
				for(int i = 0; i < number; i++) {
					String[] attr = new String[number];
					attr[i] = rs.getString(i+1);
					System.out.print(i+"번 " + attr[i] + " ");
					
				}		
				//String attr4 = rs.getString(4);
				
				//System.out.println(attr1 + "," + attr2 + "," + attr3);
				// int attr4 = rs.getInt(4);
				 // 스트링 타입이라 연산이 안됨. Integer.parseInt 사용 가능 , 
				// 가지고 오자마자 사용하는 방식. int attr4 = rs.getInt(4);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ConnectionManager.closeConeection(rs,stmt,con);
	}
	
}


