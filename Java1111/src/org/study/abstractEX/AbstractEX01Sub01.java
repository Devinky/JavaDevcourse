package org.study.abstractEX;

public class AbstractEX01Sub01 extends AbstractEX01 {

	//1. 상속받은 추상메서드를 구현
	@Override
	public void abstractMethod() {
		System.out.println("추상메서드 오버라이딩"); //선언부만 똑같고 구현부는 다른 오버라이딩
	}

	//2. 다시 추상클래스 생성
	//추상메서드
//	public abstract void abstractMethod2();
	
}
