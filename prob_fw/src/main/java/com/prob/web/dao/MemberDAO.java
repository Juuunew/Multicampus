package com.prob.web.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.prob.web.vo.MemberVO;

@Mapper
@Repository("dao")
public interface MemberDAO {
	
	public MemberVO loginById(MemberVO memberVO) throws DataAccessException;
	
}
