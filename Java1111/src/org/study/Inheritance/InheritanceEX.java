package org.study.Inheritance;

class A{
	public int num1;
	private int num2;
	protected int num3;
	
	public A() { //기본생성자(원래는 생략되어있음)
		super();   //Object 클래스에서 상속받았기 때문에
	}
	
	public A(String name) {
		System.out.println(name);
	}
	
	public void method1() {
		System.out.println("A Method 1");
	}
}

class B extends A{
	int num4;
	
	public B() {
		super("문자열"); //부모클래스(A)에서 상속받을 수 있는 생성자는 2개이다
						//기본생성자와, String 매개변수를 가진 생성자
						//둘 중 하나를 선택해서 상속받을 수 있다
	}
	
	@Override
	public void method1() {
		System.out.println("오버라이드 B Method 1"); //구현부(재정의 가능)
		
	}
}

public class InheritanceEX {
	
	public static void main(String[] args) {
		A a = new A(); //new 생성자로 객체 생성
		a.num1 = 10;
		a.num3 = 30;
		a.method1();
		B b = new B();
		b.num1 = 20;
		b.num3 = 60;
		b.num4 = 70;
		b.method1(); //메서드 오버라이딩
		
	}

}
