package day02;

import java.util.Date;

public class Test02 {
		public static void main(String[] args) {
			
			// String은 참조형이지만 세미타입으로 기본형처럼 사용한다.
			java.lang.String name1 = new String( "홍길동" );	//heap 영역에 할당
			String name2 = new String( "홍길동" );
			
			String name3 = "홍길동";	// 상수와 풀 영역 ( 코드표 영역 )에 할당
			String name4 = "홍길동";
			
			System.out.println( name3 );
			System.out.println( name3.charAt(0) + "**" );
			System.out.println( "*" + name3.charAt(1) + "*" );
			
			// == 연산자 : 왼쪽값과 오른쪽값이 같은지 보는 것 같다면 true 다르면 false	/ 참조형 비교시 사용하면 안된다.
			
			System.out.println( name1 == name2 );	// 주소가 다름으로 false
			System.out.println( name3 == name4 );	// 주소가 같으므로 true
			
			name1 = name2;
			name3 = name4;
			
			String date = new Date().toLocaleString();	// 임시 객체 gc()대상
			System.out.println( date );
			
			
		}

	}


