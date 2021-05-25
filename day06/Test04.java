package day06;

public class Test04 {

	public static void main(String[] args) {
		Animal d = new Dog();
		Animal f = new Fish();
		
         breathCall( new Fish());
         breathCall( new Dog());
         breathCall( new Fish("~~~"));
         breathCall( "~~~~~");
         
	}
	
	
	public static void breathCall(Animal a) { //?
		 a.breath();
	}
	
	public static void breathCall(Object a) {
		 if(a instanceof Animal) { 
			 //((Animal)a).breath();
			 
			 Animal aa = (Animal)a;
			 aa.breath();
		 }
	}
	
	
}
