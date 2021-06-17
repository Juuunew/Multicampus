package web.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
       
    public HelloServlet() {
        super();
        // 생성자
        System.out.println("생성자 호출됨");
    }

	public void init(ServletConfig config) throws ServletException {
		// 나고
		System.out.println("inti 호출됨");
	}

	public void destroy() {
		// 죽고
		System.out.println("destroy 호출됨");
	}

//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//일하고
//		System.out.println("service 호출됨");
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get 요청시 일함
		// 주소창에서 Enter 입력 시
		myService(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post 요청시 일함
		// 버튼클릭으로 이동시
		myService(request, response);
	}

	// get과 post의 작동방식이 같을 때 사용 => 코드중복 방지
	private void myService(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(request.getMethod() + " 호출됨 : " + id + " : " + pw);
	}

}
