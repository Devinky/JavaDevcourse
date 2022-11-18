package org.study.oop;

public class OverLoadingMain {
	
	public static void main(String[] args) {
		
		OverLoading01 over1 = new OverLoading01();
		
		over1.method1();
		over1.method1(100);
		over1.method1(100,"OverLoading1");
		over1.method1("OverLoading2",100);
		
		System.out.println();
		System.out.println(true);
		System.out.println('C');
		System.out.println(new char[] {'c','a','f','e'});
		System.out.println(1.15);
		System.out.println(1.15f);
		System.out.println(10);
		System.out.println(10L);
		System.out.println(new OverLoading01());
		System.out.println(new String("String"));
		System.out.println("String2");
		
	}

}
