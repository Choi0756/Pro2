<%@ page contentType="text/html; charset=utf-8"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page errorPage="ErrorPage.jsp"%>
<html>

<head>

<title>Welcome to Eco Flow</title>

<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Dela+Gothic+One&family=Dosis:wght@200;300&family=Koulen&family=Smooch&display=swap" rel="stylesheet">
<script src="https://kit.fontawesome.com/f50322ccba.js" crossorigin="anonymous"></script>




<style>
   body { 
            padding: 0px;
            margin: 0px;            
        }
   video { 
            padding: 0px;
            margin: 0px;            
        }
<%@ include file="wave.jsp" %>

</style>

</head>


<body style="background-color: white;">

<!-- 메뉴바 호출 -->
<%@ include file="Menubar.jsp" %>
<!-- 메뉴바 호출 -->
<%@ include file="Map2.jsp" %>
<!-- 홈페이지 풋터-->
<%@ include file="footer.jsp" %>



</body>
</html>