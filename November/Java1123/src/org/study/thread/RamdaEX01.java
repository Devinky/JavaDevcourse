package org.study.thread;

interface Inter1{
	void interm1();
}

interface Inter2{
	void interm2();
}

public class RamdaEX01 {
	//익명클래스로 interm1 구현
	public static void main(String[] args) {
		
		Inter1 i1 = new Inter1() {
			@Override
			public void interm1() {
				System.out.println("추상메서드");
			}
		};
		i1.interm1();
		
		Inter1 i2 = ()->{ //람다식으로 추상메서드 구현
			System.out.println("추상메서드2");
		};
		i2.interm1();
		
		
		//Inter2를 익명클래스로 구현하기
		//익명클래스로 인터페이스 추상메서드 구현
		Inter2 i3 = new Inter2() {

			@Override
			public void interm2() {
				System.out.println("Inter2");
			}
		};
		i3.interm2();
		
		//람다식으로 인터페이스 추상메서드 구현(코드양이 줄어든다)
		Inter2 i4 = ()->{
			System.out.println("Inter2 Ramda");
		};
		i4.interm2();
		
				
	}
		
}
