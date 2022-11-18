package org.study.Polymorphism;

class Parent{
	void excuteQuery() {
		System.out.println("SQL실행");
	}
}

class Sub1 extends Parent{
	@Override
	void excuteQuery() {
		System.out.println("SQL1");
	}
}

class Sub2 extends Parent{
	@Override
	void excuteQuery() {
		System.out.println("SQL2");
	}
}

public class PolymorphismEX02 {
	public static void main(String[] args) {
		
	Parent parent = new Parent();
	parent.excuteQuery();
	
	parent = new Sub1();
	parent.excuteQuery();
	
	parent = new Sub2();
	parent.excuteQuery();
	
	
	}

}
