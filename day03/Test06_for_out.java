package day03;

public class Test06_for_out {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for( int x = 2; x < 10; x++ ) {
//			System.out.println( x + "단을 출력합니다." );
//			for( int y = 1; y < 10; y++ ) {
//				System.out.println( x + " X " + y + " = " +  x * y  );
//			}
//			System.out.println();
//		}
		OUT : for( int i = 1; i <= 9; i++  ) {
			for( int j = 2; j <= 9; j++ ) {
//				if( j == 5 ) break;
//				if( j == 5 ) continue;
//				if( j == 5 ) break OUT;
				System.out.printf( " %d x %d = %2d ㅣ ", j, i, i*j );
			}
			System.out.println();
		}
		
	}

}
