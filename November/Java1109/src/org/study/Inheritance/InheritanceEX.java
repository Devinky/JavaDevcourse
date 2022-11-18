package org.study.Inheritance;

class A{
	int a;
//	public A() {
//		System.out.println("A");
//	}
	public A(String name) {
		System.out.println("다른생성자 " + name);
	}
	void a1() {
		System.out.println("a1");
	}
}
class B extends A{
	int b;
	public B() {
		super("부모클래스"); //super class 생성자
		System.out.println("B");
	}
	void b1() {
		System.out.println("b1");
	}
}
class C extends A{
	int c;
	public C() {
		super("부모클래스2");
		System.out.println("C");
	}
	void c1() {
		System.out.println("c1");
	}
}

public class InheritanceEX {
	public static void main(String[] args) {
		C c1 = new C();
	}

}
