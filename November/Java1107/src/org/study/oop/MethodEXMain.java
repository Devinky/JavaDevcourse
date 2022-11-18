package org.study.oop;

public class MethodEXMain {
	
	public static void main(String[] args) {
		MethodEX m1 = new MethodEX();
		
		m1.method1();
		
		int num2 = m1.method2();
		System.out.println(num2);
		
		String str1 = m1.method3();
		System.out.println(str1);
		
		m1.method4(20, 30);
		m1.method4(200, 300);
		
		int sum = m1.method5(15, 20);
		System.out.println(sum);
		
		m1.method6(10, 20, "+");
		m1.method6(10, 20, "-");
		m1.method6(10, 20, "*");
		m1.method6(10, 20, "/");
		m1.method6(10, 20, "%");
		m1.method6(10, 20, "");
	}

}
