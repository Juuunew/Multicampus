package day06;

import java.util.Calendar;

public class Test03_is_a {

	public static void main(String[] args) {
		// is a 관계  => 모든 객체의  Data type은 부모가 될수 있다.
		// 부모 타입인 경우 : 접근 영역이 부모 영역만 가능 , 메모리 하단부 접근 X
		// 메모리 하단부 접근을 하려면 => 다운 캐스팅 
		
		Object  a1 =  new Animal();
		Animal  a2 =  new Animal();
		((Animal)a1).breath();
		
		
		Object obj;
		Animal animal;
		Dog dog = new Dog();
		System.out.println(dog.kind);
		System.out.println(((Animal)dog).kind);
		
		animal = dog;
		System.out.println(animal.kind);
		

		obj = dog;
		animal =(Animal)obj;
		
		if(obj instanceof String)
			System.out.println(((String)obj).charAt(0)+"**");
		
		obj = "홍길동";
		
		if(obj instanceof String)
			System.out.println(((String)obj).charAt(0)+"**");
		
		
		obj = "~~~~";
		obj = new Animal();
		obj = new Dog();
		obj = Calendar.getInstance();
		
		
		
	}

}




