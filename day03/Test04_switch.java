package day03;

public class Test04_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 엘레베이터 4층
		//String input = "";
		
//		switch( input.trim() ) {
//		case "1" :
//			System.out.println( "1층입니다." );
//			break;
//		case "2" :
//			System.out.println( "2층입니다." );
//			break;
//		case "3" :
//			System.out.println( "3층입니다." );
//			break;
//		case "4" :
//			System.out.println( "4층입니다." );
//			break;
//		default :
//			System.out.println( "층을 눌러주세요." );
//		}
		
//		char input = '3';
//		
//		switch( input ) {
//		case '1' :
//			System.out.println( "1층입니다." );
//			break;
//		case '2' :
//			System.out.println( "2층입니다." );
//			break;
//		case '3' :
//			System.out.println( "3층입니다." );
//			break;
//		case '4' :
//			System.out.println( "4층입니다." );
//			break;
//		default :
//			System.out.println( "층을 눌러주세요." );
//		}
//		
		
		String input = " ";
		
		switch( input != null && input.trim().length() > 0 ? input.trim().charAt(0) : ' ' ) {
		case '1' :
			System.out.println( "1층입니다." );
			break;
		case '2' :
			System.out.println( "2층입니다." );
			break;
		case '3' :
			System.out.println( "3층입니다." );
			break;
		case '4' :
			System.out.println( "4층입니다." );
			break;
		default :
			System.out.println( "층을 눌러주세요." );
		}
	}

}
