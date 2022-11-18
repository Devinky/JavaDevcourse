package org.study.oop;

import java.lang.reflect.Method;

public class MethodBasicMain {
	
	public static String userId;
	
	public static final String PROJECT = "PROJECT2022";
	
	public static void main(String[] args) {
		
		userId = "m111"; //static메소드는 static필드를 사용
		
		MethodBasic.ClassMethod1();
		
		MethodBasic method1 = new MethodBasic();
		
		method1.method1();
		int sum = method1.method2();
		System.out.println(method1.method2());
		System.out.println(sum);
		
		method1.method3(300, 25);
		method1.method3(54,27);
		
		int sum2 = method1.method4(38, 77);
		System.out.println(sum2);
	}
	

}
