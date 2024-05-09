<%@ page import = "java.sql.Connection" %>
<%@ page import = "java.sql.DriverManager" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Database</title>
</head>
<body>
<%
	String id = "root";
	String pwd = "1q2w3e4r";
	String driver = "com.mysql.cj.jdbc.Driver";
	String jdbcURL = "jdbc:mysql://localhost:3306/sku";
	Class.forName(driver);
	Connection con = DriverManager.getConnection(jdbcURL,id,pwd);
	
	if(con != null){
		con.close();
		out.print("connect");
	} else {
		out.print("fail");
	}
%>
</body>
</html>