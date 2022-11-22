package org.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListEX02 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Java"); //자동박싱
		String str = (String)list.get(0); //형변환
		
		//1.5버전부터
		List<String> list2 = new ArrayList<String>(10);
		List<String> list3 = new ArrayList<>();
		
		list2.add("아무거나 넣어보기");
		String str1 = list2.get(0);
		list3.add("Java");
		String str2 = list3.get(0);
		
		System.out.println(str1);
		System.out.println(str2);
	
	}

}
