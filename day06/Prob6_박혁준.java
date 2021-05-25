package day06;

public class Prob6_박혁준 {
	public static void main(String args[]) {
		Person[] p = {
				new Student( "홍길동", 20, 200201 ),
				new Teacher( "이순신", 30, "JAVA" ),
				new Employee( "유관순", 40, "교무과" )
		};
		
		for( Person data : p ) {
			data.print();
		}
	}
}

class Person {
	private String name;
	private int age;
	
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.printf( "이름 : %s 나이 : %d ", name, age );
	}
}

class Student extends Person {
	private int id;

	public Student() {
		super();
	}

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public Student(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.printf( "학    번 : %d %n", id );
	}
}

class Teacher extends Person {
	private String subject;

	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	
	public Teacher(String subject) {
		super();
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.printf( "담당과목 : %s %n", subject );
	}
	
}

class Employee extends Person {
	private String dept;
	
	public Employee() {
		super();
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public Employee(String dept) {
		super();
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.printf( "부    서 : %s %n", dept );
	}
	
}
