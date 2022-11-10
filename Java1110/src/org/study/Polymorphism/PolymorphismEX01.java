package org.study.Polymorphism;

class A{
	int a;
}

class B extends A{
	int b;
}

class C extends B{
	int c;
}

public class PolymorphismEX01 {
	public static void main(String[] args) {
		
		A a = new A();
		a.a = 10;
		a = new B();
		a = new C();
			
		System.out.println(a);
		

	}

}
