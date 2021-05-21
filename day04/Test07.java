package day04;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.print();
	}

}

class Employee {
	// 클래스의 구성 요소 = 데이터( 변수 ) + 기능( 함수, method )
	
	// 데이터
	String name;
	String dept;
	int age;
	
	// 기능
	public void print() {
		System.out.printf( "사원명 : %s 근무부서 : %s %n", name, dept );
		
		return;
	}
}