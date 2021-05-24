package day05;

public class Test06_Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		System.out.println( s1 );
		
		Singleton s2 = Singleton.getInstance();
		System.out.println( s2 );
		
		Singleton s3 = Singleton.getInstance();
		System.out.println( s3 );
	}

}

class Singleton {
	
	static Singleton s = new Singleton();
	private Singleton(){}
	
	public static Singleton getInstance() {
		return s;
	}
}