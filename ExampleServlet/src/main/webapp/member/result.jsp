<%@ page import = "sku.lesson2.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Result</title>
</head>
<body>
	<h1>Output</h1>
<%
	MemberDTO dto = (MemberDTO)session.getAttribute("dto");
%>
<%=dto %>
</body>
</html>