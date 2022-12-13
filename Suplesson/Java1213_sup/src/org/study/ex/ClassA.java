package org.study.ex;

class A{
	public int a;
	
	public void a1() {
		System.out.println("A클래스의 a1메서드");
	}
}

class B extends A{
	public int b;
	
	@Override
	public void a1() {
		System.out.println("A클래스를 상속받아 A클래스에 포함된 a1메서드를 오버라이딩");
		super.a1();
	}
}

public class ClassA {
	//필드
	public int num1;
	private int num2;
	//생성자
	public ClassA() {
		System.out.println("기본생성자");
	}
	public ClassA(int num1) {
		System.out.println("생성자 오버로딩");
	}
	//메서드
	public void method1() {
		System.out.println("메서드");
	}

}
