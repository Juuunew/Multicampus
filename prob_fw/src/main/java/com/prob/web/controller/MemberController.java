package com.prob.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prob.web.service.MemberService;
import com.prob.web.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@ResponseBody
	@RequestMapping("/loginById")
	public String loginById(HttpServletRequest request, HttpServletResponse response) {
		JSONObject json = new JSONObject();
		
		try {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			MemberVO memberVO = new MemberVO(id, pw, null);
			memberVO = memberService.loginById(memberVO);
			
			System.out.println(memberVO);
			
			if(memberVO == null) {
				json.put("login", "login fail");
				return json.toJSONString();
			}
			json.put("id", id);
			return json.toJSONString();
			
			
		} catch(DataAccessException e) {
			e.printStackTrace();
			return json.toJSONString();
		}
	}
}
