package day08;

import java.util.Date;

public class Employee2<T> {
	
	public static void main(String[] args) {
		Employee2<String> emp1 = new Employee2<String>("홍길동","1234");
		System.out.println(emp1);
		System.out.println(emp1.num.getClass());
		
	    Employee2<Integer> emp2 = new Employee2<Integer>("김길동",9999);
	    System.out.println(emp2);
	    System.out.println(emp2.num.getClass());
		
	    //Employee emp3 = new Employee("고길동",new Date());
	    Employee2 emp3 = new Employee2("고길동",1);
	    System.out.println(emp3);
	    System.out.println(emp3.num.getClass());
	    System.out.println(emp3.name.charAt(0));
	    if(emp3.num instanceof String) {
	    	String s = (String) emp3.num;
	    	System.out.println(s.charAt(0));
	    }

	    
	}
	
	
	String name;
	T num;
	
	
	public Employee2(String name, T num) {
		super();
		this.name = name;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getNum() {
		return num;
	}
	public void setNum(T num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", num=" + num + "]";
	}
	
	
}
