package org.study.oop;

public class OverLoading01 {
	
	public static final String projectname = "projectname";
	public int num1;
	public static int num2;
	
	public static void staticMethod() {
		//num1 = 100; static 멤버만 접근 가능
		num2 = 200;		
	}
	
	public void nonstaticMethod() {
		num1 = 100;
		num2 = 200;
	}
	
	public void method1() {
		System.out.println("method1");
	}
	
	public void method1(int num1) {
		System.out.println(num1);
	}
	
	public void method1(int num1, String name) {
		System.out.println(num1);
		System.out.println(name);
	}
	
	public void method1(String name, int num1) {
		System.out.println(name);
		System.out.println(num1);
	}

}
