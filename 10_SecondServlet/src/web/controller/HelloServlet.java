package web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.append("<a href='index.html'><img src='img/logo.jpg' width='100'></a><hr>");
		out.append("<img src='img/cat.jpg'>");
		out.append("<h2>이쁜 고양이</h2>");
		out.append("<a href='hi'>귀여운 고양이</a>");
	}

}
