package org.study.interfaceEX;

public class interfaceEX01SubMain {
	
	public static void main(String[] args) {
		
//		new interfaceEX01() new로 객체생성 불가능
		
		//interfaceEX01Sub 타입(구현객체타입, 자식타입)
		interfaceEX01Sub in1 = new interfaceEX01Sub();
		in1.num1 = 10;
		in1.abstractMethod1();
		in1.abstractMethod2();
		in1.defaultMethod();
		in1.method1();
		int maxNum1 = in1.MAXNUM;
		
		System.out.println();
		
		interfaceEX01 in2 = new interfaceEX01Sub();
		in2.abstractMethod1();
		in2.defaultMethod();
		
		System.out.println();
		interfaceEX02 in3 = new interfaceEX01Sub();
		in3.abstractMethod2();
		
	}

}
