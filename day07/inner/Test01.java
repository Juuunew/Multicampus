package day07.inner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println( "Inner class Test!!" );
//		
//		A a = new A();
//		a.print();
//		
//		A.B b = a.new B();
//		b.print();
//
//		A.B b2 = new A( "김길동" ).new B();
//		b2.print();
//		
//		System.out.println( "======================" );
//		B b3 = new B();
//		b3.setA( new A("OOO") );
//		b3.print();
//		System.out.println( "======================" );
//		
		A.C c2 = new A.C();
		c2.print1();
		c2.print2();
	}

}

// **************************************************************************************
// inner class 에는 static 사용 가능
class A {
	String name = "홍길동";

	public A() {  }

	public A(String name) {
		this.name = name;
	}
	
	void print() {
		System.out.println( "1 A : " + name );
	}
	
	class B {
		void print() {
			System.out.println( "2 B : " + name );
		}
	}
	
	static class C {
		String cc = "CCCC";
		
		C() {
			System.out.println( "C 생성" );
		}
		
		void print1() {
			//System.out.println( "9 C : " + name );
		}
		
		void print2() {
			System.out.println( "10 C : " + cc );
		}
	}
	
}

// **************************************************************************************

class B {
	A a;
	
	public void setA(A a) {
		this.a = a;
	}
	
	void print() {
		System.out.println( "3 B : " + a.name );
	}
}
