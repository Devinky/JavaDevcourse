package org.study.interfaceEX;

interface A{
	void a1();
}

interface A2{
	void a2();
}

interface B extends A, A2{ //인터페이스도 다중 상속이 가능하다
	void b1();
}

class AB implements B{

	@Override
	public void a1() {
		
	}

	@Override
	public void a2() {
		
	}

	@Override
	public void b1() {
		
	}	
}

public class Interface4Main {
	
	public static void main(String[] args) {
		AB a = new AB();
	}

}
