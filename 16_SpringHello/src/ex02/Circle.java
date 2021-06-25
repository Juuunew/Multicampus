package ex02;

public class Circle implements Shape {
	private int radius = 3;

//	public void areaCircle() {
//		System.out.println("원의 넓이 : " + (radius * radius * Math.PI));
//	}
	
	public void area() {
		System.out.println("원의 넓이 : " + (radius * radius * Math.PI));
	}
}
