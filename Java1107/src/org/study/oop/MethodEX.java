package org.study.oop;

public class MethodEX {
	
	//반환타입X, 매개변수X
	public void method1() {
		System.out.println("인스턴스 method");
		//return; //생략가능		
	}
	
	//반환타입O, 매개변수X
	public int method2() {
		//↓ 매서드 내에서 선언된 변수: 지역변수, return을 만나면 종료됨
		int num1 = 10;
		int num2 = 20;
		return num1 + num2; //int로 반환		
	}
	
	//반환타입O, 매개변수X
	public String method3() {
		String name = "m1234";
		return name;
	}
	
	//반환타입X, 매개변수O
	public void method4(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
	}
	
	//반환타입O, 매개변수O
	public int method5(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("반환값 int, 매개인자 2");
		return sum;
	}
	
	//반환타입X, 매개변수O
	public void method6(int num1, int num2, String op) {
		
		if(op.equals("+")) {
			System.out.println(num1 + op + num2 + "=" + (num1+num2));
		}else if(op.equals("-")) {
			System.out.println(num1 + op + num2 + "=" + (num1-num2));
		}else if(op.equals("*")) {
			System.out.println(num1 + op + num2 + "=" + (num1*num2));
		}else if(op.equals("/")) {
			System.out.println(num1 + op + num2 + "=" + (num1/num2));
		}else if(op.equals("%")) {
			System.out.println(num1 + op + num2 + "=" + (num1%num2));
		}else {
			System.out.println("연산자 입력 오류");
		}
	}



}
