package day04;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = { 1, 1, 1 };
		int[] num2 = { 2, 2, 2, 2, 2 };
		int[] num3 = { 3 };
		
		int[][] two = { num1, num2, num3 };
		
		System.out.println();
		
		for( int row=0; row < two.length; row++ ) {
			for( int col=0; col < two[row].length; col++ ) {
				System.out.printf( "%d   ", two[row][col] );
			}
			System.out.println();
			System.out.println();
		}
		
		int N=7;
		int[][] t1 = new int[N][N];
		t1[2][3] = 99;
		
		int[][] t2 = {
				{},
				{ 99, 66, 89, 88, 44, 100},	// 1반
				{ 78, 69, 92, 58, 55, 77, 66, 79 },	// 2반
				{ 98, 67, 55, 66 }	// 3반
		};
		
		// 반별 평균 점수 구하기
		double sum = 0;
		
		for( int i=1; i < t2.length; i++ ) {
			sum = 0;
			int count = t2[i].length;
			for( int c=0; c < count; c++ ) {
				sum += t2[i][c];
			}
			System.out.printf( "%d반 총점 : %.2f 학생수 : %d, 평균 : .2f %n ", i, sum, count );
		}
		
	}

}
