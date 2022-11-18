package org.study.Polymorphism;

class A{
	int num1;
}

class B extends A{
	int num2;
}

class C extends B{
	int num4;
}

public class PolymorphismEX {

	public static void main(String[] args) {
		
		A a = new C();
		B b = new C();
		C c = new C();
		//하나의 메서드로 여러 활용 방법이 있다
		//A와B를 모두 가진 C 객체를 가져와서 쓸 부분만 선언하고 사용하는 방법의 예시
		a.num1 = 1; //a를 호출했을 때 A에 있는 것만 사용 가능
		b.num1 = 2;
		b.num2 = 3; //b를 호출했을 때 B에 있는 것만 사용 가능
		
//		A a1 = new A();
//		a1.num1 = 10;
//		A a2 = new B(); //B에 있는 부모타입A만 사용하겠음
//		a2.num1 = 20;
//		A a3 = new C(); //C에 있는 부모타입A만 사용하겠음
//		a3.num1 = 30;
//		
//		B b = new C(); //C에 있는 부모타입A,B만 사용하겠음
//		b.num1 = 40;
//		b.num2 = 50;
//		
//		C c = new C(); //C를 선언하고 new로 C객체를 생성해(메모리에 할당됨) c에 저장
//		c.num1 = 100;
//		c.num2 = 200;
//		c.num4 = 400;
		
	}
}
