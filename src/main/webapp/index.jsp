<%@page import="dog_shopingmall_proj.ds.JndiDS"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
방가방가!
<%=JndiDS.getConnection() %>
Hi~~~~

</body>
</html>