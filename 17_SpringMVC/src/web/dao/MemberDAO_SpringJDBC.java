package web.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import web.vo.MemberVO;

public class MemberDAO_SpringJDBC {
	
	JdbcTemplate jdbcTemplate;
	

	public void setDataSource(DataSource dataSource) {
		
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// selectAllMembers() 와 동일
	public List<MemberVO> listMembers() {

		String sql = "select * from member";;
		// query 메서드 args = conn 대여 + PreparedStatement + executeQuery 한방에 !
		// mapRow(ResultSet rs, int row)
		
		
		List<MemberVO> list = new ArrayList();
		list = jdbcTemplate.query(sql, new RowMapper() {
			
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw"));
				vo.setName(rs.getString("name"));
				
				return vo;
			}
			
		});

		
		return list;
	}
		
}
