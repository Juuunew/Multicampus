package day03;

public class Test01 {

	public static void main(String[] args) {
		int x = 7, y = 7;
		boolean flag = x == y;
		System.out.println( flag );
		System.out.println( x != y );
		System.out.println( y != x );
		System.out.println( "==================================" );
		
		String s1 = new String( "yes" );
		String s2 = new String( "yes" );
		
		String s3 = "yes";
		String s4 = "yes";
		
		String s5 = "YES";
		
		// 참조형은 값을 비교할때 == 쓰면 안됨.
//		System.out.println( s1 == s2 );
//		System.out.println( s3 == s4 );
		
		System.out.println( s1.equals( s2 ) );
		System.out.println( s2.equals( s1 ) );
		System.out.println( s3.equals( s4 ) );
		System.out.println( s3.equals( s1 ) );
		
		flag = s1.equals( s5 );
		System.out.println( s1.equals( s5 ) );
		System.out.println( s1.equalsIgnoreCase( s5 ) );	// yes YES
		
		System.out.println( s1.toUpperCase().equals(s5.toUpperCase()) );
						 // yes		YES				YES		YES
		System.out.println( s1.toLowerCase().equals(s5.toLowerCase()) );
						 // yes		yes				YES		yes
	}

}
