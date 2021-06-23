<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.io.FileWriter" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
현재 시각 : 
<!-- 자바코드를 넣는 곳 -->
<%! 
	// 멤버변수 영역
	Date today = new Date();
	public void jspInit() {
		myMethod();
	}
	private void myMethod(){
		today = new Date();
	}
%>
<%=
	today.toString()
%>

<%@ include file = "includeTest.jsp" %>

<%
	FileWriter fw = new FileWriter("test.txt");
	fw.write(today.toString());
	fw.close();
%>
<%
	String age = request.getParameter("age");
%>
<%--age는 표현 --%>
age : <%= age %>
</body>
</html>