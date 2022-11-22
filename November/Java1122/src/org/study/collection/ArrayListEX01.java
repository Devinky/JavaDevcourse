package org.study.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEX01 {
	
	public static void main(String[] args) {
		
		System.out.println("ArrayList");
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(new Integer(10));
		list1.add(new Integer(20));
		list1.add(new Integer(30));
		list1.add(new Integer(40));
		list1.add(new Integer(50));
		
		for(Integer list: list1) {
			System.out.println(list);
		}
		
		Iterator<Integer> iter = list1.iterator();
		while(iter.hasNext()) {
			Integer i2 = iter.next();
			System.out.println(i2+" ");
		}
		
		System.out.println(list1.size());
//		System.out.println(list1.add(2, 15)); //-> println과 함께 사용 불가능
		System.out.println(list1.add(15));
//		list1.clear();
		System.out.println(list1.size());
		System.out.println(list1.get(0));
	}

}
