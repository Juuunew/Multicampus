package day06;

public class Fish extends Animal{
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
	
	public static void main(String[] args) {
		Fish f = new Fish("쿠피");
		f.print();
		
		f.breath();
		((Animal)f).breath();
	}
}
