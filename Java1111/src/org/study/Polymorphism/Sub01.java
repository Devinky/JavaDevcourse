package org.study.Polymorphism;

public class Sub01 extends Parent {
	
	public int num1;
	
	@Override
	public void excuteQueryCommend() {
		System.out.println("오버라이딩 Sub01");
	}
	
	public void m1() {
		System.out.println("인스턴스 m1");
	}

}
