<%@page import="java.util.Arrays"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.mysql.cj.jdbc.result.ResultSetMetaData"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Database</title>
<style>
	table{
		border : 1px solid black;
		border-collapse : collapse;
	}
	
	tr, td {
		border : 1px solid black;
		border-collapse : collapse;
		text-align: center;
	}
</style>
</head>
<body>
<% 
	// Database 연결하여 Connection이 만들어지는지 확인하는 코드작성
	String id = "root";
	String pwd = "1q2w3e4r";
	String driver = "com.mysql.cj.jdbc.Driver";
	String jdbcURL = "jdbc:mysql://localhost:3306/sku";
	Class.forName(driver);
	Connection con = DriverManager.getConnection(jdbcURL,id,pwd);
	
	String sql = "select * from gisa limit 10";
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(sql);
	
	ResultSetMetaData rsmd = (ResultSetMetaData)rs.getMetaData();
	int columnCount = rsmd.getColumnCount();
	
	System.out.println(columnCount);
	
	String[] columnNames = new String[columnCount];
	
%>
</body>
</html>







