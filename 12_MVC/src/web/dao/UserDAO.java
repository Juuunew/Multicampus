package web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import web.util.JDBCUtil;
import web.vo.UserVO;

public class UserDAO {

	public UserVO login(String id, String pw) {
		
		String sql ="select * from Member where id=? and pw=?";
		
		Connection con =null;
		//Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConection();//1.드라이버 등록, 2.연결
			ps = con.prepareStatement(sql); //3.Statement생성
			
			ps.setString(1, id);
			ps.setString(2, pw);
			
			
			//4. 실행할 준비가 되면 실행
			rs = ps.executeQuery();  //select
			//row = ps.executeUpdate();  //insert update delete
			
			//5. 결과값 핸들링 
			if(rs.next()) {
				String name=rs.getString("name");
				String role=rs.getString("address");
				UserVO user=new UserVO(id,pw,name,role);
				return user;
			}
			
			return null;
			
		} catch (Exception e) {
           e.printStackTrace();
           return null;
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
	}
}










