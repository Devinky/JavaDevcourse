package org.java.variableEx;

public class VrEx01 {
	
	public static void main(String[] args) {
		// 1. 변수
		/*
		 1. 변수를 선언
		 2. 변수를 초기화 -> data에 할당
		 3. 변수를 메모리에 할당 
		 */		
		 //Java의 기본 타입 primitive types		 		 
		
		//정수형
		byte b; //byte형의 변수 b를 선언함
		b = 10; //변수  b를 정수형 data 10으로 초기화 -> 메모리에 할당
		
		byte b2 = 12; //byte형의 변수 b2를 선언하고 12로 초기화
		short s = 14; //short형의 변수 s를 선언하고 10으로 초기화
		int i = 20; //int형의 변수 i를 선언하고 20으로 초기화
		long l = 30; //long형의 변수 l을 선언하고 30으로 초기화
		
		//실수형 기본타입 double
		float f = 1.1f; //float형 변수 f를 선언하고 1.1로 초기화(float형 소수를 사용할 땐 값에 f 붙여줘야 함)
		double d = 1.5; //double형 변수 d를 선언하고 1.5로 초기화
		 
		//문자형
		char c1 = 'a'; //char형 변수 c를 선언하고 'a'로 초기화
		
		//논리형
		boolean bool = true;
		boolean bool2 = false;
		
		
		//콘솔에 출력
		System.out.println("자바의 기본 자료형");
		System.out.println(b);
		System.out.println(b2);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c1);
		System.out.println(bool);
		System.out.println(bool2);
		System.out.println("b : " + b + " 입니다");
		System.out.println("b2 : " + b2 + " 입니다");
		System.out.println("true? false? : " + bool2 + " 입니다");
	}

}
