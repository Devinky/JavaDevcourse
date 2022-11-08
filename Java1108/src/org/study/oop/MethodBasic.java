package org.study.oop;

public class MethodBasic {
	
	public String userId;
	//메소드
	//인스턴스 메소드
	public void method0() {
		userId = "m111";
		System.out.println("Id: ");
	}

	//클래스 메소드
	public static void ClassMethod1() {
		//userId = "m2222"
		System.out.println("클래스 메소드");
	}
	
	//1
	public void method1() {
		System.out.println("반환값X 매개변수X method1");
		return; //생략가능(반환값이 없으니까)
	}
	//2
	public int method2() {
		int num1 = 10;
		int num2 = 20;
		System.out.println("반환값O 매개변수X method2");
		return num1 + num2;
	}
	//3
	public void method3(int num1, int num2) {
		System.out.println("반환값X 매개변수O method3"); //void라 반환값X
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
	}
	//4
	public int method4(int num1, int num2) {
		System.out.println("반환값O 매개변수O method4");
		return num1 + num2;
	}
}
