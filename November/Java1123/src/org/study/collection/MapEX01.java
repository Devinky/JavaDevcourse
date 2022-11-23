package org.study.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEX01 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		//1, user1
		//2, user2
		//3, user3
		//4, user4
		//5, user5
		
		//2. 키와 값 추가
		map.put(1, "user1");
		map.put(2, "user2");
		map.put(3, "user3");
		map.put(4, "user4");
		map.put(5, "user5");
		
		//3. key값 저장 -> Set -> keySet()저장
		Set<Integer> keys = map.keySet();
		
		//4. Iterator
		Iterator<Integer> mapRun = keys.iterator();
		while(mapRun.hasNext()) {
//			Integer el = mapRun.next(); //언박싱
			int key = mapRun.next(); //자동언박싱 -> key
			String val = map.get(key); // -> key에 해당하는 value
			
			System.out.println("key: " + key + " value: " + val); //key에 대응되는 value값이 출력됨
			
		}
		
	}

}
