package day04;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] jumsu = null; // Array 선언
//		jumsu = new int[5];	// Array 생성
		
		int[] jumsu = new int[5];	// Array 선언&생성
		
		System.out.println(jumsu.length);
		System.out.println(jumsu);
		System.out.println(Arrays.toString(jumsu));
		
		// Array 초기화
//		jumsu[0] = 99;
//		jumsu[1] = 89;
//		jumsu[2] = 100;
//		jumsu[3] = 0;
//		jumsu[4] = 77;
		for( int i=0; i < jumsu.length; i++ ) {
			jumsu[i] = (int)(Math.random() * 100);
		}
		
		int sum = 0;
		for( int i=0; i < jumsu.length; i++ ) {
			sum += jumsu[i];
			System.out.printf( "%d     ",jumsu[i] );
		}
		System.out.println();
		System.out.printf( "총합 : %d, 평균 : %d %n", sum, sum/jumsu.length );
		System.out.println(Arrays.toString(jumsu));	// 출력용
		System.out.println( "===============================================================" );
		
		for( int data : jumsu ) {
			System.out.println( data );
		}
		
		double[] num = new double[100];
		for( int i=0; i<num.length; i++ ) {
			num[i] = Math.random();
		}
		
		for( double data : num  ) {
			System.out.printf( "%.4f   ", data );
		}
	}

}
