package org.study.innerclass;

public class InnerClassEXMain {

	public static void main(String[] args) {
		//InnerClassEX와 같이 보기
		
		//인스턴스화(객체화)	  new(객체생성, 객체주소가 만들어짐)
		InnerClassEX in1 = new InnerClassEX(); //<-생성자
					//객체 주소가 어디에 만들어지는가? 객체참조변수에(in)
		//내부클래스 생성
		//in1.new InstanceClass2();
		//↑ = new InnerClassEX().new InstanceClass2();
		InnerClassEX.InstanceClass2 inC = in1.new InstanceClass2();
		//내부클래스 타입 선언						//내부클래스 생성
		inC.num1 = 100;
		inC.m1();
									//static 클래스 생성 new 외부클래스.내부클래스();
		InnerClassEX.StaticClass2 s1 = new InnerClassEX.StaticClass2();
		InnerClassEX.StaticClass2.method1(); //static메서드 구현
		
		//지역클래스
		InnerClassEX inC2 = new InnerClassEX();
		inC2.localMethod();
	}

}
