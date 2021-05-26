package day07;

public abstract class Animal extends Object{
	protected String kind = "동물의 종류 ";
	
	public Animal() {	}    

	public Animal(String kind) {
		this.kind = kind;
	}

	public void print() {
		System.out.printf(" **** %s ***** %n",kind );
	}

		
	public abstract void breath();

	
}
