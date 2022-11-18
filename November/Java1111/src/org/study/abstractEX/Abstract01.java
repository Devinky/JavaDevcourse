package org.study.abstractEX;

//추상클래스(=추상메서드가 있는 클래스. 다른 의미 없음)
public abstract class Abstract01 {
	
	int num1;
	
	//추상메서드(선언부만 있고 구현부가 없는 미완성메서드)
	//구현 객체 상속을 통해서 강제로(반드시) 메서드를 오버라이딩하여 구현한다
	public abstract void abstractM1();
	public abstract void abstractM2(String name);
	
	//추상메서드가 아니어서 반드시 구현하지는 않아도 됨(강제성X)
	public void m1() {
		System.out.println("M1메서드(일반)");
	}
	
}
