package day02;

import java.util.Date;

public class Test01 {
	// 클래스
	// 클래스의 구성 요소 = 데이터( 변수 ) + 기능( 함수, method )
	
	// (전역)변수, 멤버필드
	//int num;
	// Data Type	변수명
	// String 		name;
	
	// 함수
	// static => new 없이 메모리에 올라감
	public static void main(String[] args) {
		// local 변수, 명령문
		// java.lang 만 생략가능
		// (java.lang).String
		// 'A' = 65		'a' = 97
		int num = 'A';
		System.out.println( num );
		
		java.lang.String name = new String( "홍길동" );
		System.out.println( name );
		System.out.println( name.charAt(0) + "**" );
		System.out.println( "*" + name.charAt(1) + "*" );
		
		Date now = new Date();
		System.out.println( now );
		System.out.println( now.getYear() );
		
		java.sql.Date now1 = new java.sql.Date(System.currentTimeMillis());
		System.out.println( now1.getYear() );
		
		name = null;
		now = null;
		now1 = null;
		
		System.gc();

		System.out.println();
		
	}

}
