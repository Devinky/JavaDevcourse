package org.study.OperatorEx;

public class operator04 {
	
	public static void main(String[] args) {
		
		System.out.println("비교연산자");
		
		//String str1 = new String();
		//str = java;
		
		String str1 = new String("Java");
		String str2 = new String("Java");
		String str3 = "Java";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(80==80);
		System.out.println("Java"=="Java");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3=="Java");
		
		System.out.println("Java".contentEquals(str1));
		System.out.println(str2.contentEquals(str1));
		System.out.println(str3.contentEquals(str1));
		//객체(문자열)의 값만 비교
	}

}
