package day01;

public class Practice01 {

	public static void main(String[] args) {
		int f1 = 20210517;
		String f2 = "JAVA";
		
		// 줄바꿈 지시자 (%n) 있을 경우
		System.out.printf( "%d %s%n", f1, f2 );
		System.out.printf( "%d %s%n", f1, f2 );
		
		// 줄바꿈 지시자 (%n) 없을 경우
		System.out.printf( "%d %s", f1, f2 );
		System.out.printf( "%d %s", f1, f2 );
		
	}

}