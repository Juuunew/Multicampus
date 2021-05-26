package day07;

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

	@Override
	public void breath() {
		System.out.println( "폐 동작" );
	}
	
	
}
