package org.study.oop;

public class ClassBasicMain {
	
	//main : 특수한 매서드(가장 먼저 읽는다)
	//접근지정자 static(클래스매서드) 반환타입 main
	public static void main(String[] args) {
		
						//객체생성연산자 : 주소값을 생성
						//new : 인스턴스화(객체)
		ClassBasic c1 = new ClassBasic();
		//c1 : 객체참조변수(=객체)
		
		c1.userID = "m111";
		c1.userPW = "1111";
		c1.age = 29;
		
		System.out.println(c1.getClass());
		System.out.println("id: " + c1.userID);
		System.out.println("password: " + c1.userPW);
		System.out.println("age: " + c1.age);
		
		//ClassBasic 타입에 객체를 생성하고 c2(객체참조변수)를 이용해서 
		//userID는 s111, userPW는 22222, age는 30으로 초기화하고 콘솔에 출력
		
		ClassBasic c2 = new ClassBasic();
		
		c2.userID = "s111";
		c2.userPW = "22222";
		c2.age = 30;
		
		System.out.println(c2.getClass());
		System.out.println("id: " + c2.userID);
		System.out.println("password: " + c2.userPW);
		System.out.println("age: " + c2.age);
		
	}

}
