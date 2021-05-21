package day04;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] names = null;
//		names = new String[] { "홍길동", "고아무개", "이이", "고길동" };
//		
//		System.out.println( Arrays.toString( names ) );
//		
//		String res = null;
//		for( int i=0; i<names.length; i++ ) {
//			if( names[i].equals("고길동") ) {
//				res = names[i];
//				break;
//			}
//		}
//		
//		if( res == null ) {
//			System.out.println( "검색결과가 없습니다." );
//		} else {
//			System.out.println(res);
//		}
	
		
//		String[] names = null;
//		names = new String[] { "홍길동", "고아무개", "이이", "고길동" };
//		
//		System.out.println( Arrays.toString( names ) );
//		
//		String[] res = new String[10];
//		int count = 0;
//		for( int i=0; i<names.length; i++ ) {
//			if( names[i].equals("고길동") ) {
//				res[count++] = names[i];
//				break;
//			}
//		}
//		
//		System.out.println( "--------- 검색결과 ---------" );
//		if( count == 0 ) {
//			System.out.println( "검색결과가 없습니다." );
//		} else {
//			System.out.println( Arrays.toString(res) );
//		}

		String[] names = new String[] { "홍길동", "김가", "고아무개", null, "", "이이", "고길동", "김길동" };
		
		System.out.println( Arrays.toString( names ) );
		
		String[] res = new String[10];
		int count = 0;
		
		for( int i=0; i<names.length; i++ ) {
//			if( names[i].equals("고길동") ) {
//			if( names[i].startsWith("김") ) {
//			if( names[i].contains("길동") ) {
			if( names[i] != null && names[i].contains("길동") ) {
				
				res[count++] = names[i];
			}
		}
		
		System.out.println( "--------- 검색결과 ---------" );
		if( count == 0 ) {
			System.out.println( "검색결과가 없습니다." );
		} else {
			System.out.println( Arrays.toString(res) );
		}
		// 이진 검색
		//////////////////////////////////////////////////////////
		for( int i=0; i < names.length; i++ ) {
			if( names[i] != null && names[i].length() > 0)
			System.out.printf( "%c**  ", names[i].charAt(0) );
		}

		boolean[] flag = new boolean[5];
		System.out.println();
		
		char[] ch2 = "abcdefghijklmnopqrswxyzABCDEFGHIJKLMNOPQRSWXYZ0123456789".toCharArray();
		for( char data : ch2 ) {
			System.out.printf( "%c => %d %n", data, (int)data );
		}
		System.out.println();
		
		char[] ch = { 'a', 'b', 'c' };
		String abc = new String(ch);
		String msg = "hello java";
		
		System.out.println(msg);
	}

}
