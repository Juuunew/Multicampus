<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- ${ "안녕" } --%>
	<%-- ${ 100 + "안녕" } --%>
	<%-- ${ "안녕" + "100" } --%>
위
<%
	request.setAttribute("name", "박혁준");
%>
<jsp:forward page="elTest02.jsp"></jsp:forward>
아래
</body>
</html>