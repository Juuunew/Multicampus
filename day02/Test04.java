package day02;

public class Test04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = Math.PI;
		System.out.println( pi );
		
		
		int num = (int)( Math.random() * 100 );
		System.out.println( num );
		
		// byte : Byte	, int : Integer
		System.out.printf( "byte : %d ~ %d %n", Byte.MIN_VALUE, Byte.MAX_VALUE );
		System.out.printf( "int : %d ~ %d %n", Integer.MIN_VALUE, Integer.MAX_VALUE );
		
		// 형변환
		double sum = Integer.parseInt("99") + Integer.parseInt("77") + Double.parseDouble("88.5");
		double avg = sum/3;
		System.out.printf( "총점 : %.2f 평균 : %.2f%n", sum, avg );
		
		System.out.println( "----------------------" );
		
		int x = 99, y = 77;
		System.out.printf( "(x=%d, y=%d) %n", x, y );
		
		// swapping
		int temp = x;
		x = y; 
		y = temp;
		
		System.out.printf( "(x=%d, y=%d) %n", x, y );
		
		
		System.out.println( "----------------------" );
	}

}
