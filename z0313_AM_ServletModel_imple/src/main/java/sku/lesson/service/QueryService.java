package sku.lesson.service;

import java.sql.SQLException;

import sku.lesson.dao.QueryDAO;

public class QueryService {
	//테이블 명이 들어오면 해당 테이블의 레코드 중 5개를 가져와서 전달하는 역할
	public String[][] getData(String table){
		QueryDAO dao = new QueryDAO();
		String[][] values = null;
		try {
			values = dao.select(table);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return values;
	}
}
