package org.study.io;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1125 {
	
	public static void main(String[] args) {
		//컬렉션은 인퍼테이스 클래스와 구현객체로 이루어짐(인터페이스가 구현객체를 이용해야 사용할 수 있는 것과 같음)
		//List는 순서가 있다
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(30); //자동박싱
		list.add(40);
		list.add(50);
		
		//foreach문	list를 el에 담음
		for(Integer el: list) {
			System.out.println(el);
		}
		
		//Set -> 주머니와 비슷한 개념(순서가 없다) -> 다른 점은 중복이 불가능한 것
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		System.out.println(set);
		
		Iterator<Integer> iter1 = set.iterator();
		
		while(iter1.hasNext()) {
			Integer el = iter1.next();
			System.out.println(el);
		}
		
		//Map -> 키와 값의 쌍<key, value> -key중복 불가능, value중복 가능
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "java");
		map.put(2, "oracle");
		map.put(3, "HTML");
		map.put(4, "javascript");
		map.put(5, "WEB");
		
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		Iterator<Integer> iter2 = keys.iterator();
		
		while(iter2.hasNext()){
			Integer el = iter2.next();
			System.out.println(el); //key
			//key에 해당하는 value
			System.out.print(map.get(el));
		}
	}

}
