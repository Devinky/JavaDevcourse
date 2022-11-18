package org.study.interfaceEX;

interface Re1{
	public abstract void re1();
}

interface Re2 extends Re1{
	abstract void re2();
}

class Re3 implements Re2{

	@Override
	public void re1() {
		System.out.println("추상메서드 인터페이스 상속 연습");
	}

	@Override
	public void re2() {
		System.out.println("추상메서드 인터페이스 상속 연습2");
	}
	
}

public class InterfaceReview {

}
