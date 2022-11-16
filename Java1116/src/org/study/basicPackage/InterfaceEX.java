package org.study.basicPackage;

//인터페이스 복습

interface A0{
	//public void 생략가능(인터페이스는 무조건 추상메서드 생성이니까)
	void m1();
}
interface A1{
	//public final은 생략 가능
	public final int MAXNUM = 100;
	abstract void ab1();
	default void d1() {
		System.out.println("디폴트");
	}
}
interface B2 extends A0, A1{
	void m2();
}

class MainClass implements B2{ //구현클래스

	@Override
	public void m1() {}

	@Override
	public void ab1() {}

	@Override
	public void m2() {}
	
}

public class InterfaceEX {
	
	public static void main(String[] args) {
		MainClass m1 = new MainClass();
		//구현해보기
	}

}
