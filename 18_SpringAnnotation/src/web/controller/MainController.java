package web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import web.service.MemberService;
import web.vo.MemberVO;

@Controller
@RequestMapping("/test")
public class MainController {
	
	// Autowired의 기능
	// MemberService memberService = new MemberService();
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/main1.do", method= {RequestMethod.POST})
	public String main1(Model model, HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("MainController의 main1() 호출됨");
		model.addAttribute("id", request.getParameter("id"));
		model.addAttribute("pw", request.getParameter("pw"));
		
		// 지양할 것 : request 건수만큼 생성되어서 성능 저하
		// MemberService memberService = new MemberService();
		
		memberService.login(request.getParameter("id"), request.getParameter("pw"));
		
		return "main";
	}
	
	@RequestMapping("/main2.do")
	public ModelAndView main2(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "main2");
		mav.setViewName("main");
		
		return mav;
	}

}
