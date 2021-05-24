package day05;

public class Test04 {
	public static void main(String[] args) {
		
		Employee emp0 = new Employee();
		
		//emp0.print();
		
		Employee emp1 = new Employee( "홍길동", "인사부", 29);
		
		//emp1.print();
		
		Employee emp2 = new Employee( "고길동", "영업부", 31 );
		
		//emp2.print();
		
		Employee[] employees = {
				new Employee( "이길동", "영업부", 31 ),
				new Employee( "고길동", "영업부", 31 ),
				new Employee( "박길동", "영업부", 31 ),
				new Employee( "최길동", "영업부", 31 ),
				new Employee( "나길동", "영업부", 31 ),
				null,
				null,
				null
		};
		
		for( Employee data : employees ) {
//			if( data != null ) data.print();
//			if( data != null && data.getName().length() > 0 ) System.out.println( data.getName().charAt(0) + "**" );
			if( data != null && data.getName() != null && data.getName().equalsIgnoreCase( "고길동" ))
					data.print();
			
		}
	}
}
