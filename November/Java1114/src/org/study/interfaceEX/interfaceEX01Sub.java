package org.study.interfaceEX;

public class interfaceEX01Sub implements interfaceEX01, interfaceEX02 {

	public int num1;
	public void method1() {
		System.out.println("method1");
	}
	
	@Override
	public void abstractMethod1() {
		System.out.println("오버라이딩 추상메서드2");
	}

	@Override
	public void abstractMethod2() {
		System.out.println("오버라이딩 추상메서드2");
	}

}
