package my.jes.web.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.jes.web.vo.MemberVO;

@Repository
public class MemberDAO {

	@Autowired
	SqlSession sqlSession;
	
	public void memberInsert(MemberVO m) {
							// 수행해야할 sql, 객체
							// xml의 namespace.mapperVOID
		sqlSession.insert("mapper.member.memberInsert", m);
	}

	public String login(MemberVO m) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("mapper.member.login", m);
	}

	public void deleteMember(MemberVO m) {
		// TODO Auto-generated method stub
		sqlSession.delete("mapper.member.deleteMember", m.getId());
	}
}
