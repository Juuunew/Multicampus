package day04;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 5, 7, 9, 3, 11, 66, 77 };
		System.out.println( Arrays.toString(num) );
		
		// num 배열에서 11 위치 찾기
		int data = 11;
		for( int i=0; i<num.length; i++ ) {
			if( num[i] == data ) {
				System.out.printf( "%d : num[%d] %n", data, i );
				break;
			}
		}
		
		String[] msg = new String[3];
		msg[0] = "hello";
		msg[1] = "java";
		msg[2] = "SQL";
		System.out.println( Arrays.toString( msg ) );
		
		// msg에서
		for ( int i=0; i<msg.length; i++ ) {
			
			//System.out.println( msg[i].charAt( msg[i].length() -1 ) );
			
			for( int idx=0; idx < msg[i].length(); idx++ ) {
				System.out.printf( "%c ", msg[i].charAt(idx) );
			}
			System.out.println();
		}
		
		String[] msg1 = new String[3];
		msg1[0] = "hello";
		msg1[1] = null;
		msg1[2] = "SQL";
		System.out.println( Arrays.toString( msg1 ) );
		
		// msg에서
		for ( int i=0; i<msg1.length; i++ ) {
			
			//System.out.println( msg[i].charAt( msg[i].length() -1 ) );
			
			for( int idx=0; msg1[i] != null && idx < msg1[i].length(); idx++ ) {
				System.out.printf( "%c ", msg1[i].charAt(idx) );
			}
			System.out.println();
		}
	}

}
