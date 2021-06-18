package web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import web.util.ShopException;
import web.vo.MemberVO;
// DAO의 import는 java.sql. 에서 벗어나면 안된다. => 독립성이 적어지기 때문
public class MemberDAO {
	
	public MemberDAO() {
		// 1. 드라이버 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 등록 실패");
		}
	}

	// C
	public void insertMember(MemberVO vo) throws ShopException {
		// 로컬변수 초기화
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			// 2. 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "JES", "1234");
			
			// 3. Statement 생성
			pstmt = conn.prepareStatement("Insert INTO Member (id, pw, name, address, age) VALUES (?,?,?,?,?)");
			
			// 4. SQL 전송
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getAddress());
			pstmt.setInt(5, vo.getAge());
			
			// select 구문제외 전부 update
			int i =pstmt.executeUpdate();
			
			// 5. 결과얻기
			System.out.println(i + "행이 insert 되었습니다.");
			
			
		} catch(Exception e) {
			e.printStackTrace();
			throw new ShopException("회원가입 실패");
		} finally {
			// 6. 종료
			try {
				pstmt.close();
				conn.close();
			} catch(Exception e) {
				
			}
		}
		
	}
	
	// R
	public String selectMember(MemberVO vo) throws ShopException {
		// 로컬변수 초기화
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				
				// 2. 연결
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "JES", "1234");
				
				// 3. Statement 생성
				pstmt = conn.prepareStatement("select name from Member where id=? and pw=?");
				
				// 4. SQL 전송
				pstmt.setString(1, vo.getId());
				pstmt.setString(2, vo.getPw());
				
				// select 구문제외 전부 update
				rs = pstmt.executeQuery();
				
				// 5. 결과얻기
				// true 이면 name이라는 결과값을 가지고 돌아가겠다!
				if(rs.next()) {
					return rs.getString("name");
				}
				
				return null;
			} catch(Exception e) {
				// 디버깅을 위한 에러추적
				e.printStackTrace();
				throw new ShopException("login 실패");
			} finally {
				// 6. 종료
				try {
					rs.close();
					pstmt.close();
					conn.close();
				} catch(Exception e) {
					
				}
			}
		
	}
	
	// U
	public void updateMember() {
		
	}
	// D
	public void deleteMember() {
		
	}
}
