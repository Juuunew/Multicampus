package day08;

public class Employee<T,P extends Number> {
	
	public static void main(String[] args) {
		Employee<String,Integer> emp1 = new Employee<String,Integer>("홍길동",123);
		System.out.println(emp1);
		
	    Employee<String,Double> emp2 = new Employee<String,Double>("김길동",999.6);
	    System.out.println(emp2);
		
	    Employee emp3 = new Employee("고길동",123);
	    System.out.println(emp3);
	    
	    Employee emp4 = new Employee("고길동",1);
	    System.out.println(emp4);
	    
	    Employee emp5 = new Employee();
	    System.out.println(emp5);
	}
	
	T name;
	P num;
	
	public Employee() {
		super();
	}
	public Employee(T name, P num) {
		super();
		this.name = name;
		this.num = num;
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public P getNum() {
		return num;
	}
	public void setNum(P num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", num=" + num + "]";
	}

	
}
