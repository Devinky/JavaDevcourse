package org.study.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEX01 {
	
	public static void main(String[] args) {
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		
		map1.put("학생1", "김포도");
		map1.put("학생2", "이포도");
		map1.put("학생3", "박포도");
		map1.put("학생4", "최포도");
		map1.put("학생5", "강포도");
		
		System.out.println(map1);
		System.out.println(map1.get("학생2"));
		
		//1.keySet() -> key를 set (key는 중복되지 않는다)
		Set<String> set = map1.keySet(); //키값을 저장
		//2.출력
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			String val = map1.get(key); //key값을 이용해서 value를 get
			System.out.println("키: " + key + " | 값: " + val);
		}
		
	}

}
