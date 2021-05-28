package day09;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test04_Comparable {
	public static void main(String[] args) {
		
		//Set<Book> books = new HashSet<Book>();
		Set<Book> books = new TreeSet<Book>();
		books.add(new Book("java", 900));
		books.add(new Book("sql", 700));
		books.add(new Book("html5", 6700));
		books.add(new Book("servlet&jsp", 1700));
		books.add(new Book("html5", 3700));
		books.add(new Book("spring", 2700));
		books.add(new Book("html5", 1700));
		books.add(new Book("spring boot", 1100));
		
		System.out.printf("등록 ? %b %n", books.add(new Book("sql", 700)));
		System.out.printf("등록 ? %b %n", books.add(new Book("sql", 700)));


		Iterator<Book> it = books.iterator();
		while(it.hasNext()) {
			Book data =  it.next();
			System.out.println(data);
		}
		
		System.out.println("end");
	}
}

class Book extends Object implements Serializable,Comparable<Book>{
	String title;
	int price;
	
	public Book() {
		super();
	}
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book o) {
		//return price  - o.price;
		//return title.compareTo(o.title);
		return title.compareTo(o.title) == 0 ? price - o.price : title.compareTo(o.title);

	}
	
	
}