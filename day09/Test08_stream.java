package day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test08_stream {
	public static void main(String[] args) {
		String[] s1 = {"홍길동","고길동","kim","박길동","lee","나길동","고순신","고릴라" };
		List<String> list = Arrays.asList(s1);
		
		list.forEach(i->System.out.println(i.toUpperCase()));
		System.out.println("------------------------------------");
        list.stream()
        .filter(i-> i.charAt(0) =='고' )
        .forEach(i->System.out.print(i+"  "));
		
		
        System.out.println(".................");
        List<Book> books = new ArrayList<Book>();
		books.add(new Book("java", 900));
		books.add(new Book("sql", 700));
		books.add(new Book("html5", 6700));
		books.add(new Book("servlet&jsp", 1700));
		books.add(new Book("html5", 6700));
		books.add(new Book("spring", 2700));
		books.add(new Book("html5", 6700));
		books.add(new Book("spring boot", 1100));
       
		
		books.forEach(i->System.out.println(i.getTitle().toUpperCase()));
		System.out.println("********************************************");
		books.stream().forEach(i->System.out.println(i));
		System.out.println("********************************************");
		books.stream().distinct().forEach(i->System.out.println(i));
		System.out.println("********************************************");
        long count = books.stream().filter(i->i.getPrice() < 3000).count();
		System.out.println(count);
		
		long sum = books.stream().mapToInt(i->i.getPrice()).sum();
		System.out.println(sum);
	}
}










