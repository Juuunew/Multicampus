package day02;

public class Test05 {

	public static void main(String[] args) {
		
		int x = 100, y = 7;
		
		System.out.println( x / y );
		System.out.println( x % y );
		
		int num = 100;
		
		System.out.println( num );
		System.out.println( ++num );
		System.out.println( num );
		System.out.println( num++ );
		
		System.out.println( num );
		System.out.println( num-- );
		System.out.println( num );
		
		//x = x / y; => x /= y;
		
		boolean flag = false;
		System.out.println( flag = (10 == 10) );
		System.out.println( true );
		System.out.println( x > y );
		
		System.out.println("-----------------------------------");
		
		// 논리 연산자
		x = 1;
		flag = ( x > 5 ) && ( x < 10);
		flag = ( x > 5 ) & ( x < 10);
		System.out.println( flag );
		
		System.out.println("-----------------------------------");
		
		x = 100;
		flag = ( x > 5 ) || ( x < 10);
		flag = ( x > 5 ) | ( x < 10);
		System.out.println( flag );
		
		System.out.println("-----------------------------------");
		
		// 비트 연산자
		System.out.println( 4 & 1);	// 0
						// 0100
						// 0001
		System.out.println( 4 | 1);	// 5
		System.out.println( 4 << 2 );	// 0100 -> 010000
		System.out.println( 4 >> 1 );	// 0100 -> 0010
		
		System.out.println("******************************************************************");
		
		String msg = null;
		msg = "helldddddd";
		int idx = 5;
		
		if ( msg != null && idx >=0 && idx < msg.length() ) {
			System.out.println( msg.length() );
			System.out.println( msg.toUpperCase().charAt(idx) );
		} else {
			System.out.println( "msg에 데이터가 필요합니다." );
		}
		System.out.println("******************************************************************");
		
		int jumsu = 90;
		if ( jumsu >= 0 && jumsu <= 100 ) {
			String res = jumsu > 70 ? "Pass" : "재시";
			System.out.printf( "%d : %s%n", jumsu, res );
		} else {
			System.out.println( "점수를 확인해주세요." );
		}
	}

}
