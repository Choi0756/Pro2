<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "sku.lesson2.dto.MemberDTO" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>List</title>
</head>
<body>
<h1>List</h1>
<a href="../ExampleServlet?command=registView">����ϱ�</a>
<table>
<tr><td>ID</td><td>PWD</td><td>NAME</td><td>DATE</td></tr>
<%
	ArrayList<MemberDTO> list = (ArrayList<MemberDTO>)session.getAttribute("list");
	if(list==null || list.size()==0){
		out.print("<h1>�ش� �����Ͱ� �����ϴ�.</h1>");
	} else {
		for(MemberDTO member : list){
%>
		<tr>
			<td><a href="../ExampleServlet?command=search&userId=<%=member.getUserId() %>"><%=member.getUserId() %></a></td>
			<td><%=member.getUserPwd()%></td>
			<td><%=member.getUserName()%></td>
			<td><%=member.getRegistDate() %></td>
			<td><a href="../ExampleServlet?command=updateView&userId=<%=member.getUserId()%>">����</a></td>
			<td><a href="../ExampleServlet?command=delete&userId=<%=member.getUserId()%>">����</a></td>
		</tr>
<%
		}
	}
%>
</table>
</body>
</html>