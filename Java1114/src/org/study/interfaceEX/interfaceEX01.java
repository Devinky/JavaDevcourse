package org.study.interfaceEX;

public interface interfaceEX01 {
	
//	public int num1;
	public static final int MAXNUM = 1000; //final상수
	public abstract void abstractMethod1();//abstract메서드★
	public static void staticMethod1() {
		System.out.println("static메서드");
	}
	
	default void defaultMethod() {
		System.out.println("default메서드");
	}

}
