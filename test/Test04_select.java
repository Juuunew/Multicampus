package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;

import javax.swing.JOptionPane;

import util.JDBCUtil;

public class Test04_select {

	public static void main(String[] args) {
		
		String sql = "select * from users where id=? and password=?";	// select insert update delete
		
		Connection con = null;
//		Statement st = null;	sql 인젝션 관련 해킹 위험도 높음, 보안상 위험
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		int row = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);	// 치환함수
			
			// 실행할 준비가 되면 실행
			ps.setString(1, JOptionPane.showInputDialog(" ID "));
			ps.setString(2, JOptionPane.showInputDialog( "password" ));
			
			
			// 실행할 준비가 되면 실행
			rs = ps.executeQuery();		// select
			
			while(rs.next()) {
				System.out.println("=========== 로그인 정보 ============");
				System.out.printf("%s", rs.getString("id"));
				System.out.printf("%s %n", rs.getString("name"));
			}
			System.out.println("====================================");
			// 결과값 핸들링
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
	}

}
