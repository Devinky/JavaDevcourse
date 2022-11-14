package org.study.interfaceEX;

interface A1{
	void a1();
}

interface B1{
	abstract void b1();
}

class ABSub{

}
						//클래스 extends 클래스 implements 인터페이스
public class InterfaceEX5Main extends ABSub implements A1, B1 {
	
	@Override
	public void a1() {
		System.out.println("오버라이딩 a1");
	}
	@Override
	
	public void b1() {
		System.out.println("오버라이딩 b1");
	}
		
	public static void main(String[] args) {
//		a1(); static메서드에서는 static만 사용할 수 있다(a1은 void라 사용불가)
	}

}
