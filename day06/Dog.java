package day06;

public class Dog extends Animal{
	String kind = "강아지 종류 ";
	String name;
	
	public Dog() {
		super("Dog");
		//super.kind = "Dog";
	}

	public Dog(String kind, String name) {
		super("Dog");
		//super.kind = "Dog";
		this.kind = kind;
		this.name = name;
	}

	@Override
	public void print() {
		super.print();
		System.out.printf("%s [%s : %s] %n",super.kind ,this.kind  ,this.name);
	}
	
	
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.print();

		Dog d2 = new Dog("시츄","쫑쫑");
		d2.print();
	}
}
