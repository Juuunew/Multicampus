package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class Test02 {

	public static void main(String[] args) {

		String sql = "SELECT emp.*, to_char(hiredate,'mm') 입사월 FROM emp";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		
		try {
			
			// 2. DB로 연결
			con = JDBCUtil.getConnection();
			
			// 3. SQL 구문을 관리해 주는 Statement 객체생성
			st = con.createStatement();
			
			// 4. sql 구문 실행
			rs = st.executeQuery(sql);
			
			System.out.println( "*********** 결과값보기 *********** ");
			while (rs.next()) {
				System.out.printf("%d |", rs.getInt("empno"));
				System.out.printf("%-15s |", rs.getString("ename"));
				System.out.printf("%-15s |", rs.getString("job"));
				System.out.printf("%-15s |", rs.getString("입사월"));
				System.out.printf("%d |", rs.getInt("mgr"));
				System.out.printf("%-15s |", rs.getDate("hiredate"));
				System.out.printf("%d |", rs.getInt("sal"));
				System.out.printf("%d |", rs.getInt("comm"));
				System.out.printf("%d |%n", rs.getInt("deptno"));
			}
			System.out.println( "***********       *********** ");
			
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, st, rs);
		}
		
		
	}

}
