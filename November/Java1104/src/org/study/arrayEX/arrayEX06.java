package org.study.arrayEX;

public class arrayEX06 {
	public static void main(String[] args) {
		System.out.println("배열");
		
		char[] ch = {'a','b','c','d','e'};
		
					//new : 메모리 공간에 주소를 할당받고 뭔가를 만듦
		String str1 = new String(ch); //char형 String
		System.out.println(str1);
		
		String str2 = String.valueOf(ch);
		System.out.println(str2);
		
	}

}
