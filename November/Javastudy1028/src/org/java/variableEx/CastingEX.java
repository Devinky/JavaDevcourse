package org.java.variableEx;

public class CastingEX {
	public static void main(String[] args) {
		System.out.println("형 변화");
		System.out.println("자동형변환");
		
		int i = 10;
		double d = 1.1;
		double d2 = i + d;
		double d3 = 20 + 1.5;
		
		byte b1 = 20;
		byte b2 = 30;
		short s1 = 10;
		
		int i3 = b1 + b2; //byte+byte=int
		
		System.out.println("강제형변환");
		
		int j = (int)1.1;
		System.out.println(j);
		
		int j2 = 10 + (int)1.1;
		System.out.println(j2);
		
		byte b4 = 10;
		byte b5 = 20;
		byte b6 = (byte)(b4 + b5);
		System.out.println(b6);
	}

}
