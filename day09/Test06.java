package day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Test06 {
	public static void main(String[] args) {
		System.out.println("********************** []  Arrays ***************************");

		String[] s1 = {"홍길동","고길동","박길동","나길동" };
		System.out.println(Arrays.toString(s1));
		Arrays.sort(s1);
		System.out.println(Arrays.toString(s1));
		
//		Arrays.sort(s1, new Comparator<String>() {
//			@Override
//			public int compare(String a, String b) {
//				return a.compareTo(b) * -1;
//			}
//		});
		Arrays.sort(s1,(a, b) -> {return a.compareTo(b) * -1;});
		System.out.println(Arrays.toString(s1));
		
		System.out.println("********************** List    Collections ***************************");
		
		List<String> list = new ArrayList<String>();
        list.add("홍길동");
        list.add("고길동");
        list.add("김길동");
        list.add("홍길동");
        list.add("박길동");
        list.add("나길동");
        list.add("이길동");

        Collections.sort(list);
        Collections.sort(list,(a, b) -> {return a.compareTo(b) * -1;});
        
        System.out.println("---   foreach  ----");
        list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.print("*"+t.charAt(1)+"*    ");
			}
        });
        
        list.forEach(t -> {
				System.out.print("*"+t.charAt(1)+"*    ");
			});
        
        
        list.forEach(i->{
        	System.out.println(i.charAt(0)+"**");
        });
        
        
        
	}
}









