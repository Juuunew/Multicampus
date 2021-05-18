package day02;

public class Test03 {
	// 클래스의 구성 요소 = 데이터( 변수 ) + 기능( 함수, method )
	
	public static void main(String[] args) {
		// local 변수, 명령문
		
		String name = "홍길동";
		int age = 29;
		double avg = 20;
		// 싱글 코테이션 = char
		char grade = 'B';
		boolean b = 90 <= avg;
		String date = "2021,05,17";
		
		if( b ) {
			System.out.printf("%s %.2f %c => 90 이상입니다. %n", name, avg, grade);
		} else {
			System.out.printf("%s %.2f %c => 90 미만입니다. %n", name, avg, grade);
		}
	}

}
