package web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserController extends MultiActionController {
	
	public ModelAndView memberInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
		ModelAndView mav = new ModelAndView("result");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// db로 감
		mav.addObject("loginedId", id);
		mav.addObject("loginedPw", pw);
		
		mav.setViewName("memberInfo");
		
		return mav;
	}

	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView("result");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// db로 감
		mav.addObject("loginedId", id);
		
		mav.setViewName("result");
		
		return mav;
	}

}
