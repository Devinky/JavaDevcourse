package org.study.innerclass;

interface A{
	void ab1();
}
class A1 implements A{
	@Override
	public void ab1() {
		System.out.println("오버라이드 ab1");
	}
}

public class AnonymousClass01 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.ab1();
		
		//익명클래스 -> new 부모(){};
		new A() { //인터페이스는 객체를 생성하지 못하는데 객체가 생성된 것처럼 보임 -> 익명클래스
			@Override
			public void ab1() {
				System.out.println("오버라이딩2");
			}
		};
	}
}
