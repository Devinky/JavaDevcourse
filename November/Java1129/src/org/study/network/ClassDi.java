package org.study.network;

import java.util.Date;

class A{
	public A() {
		System.out.println("A기본생성자");
	}
}

interface A1{
	
}

class B{
	A a;
	A1 a1;
	Date day;
	
	public B() {
		System.out.println("기본생성자");
	}
	public B(A a){ //DI -> 생성자 통해서 주입
		this.a = a;
	}
					//매서드를 통해 주입
	public void dayMethod(Date day) {
		this.day=day;
		System.out.println();
	}
	
	public void interM(A1 a1) {
		this.a1 = a1;
	}
	
	public A getA() {
		return a;
	}
	
	public Date getDay() {
		return day;
	}
	
}

public class ClassDi {
							//매개변수
	public static void strM(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
			//매개인자
		strM(new String("문자열")); //call (String str = new String("문자열");)
		strM("문자열");
		
		new B(new A()); //매개변수에 객체 타입
		new B().interM(new A1() {
		});
		
	}
}
