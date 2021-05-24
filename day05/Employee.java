package day05;

/**
 * 
 * @author hyukj
 * @since 2021_05_24
 *
 */
// public을 빼면 같은 패키지에 있는 클래스들만 접근 가능
public class Employee {

	// 인스턴스 자원
	// 인스턴스 자원은 항상 메모리에 띄워주어야 함 ( static은 인스턴스자원 X )
	// 멤버필드 - 변수 선언
	// private - 캡슐화
	private String name;
	private String dept;
	private int age;
	
	// 기본생성자, default
//	public Employee() {
//		System.out.println( "Employee() call ...." );
//	}
	
	public Employee() {}
	
	// 생성자함수에 관여하는 순간 기본생성자는 더 이상 자동적으로 생성되지않는다.
	public Employee(String name, String dept, int age) {
//		this.setName( name );
//		this.setDept( dept );
//		this.setAge( age );
		this.name = name;
		this.dept = dept;
		this.setAge( age );	// 유효성 검사때문에 set 써줘야함!
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * 
	 * @param age 양수만 가능
	 */
	public void setAge( int age ) {
		if( age > 0 )
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	/**
	 * 사원 정보 출력
	 */
	public void print() {
		// 변수 + 명령문
		
		// this 키워드는 Heap영역에서만 사용 가능 ( Member만 접근가능 )
		String data = String.format("사원[ %s, %s, %d ]", this.name, this.dept, this.age);
		System.out.println( data );
		
		return;
	}
	
}
