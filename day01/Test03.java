package day01;

public class Test03 {
	// 클래스의 구성요소(member) = 데이터( 변수 ) + 기능( 함수, method )
	public static void main(String[] args) {
		// local 변수, 명령문 이 올 수 있음
		System.out.println( "hello" );
		System.out.println( "홍길동" );
		System.out.println( 'A' );
		System.out.println( 27 );
		System.out.println( 1.1 );
		System.out.println( false );
		System.out.println( 170 > 177 );
		System.out.println( 80 + 71 + 99 );
		System.out.println( (80 + 71 + 99)/3 );
		System.out.println( 127.2323 + " , " + 448.555 );
		System.out.println( "---------------------------------------" );
		System.out.println( 7+7 );
		System.out.println( 1/2 );	// 1 -> 10. 프로모션
		System.out.println( 1/(int)2. );	// 2. -> 1 캐스팅 명시적인 형변환
		System.out.println( "" + 1 + 1 );	// "" + "1" + "1"
		System.out.println( 1 + 1 + "" );	// 2 + "" => "2"
		System.out.println( "---------------------------------------" );
		System.out.println( 3 + 4 + "홍길동" + "\t" + 'A' + " : " + (3 > 4) + 30.77 );
		System.out.printf("%d \t %s %c : %b %5.2f \n", 3 + 4, "홍길동", 'A', 3 > 4, 30.77 );
//		System.out.printf("", 3 + 4, "홍길동", 'A', 3 > 4, 30.77 );
	}

}	// 클래스 블락

class A{
	// 클래스의 구성요소 = 데이터( 변수 ) + 기능( 함수, method ) = member
	
}

class B{
	// 클래스의 구성요소 = 데이터( 변수 ) + 기능( 함수, method ) = member
	
}

// public class 는 파일 하나당 하나만 가능
// public 은 파일명과 동일한 class명에만 붙일 수 있음