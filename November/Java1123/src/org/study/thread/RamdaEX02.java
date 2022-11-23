package org.study.thread;
//클래스 구성 요소(멤버) -> 필드, 메서드, 생성자
//상속
class A{
	//필드
	public int num;
	public int num2;
	public int num3;
	
	public A() {
		System.out.println("기본생성자");
	}
	
	//메서드 선언부 -> 일 담당(동작)
	public void m1(){
		//메서드 구현부
		System.out.println("A class - m1 Method");
	}
}
class B extends A{
	
	@Override
	public void m1() {
		System.out.println("오버라이딩 m1(선택)");
		super.m1();
	}
	
	public void m2() {
		System.out.println("B class - m2 Method");
	}
}

//추상클래스 -> 추상메서드를 가진 클래스, 객체를 생성할 수 없다
abstract class Ab1{
	public int num1; //인스턴스 멤버 가질 수 있음
	public abstract void abstractM1(); //추상메서드
	public void m1() {
		System.out.println("추상클래스 m1");
	}
}

class Ab1Sub extends Ab1{

	@Override
	public void abstractM1() {
		System.out.println("추상메서드 오버라이딩(필수)");
	}
	@Override
	public void m1() {
		System.out.println("일반메서드 오버라이딩(선택)");
	}
}

//인터페이스 -> 추상클래스, 추상메서드, final상수, default 사용 가능/일반 멤버는 사용 불가, 객체 생성 불가
interface In1{
	static final int MAXNUM = 100;
	public abstract void ab1();
	default void defaultM() {
		System.out.println("default 메서드");
	}
}

class In1Sub implements In1{

	@Override
	public void ab1() {
		System.out.println("인터페이스 In1 - 추상메서드ab1 오버라이딩(필수구현)");
	}
	@Override
	public void defaultM() {
		System.out.println("인터페이스 In1 - default메서드 오버라이딩(선택구현)");
	}
}

//부모클래스


public class RamdaEX02 {
	
	public static void main(String[] args) {
		
		A a1 = new B(); //다형성
		B b1 = new B();
		
		//익명클래스
		new A() {
			@Override
			public void m1() {
				System.out.println("오버라이딩m1_1");
			}
		}.m1();
		
		A a2 = new A() {
			@Override
			public void m1() {
				System.out.println("오버라이딩m1_2");
			}
		};
		a2.m1();
		
//		A a3=()->{}; 람다식 interface에서 구현
		
		//추상클래스 구현
		new Ab1() {
			@Override
			public void abstractM1() {
				System.out.println("추상클래스 오버라이딩1");
			}
		};
		
		Ab1 ab2 = new Ab1() {
			@Override
			public void abstractM1() {
				System.out.println("추상클래스 오버라이딩2");
			}
		};
		ab2.abstractM1();
		
		System.out.println("===============================");
		
		//인터페이스 -> 이름이 없는 클래스
		new In1() {
			
			@Override
			public void ab1() {
				System.out.println("인터페이스_1");
			}
		}.ab1();
		
		In1 in2 = new In1() {

			@Override
			public void ab1() {
				System.out.println("인터페이스ab1_1");
			}
		};
		in2.ab1();
		
		System.out.println("=====람다식=====");
		//타입 변수 =()->{};
		In1 in3 = ()->{
			System.out.println("인터페이스ab1_1");
		};
		in3.ab1();
	}
		
}
