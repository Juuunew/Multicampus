package day03;

public class Prob3_박혁준 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[*] 고전 암호학(Classical Cryptography)에서 사용하는 기법 중 
//		“Caesar Cipher” 는 
//		암호화의 대상이 되는 각각의 문자들을 알파벳 상의 
//		세번째 오른쪽 문자로 치환하는 간단한 치환 암호기법
//		(즉, a는 d로, b는 e로, … , x는 a로, y는 b로, z는 c로)입니다.  
//		“everyday we have is one more than we deserve” 라는 문자열에 대해 
//		Caesar Cipher 를 적용하여 암호화된 문자열 값을 아래와 같이 출력하도록 
//		Prob3의 클래스의 main 함수를 완성하십시오. 
//		(단, 공백에 대해서는 치환을 적용하지 않습니다.)
//
//		*****  실행시 출력예시 *****
//		암호화할 문자열 : everyday we have is one more than we deserve
//		암호화된 문자열 : hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh


				String sourceString = 
				"everyday we have is one more than we deserve";
				String encodedString = "";
				
				// 프로그램을 구현부 시작.	
				// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
				StringBuilder sb = new StringBuilder();
				
				for( int i = 0; i < sourceString.length(); i++ ) {
					if( sourceString.charAt(i) != ' ' ) {
						int c = sourceString.charAt(i) + 3;
						if( c > 'z' ) {
							c = c - ( 'z' - 'a' + 1 ); // 122 - 97 + 1 = 26 <- 알파벳 개수
						}
						sb.append((char)c);
					} else {
						sb.append( sourceString.charAt(i) );
					}
					encodedString = sb.toString();
				}

				

				// 프로그램 구현부 끝.
				
				System.out.println("암호화할 문자열 : " + sourceString);
				System.out.println("암호화된 문자열 : " + encodedString);

	}

}
