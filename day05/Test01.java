package day05;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if( args.length != 2 ) {
			System.out.println( "로그인 정보(id, password)를 입력해주세요." );
		}
		
		String id = args[0];
		String pw = args[1];
		
		// 로그인 처리
		String msg = String.format( "id(%s), pw(%s)", id, pw);
		
		System.out.println( msg );
		
	}

}
