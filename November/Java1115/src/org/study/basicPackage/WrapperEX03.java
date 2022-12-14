package org.study.basicPackage;

public class WrapperEX03 {
	
	public static void main(String[] args) {
		System.out.println("Wrapper클래스");
		
		int i = 10;
		
		Integer i2 = new Integer(i);
		System.out.println(Integer.bitCount(i));
		
		System.out.println(i2.intValue());
		System.out.println(i2.longValue());
		System.out.println(i2.shortValue());
		
		int i3 = Integer.parseInt("111");
		Integer i4 = Integer.parseInt("111");
		System.out.println(i3 == i4);
		System.out.println(i3 + "," + i4);
		
									//2진수 111을 10진수로 변환하는 것
		System.out.println(Integer.parseInt("111", 2));
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
		
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toString(10));
		
		String i6 = Integer.toString(100);
		int i7 = Integer.parseInt(i6);
		System.out.println(i6);
		System.out.println(i7);
	}

}
