package day06;



import java.util.Calendar;
import java.util.Date;

import day05.Employee;

public class Test01 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee("홍길동","인사부",26);
		
		emp1.print();
		emp2.print();
		
		
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		
		System.out.println(d);
		System.out.println(c);
		
		String msg = String.format("%tY 년, %tA", d,d);
		String msg2 = String.format("%tY 년, %tA", c,c);
    
		System.out.println(msg);
		System.out.println(msg2);

	}

}


class Time{
	int h;
	int m;
	int s;
	boolean am;
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public boolean isAm() {
		return am;
	}
	public void setAm(boolean am) {
		this.am = am;
	}
	
	
	
}


