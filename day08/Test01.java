package day08;

import java.io.Serializable;

import day08.exception.NegativeAgeException;

public class Test01 {
	public static void main(String[] args) {

		String msg1 = "hello java";
		Object msg2 = "hello java";

		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg2.toString());
		System.out.printf("%s equals(%s) ==> %b %n", msg1, msg2, msg1.equals(msg2));

		try {
			Employee1 emp1 = new Employee1("홍길동", "인사부", 26);
			Object emp2 = new Employee1("홍길동", "인사부", 6);

			System.out.println(emp1);
			System.out.println(emp2);
			System.out.println(emp2.toString());
			System.out.printf("%s equals(%s) ==> %b %n", emp1, emp2, emp1.equals(emp2));
			System.out.printf("%s equals(%s) ==> %b %n", emp1, emp2, emp2.equals(emp1));

			System.out.printf("%s equals(%s) ==> %b %n", msg1, emp2, msg1.equals(emp1));

		} catch (NegativeAgeException e) {
			System.err.println(e.getMessage());
		}
		
		
		System.out.println("END");
	}
}

class Employee1 extends Object implements Serializable {
	String name;
	String dept;
	int age;

	public Employee1() {
		super();
	}

	public Employee1(String name, String dept, int age) throws NegativeAgeException {
		super();
		this.name = name;
		this.dept = dept;
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws NegativeAgeException {
		// if(age < 0) throw new RuntimeException("나이 음수 안됨");
		if (age < 0) throw new NegativeAgeException();
		this.age = age;
	}

	@Override
	public String toString() {
		String msg = String.format("Employee [name= %s, dept=%s, age=%d]", name, dept, age);
		return msg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (age != other.age)
			return false;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/*
	 * @Override public boolean equals(Object obj) { boolean flag = false; if(obj
	 * instanceof Employee) { Employee data = (Employee) obj;
	 * if(name.equals(data.name) && dept.equals(data.dept) && age == data.age) {
	 * flag = true; } } return flag; }
	 */
}
