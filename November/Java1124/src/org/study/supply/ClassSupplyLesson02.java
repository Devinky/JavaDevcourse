package org.study.supply;

abstract class Ab1{
	//선언부
	public void m1() {
		//구현부
		System.out.println("m1메서드");
	}
	//추상메서드(구현부{}가 없음)
	public abstract void a1();
}

//인터페이스
interface In1{
	final int NUM1 = 100;
	public abstract void in();
	default void m1() {
		System.out.println("default메서드");
	}
}

class Ab1Sub extends Ab1{ //Ab1의 구현객체

	@Override
	public void a1() {
		System.out.println("추상클래스Ab1의 추상메서드a1 오버라이딩");
	}
	
}

class In1Sub implements In1{ //In1의 구현객체

	@Override
	public void in() {
		System.out.println("인터페이스 In1 오버라이딩");
	}
	
}
	
public class ClassSupplyLesson02 {
	
	public static void main(String[] args) {
		
		Ab1Sub a1 = new Ab1Sub(); //구현객체를 통해 구현
		a1.a1();
		
		In1Sub i1 = new In1Sub();
		i1.in();
		
	}

}
