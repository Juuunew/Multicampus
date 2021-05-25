package day06;

public class Test05 {
	public static void main(String[] args) {
		Dog[] dogs = {new Dog(),new Dog("시츄", "쫑쫑") };
		Fish[] fishs = {new Fish("쿠피"),new Fish()};
		
		Animal[] animals = {
				new Dog(),
				new Dog("시츄", "쫑쫑"),
				new Fish("쿠피"),
				new Fish()
		};

		for(Animal data  : animals) {
			/*
			if(data instanceof Dog) {
				//((Dog) data).print();
				Dog d = (Dog) data;
				d.print();
			}
			if(data instanceof Fish) ((Fish) data).print();
			*/
			//data.breath();
			data.print();
			
			
		}
	}
}
