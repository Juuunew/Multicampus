package com.myboot01.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myboot01.web.service.MemberService;
import com.myboot01.web.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@ResponseBody
	@RequestMapping("/memberInsert")
	public String memberInsert(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		MemberVO vo = new MemberVO(id, pw, name);
		
		System.out.println(vo);
		
		try {
			memberService.insertMember(vo);
			return "회원가입 ok";
		} catch(DataAccessException e) {
			return "회원가입 fail";
		}
	}
	
	@ResponseBody
	@RequestMapping("/loginById")
	// DAO -> service -> controller
	public String loginById(HttpServletRequest request, HttpServletResponse response) {
		// try-catch 는 한번에 하면 보안에 굉장히 위험
		try {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			MemberVO memberVO = new MemberVO(id, pw, null);
			memberVO = memberService.loginById(memberVO);
			
			JSONObject json = new JSONObject();
			json.put("id", id);
			
			return json.toJSONString();
		} catch(DataAccessException e) {
			e.printStackTrace();
			return "로그인 fail";
		}
		
	}
	
	@ResponseBody
	@RequestMapping("/deleteMember")
	public String deleteMember(HttpServletRequest request, HttpServletResponse response) {
		try {
			String id = request.getParameter("id");
			memberService.deleteMember(id);
			
			return "회원 탈퇴 ok";
		} catch(DataAccessException e) {
			e.printStackTrace();
			return "회원 탈퇴 fail";
		}
	}
	
	@ResponseBody
	@RequestMapping("/updateMember")
	public String updateMember(HttpServletRequest request, HttpServletResponse response) {
		try {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = request.getParameter("name");
			String address = request.getParameter("address");
			
			MemberVO membervo = new MemberVO(id, pw, name, address, 0);
			
			memberService.updateMember(membervo);
			return "회원 정보 수정 ok";
		} catch(DataAccessException e) {
			e.printStackTrace();
			return "회원 정보 수정 fail";
		}
	}
	
	// responsebody = 데이터 일부 // 데이터 전체 혹은 페이지 전체를 넘겨줄 경우엔 reponsebody X
	@RequestMapping("/selectAllMemberList")
	public String selectAllMemberList(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			List<MemberVO> list = memberService.selectAllMemberList();
			return "ok.jsp";
		} catch(DataAccessException e) {
			e.printStackTrace();
			return "fail.jsp";
		}
	}
}
