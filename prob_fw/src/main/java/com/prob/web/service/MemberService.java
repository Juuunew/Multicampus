package com.prob.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.prob.web.dao.MemberDAO;
import com.prob.web.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	MemberDAO dao;
	
	public MemberVO loginById(MemberVO memberVO) throws DataAccessException {
		return dao.loginById(memberVO);
	}
}
