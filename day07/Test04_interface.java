package day07;

public class Test04_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B t1 = new T1();
		C t2 = new T2();
		
		B a = new T1();
		a.stop();
		if( a instanceof A ) ((A)a).go();
		
		t2.go();
		t2.stop();
		
	}

}

interface A {
	void go();
}

interface B {
	void stop();
}

interface C extends A, B {
	
}

class T1 extends Object implements A, B {

	@Override
	public void stop() {
		System.out.println( "stop t1" );
	}

	@Override
	public void go() {
		System.out.println( "go t1" );
	}
	
}

class T2 extends Object implements C {
	
	@Override
	public void stop() {
		System.out.println( "stop t2" );
	}
	
	@Override
	public void go() {
		System.out.println( "go t2" );
	}
	
}
	// abstract = extends	/	interface = implements

//abstract class Shape {
//	
//	abstract double getArea( int r );
//}

//class Circle extends Shape {
//	
//	@Override
//	double getArea(int r) {
//		// TODO Auto-generated method stub
//		return Math.PI * r * r;
//	}
//	// 원의 면적 구하는 메소드
//	
//}

interface Shape {
	
	abstract double getArea( int r );
}

class Circle implements Shape {
	
	@Override
	public double getArea(int r) {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}
	// 원의 면적 구하는 메소드
	
}