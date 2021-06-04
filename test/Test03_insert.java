package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;

import util.JDBCUtil;

public class Test03_insert {

	public static void main(String[] args) {
		
		String sql = "INSERT INTO users (id,password,name) VALUES (?,?,?)";	// select insert update delete
		
		Connection con = null;
//		Statement st = null;	sql 인젝션 관련 해킹 위험도 높음, 보안상 위험
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		int row = 0;
		
		try {
			con = JDBCUtil.getConnection();
//			System.out.println(con);
			ps = con.prepareStatement(sql);	// 치환함수
			System.out.println(ps);
			// 실행할 준비가 되면 ? 에 값 세팅
			ps.setString(1, "test01");
			ps.setString(2, "4321");
			ps.setString(3, "고릴라");
			
			// 실행할 준비가 되면 실행
//			rs = ps.executeQuery();		// select
			row = ps.executeUpdate();	// insert update delete			-- auto commit
			
			// 결과값 핸들링
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
	}

}
