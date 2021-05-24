package day05;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loc p1 = new Loc( 127.999, 77.7777 );
		p1.print();
		
	}

}

class MyTime {
	int y;
	int month;
	int day;
	int h;
	int m;
	int s;
}

class Loc {
	private double x;
	private double y;

	public Loc() { }
	public Loc( double x, double y ) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public void print() {
		System.out.printf( "[ x = %f, y = %f ]%n", x, y );
	}
	
}