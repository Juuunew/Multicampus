package ex02;

public class Triangle implements Shape {
	private int width = 4, height = 5;
	
//	public void areaTriangle() {
//		System.out.println("삼각형의 넓이 : " + (width * height / 2));
//	}
	
	public void area() {
		System.out.println("삼각형의 넓이 : " + (width * height / 2));
	}
}
