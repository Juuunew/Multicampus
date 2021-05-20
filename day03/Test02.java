package day03;

import javax.swing.JOptionPane;

public class Test02 {

	public static void main(String[] args) {
		System.out.println( "start" );
		
		//String msg = "Quit";
		String msg = JOptionPane.showInputDialog( "종료하려면 quit를 입력하세요." );
		
		if( msg.equalsIgnoreCase( "quit" ) ) {
			System.out.println( "종료합니다." );
			return;	// 함수종료
		} else {
			System.out.println( "end" );
			return;	// return 문을 포함한 함수 종료
		}
		
	}

}
