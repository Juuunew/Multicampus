package day03;

public class Test05_for_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		for( i = 1; i <= 5; i++ ) {
			System.out.println( "Hello Java " + i );
		}
		
		System.out.println( i );
		
		for( int a = 0;  ; a++) {
			System.out.println( "..." + a );
			if( a == 100 ) break;
		}
		
		i = 0;
		while( i < 5 ) {
			System.out.println( "Hello Java" );
			i++;
		}
		
		boolean flag = false;
		
		while( !flag ) {
			int num = (int)( Math.random() * 100 );
			System.out.println( num );
			if( num == 99 ) flag = !flag;
		}
		
		i = 9;
		do {
			System.out.println( "**********" );
			i++;
		} while( i < 5 );
		
		System.out.println( "==========================================================================" );
		
		// 1 ~ 100 까지의 합
		int sum = 0;
		for( i = 1; i <= 100; i++ ) {
			sum += i;
			System.out.printf( "%d + ", i );
		}
		System.out.println( sum );
		
		System.out.println( "==========================================================================" );


	}

}
