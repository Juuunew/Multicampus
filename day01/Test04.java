package day01;

public class Test04 {
	// 클래스의 구성요소(member) = 데이터( 변수 ) + 기능( 함수, method )
	public static void main(String[] args) {
		// local 변수, 명령문
		long num = 999999991;
		int x = (int)7.9;
		x = 90;
		System.out.println( x );
		
		double f = 6.6;
		System.out.println(f);
		
		String name = "홍길동";
		System.out.println( name );
		System.out.println( name.charAt(0) + "**" );
		
		String msg = null;
		msg = "        hel lo  ";
		System.out.println( msg );
		System.out.println( msg.toUpperCase() );
		System.out.println( msg.trim().toUpperCase() );
		System.out.println( msg );
		msg = msg.trim();
		System.out.println( msg );
		msg = null;
	}
}
