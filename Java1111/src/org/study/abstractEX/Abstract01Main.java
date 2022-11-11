package org.study.abstractEX;

public class Abstract01Main {

	public static void main(String[] args) {
		
		Abstract01Sub01 a1 = new Abstract01Sub01();
		a1.abstractM1();
		a1.abstractM2("추상메서드2");
		
		Abstract01Sub01SubSub s1 = new Abstract01Sub01SubSub();
		s1.abstractM1();
		s1.abstractM2("뭐가나올까?");
		s1.abstractM3();
		
		//부모 타입의 객체 참조 변수로 자식 객체에 접근할 수 있게 해주는 다형성
		//추상클래스로는 접근이 불가능함
		Abstract01 ab2 = new Abstract01Sub01SubSub();
		ab2.num1 = 10;
		ab2.abstractM1();
		ab2.abstractM2("name");
		
		//구현 객체간의 상속관계가 없으면 다형성이 성립하지 않는다
		//Abstract01Sub01 ab3 = new Abstract01Sub01SubSub();
			
			
	}

}

