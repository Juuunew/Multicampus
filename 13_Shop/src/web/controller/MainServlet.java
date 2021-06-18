package web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.service.MemberService;
import web.util.ShopException;
import web.vo.MemberVO;


@WebServlet("/main")
public class MainServlet extends HttpServlet {
	
	MemberService service;
	
	@Override
	public void init() throws ServletException {
		service = new MemberService();
	}

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
		// 한글처리 설정
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		// 컨트롤링
		String sign = request.getParameter("sign");
		if(sign.equals("memberInsert")) {	// 회원가입
			// 파라미터값 받기
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			// 파라미터값 vo에 삽입
			MemberVO vo = new MemberVO(id, pw, name);
			System.out.println(vo);
			
			// db insert
			
			try {
				service.insertMember(vo);
				out.append(name + "님 가입되셨습니다.");
			} catch (ShopException e) {
				// TODO Auto-generated catch block
				out.append(e.getMessage());
			}
		} else if(sign.equals("login")) {	// login
			// 파라미터값 받기
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			// 파라미터값 vo에 삽입
			MemberVO vo = new MemberVO(id, pw);
			System.out.println(vo);
			
			// db insert
			
			try {
				String name = service.selectMember(vo);
				if(name != null) {	// ok
					out.append(name);
				} else {			// fail
					out.append("login 실패");
				}
			} catch (ShopException e) {
				// TODO Auto-generated catch block
				out.append(e.getMessage());
			}
		} else {
			
		}
		
		
		
	}
}
