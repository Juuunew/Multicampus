package web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.service.MemberService;
import web.util.ShopException;
import web.vo.MemberVO;
import web.vo.ProductVO;
import web.util.Calculator;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	int count=1;
	MemberService service;
	
	@Override
	public void init() throws ServletException {
		 service=new MemberService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		myService(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		myService(request, response);
	}
	
	protected void myService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		
		String sign=request.getParameter("sign");
		if("memberInsert".equals(sign)) {//회원가입
			String name=request.getParameter("name");
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			MemberVO vo=new MemberVO(id,pw,name);
			System.out.println(vo);
			
			try {
				service.insertMember(vo);
				out.append(name+"님 가입되셨습니다.");
			} catch (ShopException e) {
				out.append(e.getMessage());
			}	
			
		}else if(sign.equals("login")) {//login			
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			MemberVO vo=new MemberVO(id,pw);
			System.out.println(vo);
			
			try {
				String name=service.selectMember(vo);
				if(name!=null) {//ok
					HttpSession session=request.getSession();
					session.setAttribute("id", id);
					System.out.println(session.getId());
					out.append(name);
				}else {//fail
					out.append("login 실패");
				}
				
			} catch (ShopException e) {
				out.append(e.getMessage());
			}	
			
		}else if(sign.equals("subject")){//체크박스 테스트
			String [] subject_value=request.getParameterValues(
					"subject_value[]");
			
			for(String value:subject_value) {
				System.out.println("선택한 과목:"+value);
			}
			
		}else if(sign.equals("calc")){//환율계산
			String won=request.getParameter("won");
			String operator=request.getParameter("operator");
			
			String result=Calculator.calculate(Float.parseFloat(won),operator);
			out.append(result);
			
		}else if(sign.equals("memberDelete")) {//회원 탈퇴
			HttpSession session=request.getSession();			
			String id=(String)session.getAttribute("id");
			System.out.println(session.getId()+":"+id);
			try {
				service.deleteMember(id);
				out.append("회원 탈퇴 되셨습니다.");
			} catch (ShopException e) {
				out.append(e.getMessage());
			}
		}else if(sign.equals("logout")) {//logout==>세션 무효화
			HttpSession session=request.getSession();
			session.invalidate();
			System.out.println("logout ok");
			out.append("logout ok");
		}else if(sign.equals("loginForm")) {//loginForm			
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			MemberVO vo=new MemberVO(id,pw);
			System.out.println(vo);
			
			try {
				String name=service.selectMember(vo);
				if(name!=null) {//ok
					HttpSession session=request.getSession();
					session.setAttribute("id", id);
					
					RequestDispatcher disp=request.getRequestDispatcher("login_ok.jsp");
					request.setAttribute("name", name);
					disp.forward(request, response);
				}else {//fail
					RequestDispatcher disp=request.getRequestDispatcher("login_fail.jsp");
					disp.forward(request, response);
				}
				
			} catch (ShopException e) {
				RequestDispatcher disp=request.getRequestDispatcher("login_fail.jsp");
				disp.forward(request, response);
			}	
			
		}else if("basketInsert".equals(sign)) {//장바구니 넣기
			String product_value=request.getParameter("product_value");
			ProductVO vo=new ProductVO(product_value);
			System.out.println(vo);
			
			HttpSession session=request.getSession(false);
			if(session==null) {//로그인 필요
				out.append("먼저 로그인하세요");
			}else {
				ArrayList<ProductVO> basket= (ArrayList<ProductVO>) session.getAttribute("basket");
				if(basket==null) {//최초 장바구니
					basket=new ArrayList();
					session.setAttribute("basket", basket);
				}
				basket.add(vo);
				
				System.out.println(basket);
				out.append(product_value+"가 장바구니에 담겼습니다");
			}
					
		}else if("basketView".equals(sign)) {
			HttpSession session=request.getSession(false);
			if(session==null) {//로그인 필요
				out.append("먼저 로그인하세요");				
			}else {
				ArrayList<ProductVO> basket=(ArrayList<ProductVO>) session.getAttribute("basket");
				out.append("<ol>");
				for(ProductVO vo:basket) {
					out.append("<li>"+vo.getName()+"</li>");
				}
				out.append("</ol>");
			}
		}else if("cookie_basketInsert".equals(sign)) {
			String product_value=request.getParameter("product_value");
			Cookie c=new Cookie("product"+count++,product_value);
			response.addCookie(c);
			out.append(product_value+"가 장바구니에 담겼습니다");
		}else if("cookie_basketView".equals(sign)) {
			Cookie []all=request.getCookies();
			out.append("<ul>");
			for(Cookie c : all) {
				out.append("<li>"+c.getName()+":"+c.getValue()+"</li>");
			}
			out.append("</ul>");
		}
		
	}//end service

}//end class





