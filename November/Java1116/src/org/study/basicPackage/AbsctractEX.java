package org.study.basicPackage;

//추상클래스 복습

abstract class Ab1{ //추상클래스
	int num;
	abstract void m1();
}

abstract class B extends Ab1{
	abstract void m2();
}

class Ab2 extends Ab1{ //구현객체

	@Override
	void m1() {
	}
}

public class AbsctractEX {
	
	public static void main(String[] args) {
		Ab1 ab2 = new Ab2();
		ab2.num = 10;
		ab2.m1();
		
	}

}
