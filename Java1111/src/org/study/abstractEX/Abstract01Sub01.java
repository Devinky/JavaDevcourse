package org.study.abstractEX;

//구현객체 <- 추상클래스 Abstract01을 구현함
public class Abstract01Sub01 extends Abstract01 {

	@Override
	public void abstractM1() {
		System.out.println("추상메서드 abstractM1");
	}

	@Override
	public void abstractM2(String name) {
		System.out.println(name);
	}
	

}

