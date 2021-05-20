package day03;

import java.util.Scanner;

public class Test03_Scanner_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "성적처리를 진행할까요?" );
		System.out.println( "진행을 원하면 yes를 입력하세요." );
		
		String msg = keyboard.nextLine();
		// msg 값이 yes가 아닌 경우 App 종료
		
		if ( !msg.equalsIgnoreCase( "yes" ) ) {
			if( keyboard != null ) keyboard.close();	
			keyboard = null;
			System.out.println( "종료합니다." );
			return;
		}
				
		System.out.print( "이름을 입력하세요 __" );
		System.out.println();
		
		String name = keyboard.nextLine();
		
		System.out.print( "나이를 입력하세요 __" );
		System.out.println();
		
		int age = Integer.parseInt( keyboard.nextLine() ); // nextLine = String 이므로 형변환 해주어야 함 -> int
		
		System.out.println( "	국어	영어	수학	점수를 입력하세요 __" );
		System.out.println( " 입력에 > 90 90 99 처럼 점수를 입력후 엔터 입력하세요" );
		System.out.println();
		
		int ko = keyboard.nextInt();
		int eng = keyboard.nextInt();
		int mat = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println( "***************************" );
		System.out.printf( "이름 : %s, 나이 : %d %n", name, age );
		
		int sum = 0;
		double avg = 0.0;
		System.out.printf( "국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %.2f %n", ko, eng, mat, sum = ko + eng + mat, avg = sum/3.0 );
		
		if( avg<0 || avg > 100 ) {
			if( keyboard != null ) keyboard.close();	
			keyboard = null;
			System.out.println( "점수 확인이 필요합니다." );
			return;
		}
		
		char grade = 'A';
		
		if ( avg >= 90 && avg <= 100) {
			grade = 'A';
		} else if ( avg >= 80 && avg < 90 ) {
			grade = 'B';
		} else if ( avg >= 70 && avg < 80 ) {
			grade = 'C';
		} else if ( avg >= 60 && avg < 70 ) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		// 삼항 연산자로 등급 처리
		char grade2 = avg >= 90 && avg <= 100 ? 'A' : ( avg >= 80 && avg < 90 ? 'B' : ( avg >= 70 && avg < 80 ? 'C' : ( avg >= 60 && avg < 70 ? 'D' : 'F') )) ;
		
		// switch 구문으로 성적 처리
		char grade3 = ' ';
		switch ( (int)avg/10 ) {
			case 10:
			case 9:
				grade3 = 'A';
				break;
			case 8:
				grade3 = 'B';
				break;
			case 7:
				grade3 = 'C';
				break;
			case 6:
				grade3 = 'D';
				break;
			default:
				grade3 = 'F';
		}
		
		System.out.printf( "학점 : %c, 학점 : %c, 학점 : %c %n", grade, grade2, grade3 );
		
		keyboard.close();	// 사용하던 자원 반납.
		keyboard = null;
		
	}

}
