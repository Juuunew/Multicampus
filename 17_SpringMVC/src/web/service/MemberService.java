package web.service;

import java.util.List;

import web.dao.MemberDAO;

public class MemberService {
	
	private MemberDAO dao;

	public void setMemberDAO(MemberDAO dao) {
		
		this.dao = dao;
	}

	public List listMembers() {
		// TODO Auto-generated method stub
		return dao.listMembers();
	}

}
