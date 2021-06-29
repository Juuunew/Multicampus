<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center" width="80%">
		<tr align="center" bgcolor="lightgreen">
			<td><b>아이디</b></td>
			<td><b>비밀번호</b></td>
			<td><b>이름</b></td>
		</tr>
		<c:forEach items="${membersList }" var="vo">
			<tr align="center">
				<td>${vo.id }</td>
				<td>${vo.pw }</td>
				<td>${vo.name }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>