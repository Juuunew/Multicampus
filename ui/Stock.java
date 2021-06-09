package ui;

import java.awt.*;
import java.util.ArrayList;

import dao.UserDAO;
import vo.UserVO;

public class Stock {
	public void onCreate() {
		Frame f = new Frame( "주식매매" );
		Button b1 = new Button( "전송1" );
		
		f.add(b1);
		
		
		f.addWindowListener(null);
		MyWindowHandler w = new MyWindowHandler();
		f.addWindowListener(w);
		
		f.setBounds(200, 300, 400, 500);
		//Color c = new Color( 222, 222, 210 );
		f.setBackground(Color.cyan);
		f.setVisible(true);
	}
	
	public void selectUsers() {
		UserDAO dao = new UserDAO();
		ArrayList<UserVO> list = dao.selectUsers();
		
		//	꺼낸 데이터타입 : 
		for(UserVO v:list) {
			System.out.println(v);
		}
	}
}
