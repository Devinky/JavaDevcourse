package org.study.Polymorphism;

public class Sub02 extends Parent {
	
	public int num2;
	
	@Override
	public void excuteQueryCommend() {
		System.out.println("오버라이딩 Sub02");
	}
	
	public void m2() {
		System.out.println("인스턴스 m2");
	}

}
