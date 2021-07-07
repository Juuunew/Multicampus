package web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.service.MemberService;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	
	MemberService memberService = new MemberService();
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		myService(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		myService(request, response);
	}
	
	protected void myService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		
		memberService.login(id,pw);
		
		// main 페이지로 넘기기
		RequestDispatcher disp = request.getRequestDispatcher("main.jsp");
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
		disp.forward(request, response);
	}

}
