package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository("dao")
public class MemberDAO {

	public void login(String id, String pw) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAO의 login() 호출됨");
	}

}
