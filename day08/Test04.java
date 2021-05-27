package day08;

public class Test04 {

	public static void main(String[] args)  {
		System.out.println("**************start***********************");
		
		try {
			int num = 4;
			if(num % 2 == 0) {
				System.out.println(num);
				//throw new RuntimeException("짝수 안됨");
				throw new Exception("짝수 안됨 ~~~~~");
			}
	    } catch (Exception e) {
	    	System.err.println(e.getMessage());
		}

	    System.out.println("*********************************");
	    
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		System.out.println("***********end*******************");
	}

}
