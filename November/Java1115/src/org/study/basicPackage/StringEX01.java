package org.study.basicPackage;

public class StringEX01 {
	
	public static void main(String[] args) {
		System.out.println("String");

		char[] ch = {'J','a','v','a','2','0','2','2'};
		String str5 = new String(ch);
		
		String str1 = "Java2022"; //스트링리터럴(문자열리터럴)
		String str2 = "Java2022"; //JVM리터럴테이블(공유)
		
		System.out.println(str1 == str2); //객체비교
		System.out.println(str1.equals(str2)); //값
		
		String str3 = new String("Java2022"); //스트링객체
		String str4 = new String("Java2022"); //heap
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
	}

}
