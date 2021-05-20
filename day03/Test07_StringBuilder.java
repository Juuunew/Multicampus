package day03;

public class Test07_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println( "start" );
//		
//		String msg = "hello";
//		System.out.println( msg.length() );
//		char c = msg.charAt(0);
//		System.out.println( c );
//		
//		System.out.println( "end" );
//		return;
		
		// 성능 최악
		String msg = "hello " + " , " + "java" + 'A' + 1 + true; // String에서는 이렇게 쓰면 안된다! 객체가 많이 생성됨 ( String끼리 + 연산 하면 안됨!)
		System.out.println( msg );
		
//		StringBuffer sb = new StringBuffer(); // 이것도 예전 버전
		
		// 성능 갑
		StringBuilder sb = new StringBuilder();
		sb.append( "hello " );
		sb.append( " , " );
		sb.append( "java" );
		sb.append( 'A' );
		sb.append( 1 );
		sb.append( true );
		
		String result = sb.toString();
		System.out.println( result );
		
		return;
		
	}

}
