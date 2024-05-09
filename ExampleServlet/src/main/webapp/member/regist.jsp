<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "sku.lesson2.utils.DateService"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Regist</title>
</head>
<body>
<form action = "../ExampleServlet?command=regist" method ="post">
<table>
	<tr>
		<td>id</td><td><input type = "text" name = "userId" , id = "userId"></td><td></td>
	</tr>
	<tr>
		<td>name</td><td><input type = "text" name = "userName" , id = "userName"></td><td></td>
	</tr>
	<tr>
		<td>pwd</td><td><input type = "text" name = "userPwd" , id = "userPwd"></td><td></td>
	</tr>
	<tr>
		<td>date</td>
		<td>
			<input type = "text" name = "registDate" , id = "registDate"
							 value = "<%= DateService.getDateTime(0) %>" 
							 readonly = "readonly">
		</td>
		 <td></td>
	</tr>
	<tr>	
		<td><input type = "submit" value = "regist"></td>
	</tr>
</table>
</form>
</body>
</html>