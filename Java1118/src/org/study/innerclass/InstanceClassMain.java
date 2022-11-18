package org.study.innerclass;

public class InstanceClassMain {
	public static void main(String[] args) {
		System.out.println("내부클래스(인스턴스클래스)");
		
		InstanceClass outC = new InstanceClass(); //외부클래스
		outC.age = 20;
		outC.name = "외부클래스";
		System.out.println(outC.name);
		//외부클래스타입,내부클래스				//내부클래스 객체생성
		InstanceClass.InstanceBasic inC = outC.new InstanceBasic();
		inC.age = 10;
		inC.name = "내부클래스";
		System.out.println(inC.name);
		
		InstanceClass.InstanceBasic inC2 = new InstanceClass().new InstanceBasic();
		inC2.age = 0;
		inC2.name = "내부클래스";
		System.out.println(inC2.name);
	}

}
