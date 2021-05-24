package day05;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		
//		emp1.name = "홍길동";
//		emp1.dept = "인사부";
//		emp1.age = 29;
		emp1.setName( "홍길동" );
		emp1.setDept( "인사부" );
		emp1.setAge( 29 );
		
		Employee emp2 = new Employee();
		
		//emp2.age = 31;
		emp2.setName( "고길동" );
		emp2.setDept( "영업부" );
		emp2.setAge( 31 );
		
		Employee emp3 = new Employee();
		
		//emp3.age = 32;
		emp3.setName( "박길동" );
		emp3.setDept( "영업부" );
		emp3.setAge( 32 );
		
//		emp1 = emp2;
//		//emp1.name = "~~~~";
//		if( emp1 != null ) emp1.print();
//		if( emp2 != null ) emp1.print();
//
//		emp1 = null;
//		if( emp1 != null ) emp1.print();
//		
//		Employee emp3 = emp2;
//		System.out.println(emp2.name.charAt(0)+"**");
//		System.out.println(emp2.age);
		
		Employee[] employees = new Employee[] { emp1, emp2, emp3, new Employee(), null, null, null, null };
		
		for( Employee data:employees ) {
			//if( data == null ) break;
			
			if( data != null && data.getName() != null && data.getName().length() > 0) {
				data.print();
				System.out.println( data.getName().charAt(0) + "**" );
			}
		}
	}

}
