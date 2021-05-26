package day07;

public  class Fish extends Animal{
	String name;
	
	public Fish() {
		super("Fish");
	}
    
	public Fish(String name) {
		super("Fish");
		//kind = "Fish";
		this.name = name;
	}

	@Override
	public void print(){
		super.print();
		System.out.printf("%s[%s] %n",kind,name);
	}
	
	@Override
	public void breath() {
		System.out.println("아가미로 숨쉬기 ...");
	}
	
}

abstract class Bird extends Animal {}