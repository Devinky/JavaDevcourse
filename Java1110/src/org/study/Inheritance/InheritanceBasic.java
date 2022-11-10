package org.study.Inheritance;

class Parents{
	public int num1;
	private int num2;
	protected String op;
	
	public Parents() {
	}
	public Parents(int num1) {
		this.num1 =num1;
	}
	public void parentsMethod() {
		System.out.println("parentsMethod");
	}
}

class Son1 extends Parents{
	public int num3;
	
	@Override
	public void parentsMethod() {
		System.out.println("자식parentsMethod");
		super.parentsMethod();
	}
}

class Son2 extends Parents{
	public int num4;
	public void son2Method() {
		System.out.println("son2Method");
	}
}

public class InheritanceBasic{
	
	public static void main(String[] args) {
		Parents p = new Parents();
		
		Son1 s1 = new Son1();
		s1.parentsMethod();
		
		Son2 s2 = new Son2();
		s2.parentsMethod();
	}

}
