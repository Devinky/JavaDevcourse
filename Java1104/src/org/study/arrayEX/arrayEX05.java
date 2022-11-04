package org.study.arrayEX;

public class arrayEX05 {
	public static void main(String[] args) {
		System.out.println("배열");
		char[] c1 = new char[5];
		char[] c2 = new char[] {'a','b','c','d','e'};
		char[] ch = {'a','b','c','d','e'};
		
		for(int i = 0; i<ch.length; i++){
			System.out.println(ch[i]);
		}
		System.out.println("------------------------");
		for(char idx:ch) { //객체형 반복문
			System.out.println(idx);
		}
		System.out.println("------------------------");
		
		int[] arrInt = new int[45];
		for(int i:arrInt) {
			System.out.println(i);
		}
	}

}
