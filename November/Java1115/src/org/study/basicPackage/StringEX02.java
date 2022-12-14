package org.study.basicPackage;

public class StringEX02 {
	
	public static void main(String[] args) {
		System.out.println("String");
		//String 생성 방법
		String str1 = "Java2020";
		String str2 = new String("Java2020");
		char[] ch = {'J','a','v','a','2','0','2','0'};
		String str3 = new String(ch);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("String Method");
		
		String s1 = "Java";
		String s2 = "Oracle";
		
		String strTest1 = "java 2022 Project";
		int size = strTest1.length();
		System.out.println("문자열 길이 : " + size);
		char strTest1Ch = strTest1.charAt(5);
		System.out.println(strTest1Ch);
		
		//문자열 비교(사전순서)
		System.out.println(strTest1.codePointAt(5)); //빠른
		System.out.println(s1.compareTo(s2)); //동일
		System.out.println("m1".compareTo("m1")); //늦은
		
		//문자열 결합 -> 원래 문자열은 그대로, 원본이 수정되지 않는다
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = s1.concat(s2);
		System.out.println(s3);

		System.out.println(s1);
		System.out.println(s2);
		
		//문자열에 찾을 값이 포함되어 있는지?
		System.out.println("m1234".contains("1"));
		
		String strTest2 = "Java 2022 Projact2";
		//문자열 중에 값을 찾아 변경, 원본수정X
		String newstr2 = strTest2.replace("2022","2023");
		System.out.println(newstr2);
		System.out.println(strTest2); //원본은 바뀌지 않음
		
		String phone = "010-1234-5678";
		//문자열을 -로 구분하여 잘라서 String배열화
		String[] cut = phone.split("-");
		System.out.println(cut.length);
		
		//for문 출력
		for(int i=0;i<cut.length;i++) {
			System.out.println(cut[i]);
		}
		System.out.println();
		
		//foreach문 출력
		for(String s:cut) {
			System.out.println(s);
		}

		//대문자로
		System.out.println("abcd".toUpperCase());
		//소문자로
		System.out.println("abcd".toLowerCase());
		
		String str4 = " abcdefg ";
		System.out.println(str4.length());
		String str4Trim = str4.trim();
		System.out.println(str4Trim.length());
		
	}

}
