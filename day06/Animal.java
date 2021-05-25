package day06;

public class Animal extends Object{
	String kind = "동물의 종류 ";
	
	public Animal() {	}    

	public Animal(String kind) {
		this.kind = kind;
	}

	public void print() {
		System.out.printf(" **** %s ***** %n",kind );
	}

		
	public void breath() {
		System.out.println("폐로 숨쉬기 ...");
	}
	
	public static void main(String[] args) {
		Animal a1  = new Animal();
		System.out.println(a1.kind);
		a1.breath();
		
		
		Animal a2 = new Animal("강아지");
		System.out.println(a2.kind);
		a2.breath();
		
	}
}
