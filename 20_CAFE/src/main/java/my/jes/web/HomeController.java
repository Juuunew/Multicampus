package my.jes.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import my.jes.web.service.MemberService;
import my.jes.web.vo.MemberVO;

@Controller
public class HomeController {
	
	@Autowired
	MemberService memberService;
	
	@ResponseBody
	@RequestMapping(value = "memberInsert.jes", method= {RequestMethod.POST}, produces = "application/text; charset=utf8")
	public String memberInsert(HttpServletRequest request, HttpServletResponse response)throws Exception{
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		MemberVO m = new MemberVO(id, pw, name);
		
		System.out.println(m);
		try {
			memberService.memberInsert(m);
			return name + "님 회원가입이 완료되었습니다.";
		} catch(Exception e) {
			return e.getMessage();
		}
		
	}
	
	@ResponseBody
	@RequestMapping(value = "login.jes", method= {RequestMethod.POST}, produces = "application/text; charset=utf8")			
	public String login(HttpServletRequest request,	HttpServletResponse response){
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");		
		
		JSONObject json = new JSONObject();
		try {
			MemberVO m = new MemberVO(id,pw);
			System.out.println(m);
			
			String name = memberService.login(m);
			// OK
			if(name != null) {
				HttpSession session = request.getSession();
				session.setAttribute("member", m);
				json.put("name", name);
			}else {
				json.put("msg", "로그인 실패");
			}
		}catch(Exception e) {
			json.put("msg", e.getMessage());
		}
		return json.toJSONString();
	}

	@ResponseBody
	@RequestMapping(value = "logout.jes", method= {RequestMethod.POST},	produces = "application/text; charset=utf8")			
	public String logout(HttpServletRequest request, HttpServletResponse response){
		
			HttpSession session=request.getSession(false);
			session.invalidate();
			return "";
		
	}
	
	@ResponseBody
	@RequestMapping(value = "memberDelete.jes", method= {RequestMethod.POST},	produces = "application/text; charset=utf8")			
	public String memberDelete(HttpServletRequest request, HttpServletResponse response){
		
		HttpSession session=request.getSession(false);
		// 로그인 attribute와 똑같이 가져와야 함
		MemberVO m = (MemberVO) session.getAttribute("member");
		
		memberService.deleteMember(m);
		session.invalidate();
		return "";
		
	}

	
}
