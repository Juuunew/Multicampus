package day08;

public class Test03 {
	public static void main(String[] args) {
		System.out.println("start");

//		if (args.length == 0) {
//			System.out.println(" 실행 파라미터 필요 (양수값 입력 )");
//			System.out.println("end");
//			return;
//		}

		String msg = "-4";
		int num = 0;
		String[] s = null;

		try {
            System.out.println("1");
			
            num = Integer.parseInt(msg);
            s = new String[num];

			System.out.println("2");
		}catch (NumberFormatException e) {
			System.err.println(e.getMessage());
			System.err.println("문자 말고 숫자로 입력 ~~~ ");
		}catch (NegativeArraySizeException e) {
			System.err.println(e.getMessage());
			System.err.println("배열의 크기  음수 안됨 ~~~ ");

		}catch (Exception e) {
            System.err.println("문제 발생 ~~~");
		}finally {
			System.out.println("finally {  }");
			s = null;
		}

		System.out.println("end");
	}
}







