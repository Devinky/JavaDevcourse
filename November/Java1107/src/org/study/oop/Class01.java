package org.study.oop;

public class Class01 {
	
	public String name;
	public int age;
	public static String title;
	public static final String PROJECTNAME = "JAVA Project"; 
	
	public void instanceMethod() {
		System.out.println("인스턴스 매서드");
	}
	
	public static void classMethod() {
		System.out.println("클래스 매서드");
	}

}
