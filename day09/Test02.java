package day09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test02 {
	public static void main(String[] args) {
		
		//ArrayList<String> list = new ArrayList<String>();
		
		List<String> list = new ArrayList<String>();
//		List<String> list = new Vector<String>();
		System.out.println(list.size());
        list.add("홍길동");
        list.add("고길동");
        list.add("김길동");
        list.add("홍길동");
        list.add("박길동");
        list.add("나길동");
        list.add("이길동");
		
        
        String keyword = "최길동";
		System.out.printf(" %s ?  %b %n",keyword,list.contains(keyword));
		
		if(!list.contains(keyword)) {
			list.add(keyword);
		}
		
		for(int i=0; i < list.size() ;i++) {
        	System.out.print(list.get(i)+" ");
        }
        System.out.println();
        
        for(String data :list) {
        	System.out.print(data.charAt(0)+"**");
        }
        
        System.out.println();
        System.out.println("------------ Iterator 기반 순회 ----------------------");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
			String data = it.next();
			if(data.equals("박길동")) it.remove();
		}
        
		System.out.println("***************************");
	}
}
















