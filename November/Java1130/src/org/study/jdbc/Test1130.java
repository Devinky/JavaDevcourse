package org.study.jdbc;

class A{
	
	String name;
	
	public A() {
		System.out.println("기본생성자");
	}
	
	public A(String name) {
		this.name = name;
	}
}

public class Test1130 {
	
	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A("A타입 생성사 호출(객체 생성)");
		
	}

}
