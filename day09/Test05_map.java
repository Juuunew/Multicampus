package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test05_map {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		Map<String, Member> members = new HashMap<String, Member>();
		
		map.put("java01", "1234");
		map.put("java07", "1111");
		map.put("java09", "0909");
		map.put("java03", "2224");
		map.put("java06", "1111");

//		System.out.println(map);

		System.out.println(map.get("java01"));
		System.out.println(map.get("java99"));  // null
		System.out.println(map.containsKey("java99"));
		
		
		String id = "java06";
		String pw = "1111";
		if(map.get(id) != null) {
		    if(map.get(id).equals(pw)) {
		    	 System.out.println(" 로그인 성공");
		    }else {
                 System.out.println("pw 확인해 주세요  ");		    	
		    }
		}else {
			System.out.println(" ID 확인 해 주세요 ..");
		}
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.printf("%s=%s %n",key,map.get(key));
		}
		
        System.out.println("---   foreach  ----");
//        map.forEach(new BiConsumer<String, String>() {
//			@Override
//			public void accept(String key, String v) {
//                   System.out.printf("id(%s) => pw(%s) %n",key,v);				
//			}
//		
//        });

        map.forEach((key, v) -> {
                   System.out.printf("id(%s) => pw(%s) %n",key,v);				
	    });
	}

}








