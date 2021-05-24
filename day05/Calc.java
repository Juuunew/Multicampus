package day05;

public class Calc {
	// 클래스의 구성 요소 = 데이터(변수) + 기능(함수, method)
	
	static final double PI = 3.14;
	
	
	// + - / * % 
	// 두정수를 더하는 add 함수 정의
	// 인스턴스 자원은 항상 메모리에 띄워주어야 함 ( static은 인스턴스자원 X )
	// static은 this 자원 사용 X
	// static 자원, class 자원
							// int[] 처리 됨, 마지막 위치에만 가능
	public static int add( int ...n ) {
		int sum = 0;
		for( int data : n ) {
			sum += data;
		}
		return sum;
	}
	
//	public static int add( int x, int y ) {
//		return x + y;
//	}
//	
//	// Method overload - 매개변수가 다르면 중복선언 가능
//	public static int add( int x, int y, int z ) {
//		return x + y + z;
//	}
//	
	public static double add( double x, double y ) {
		return x + y;
	}
	
	// 두정수를 빼는 sub 함수 정의
	public static int sub( int x, int y ) {
		return x - y;
	}
	
	
}
