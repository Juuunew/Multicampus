package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "*********** JDBC Test Oracle 연동 *********** ");
		
		
		String driver = "oracle.jdbc.OracleDriver";
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; 내 ip 주소
		String user = "scott";
		String pw = "TIGER";
		
		String sql = "SELECT * FROM dept";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		
		try {
			// 1. 드라이버 로딩
			Class.forName(driver);
			
			// 2. DB로 연결
			con = DriverManager.getConnection(url, user, pw);
			
			// 3. SQL 구문을 관리해 주는 Statement 객체생성
			st = con.createStatement();
			
			// 4. sql 구문 실행
			rs = st.executeQuery(sql);
			
			System.out.println( "*********** 결과값보기 *********** ");
			while (rs.next()) {
				System.out.printf("%15s |", rs.getString("dname"));
				System.out.printf("%15s |", rs.getString("loc"));
				System.out.printf("%d |%n", rs.getInt("deptno"));
			}
			System.out.println( "***********       *********** ");
			
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
