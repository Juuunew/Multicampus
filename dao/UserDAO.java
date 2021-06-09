//package dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
////import java.sql.Statement;
//
//import util.JDBCUtil;
//
//public class UserDAO {
//
//	public void selectUsers() {
//		
//		String sql = "select * from users";	// select insert update delete
//		
//		Connection con = null;
////		Statement st = null;	sql 인젝션 관련 해킹 위험도 높음, 보안상 위험
//		PreparedStatement ps = null;	// Statement 에 비해 성능, 보안, 사용성 up
//		ResultSet rs = null;
//		
//		int row = 0;
//		
//		try {
//			con = JDBCUtil.getConnection();	// 1. 드라이버 등록, 2. 연결
//			ps = con.prepareStatement(sql);	// 3. Statement 생성
//			
//			// 4. 실행할 준비가 되면 실행
//			rs = ps.executeQuery();		// select
//			//row = ps.executeUpdate();	// insert update delete
//			
//			// 5. 결과값 핸들링
//			while(rs.next()) {
//				String id = rs.getString("id");
//				String pw = rs.getString("pw");
//				String name = rs.getString("name");
//				String role = rs.getString("role");
//				
//				System.out.println( id + " : " + pw + " : " + name + " : " + role );    
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			JDBCUtil.close(con, ps, rs);
//		}
//	}
//
//}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import util.JDBCUtil;
import vo.UserVO;

public class UserDAO {

	public ArrayList<UserVO> selectUsers() {
		
		String sql ="select * from users"; // select insert update delete
		
		Connection con =null;
		//Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConnection();//1.드라이버 등록, 2.연결
			ps = con.prepareStatement(sql); //3.Statement생성
			
			
			//4. 실행할 준비가 되면 실행
			rs = ps.executeQuery();  //select
			//row = ps.executeUpdate();  //insert update delete
			
			ArrayList<UserVO> list=new ArrayList();
			
			//5. 결과값 핸들링 
			while(rs.next()) {
				String id=rs.getString("id");
				String pw=rs.getString("password");
				String name=rs.getString("name");
				String role=rs.getString("role");
				UserVO user=new UserVO(id,pw,name,role);
				list.add(user);
			}
			
			return list;

			
		}catch (Exception e) {
           e.printStackTrace();
           return null;
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
	}
}
