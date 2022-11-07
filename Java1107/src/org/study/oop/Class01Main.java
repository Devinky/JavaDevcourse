package org.study.oop;

public class Class01Main {
	
	public static void main(String[] args) {
		
		System.out.println("static맴버(클래스맴버)");
		
		Class01.title = "클래스맴버";
		Class01.classMethod();
		
		Class01 c1 = new Class01();
		c1.name = "m1";
		c1.age = 29;
		c1.title = "title01";
		System.out.println(Class01.PROJECTNAME);
		c1.instanceMethod();
		
		FieldEX f1 = new FieldEX();
		
		
	}

}
