package org.study.basicPackage;

public class WrapperEX01 {
	
	public static void main(String[] args) {
		System.out.println("Wrapper클래스");
		System.out.println("기본타입 => 객체형 : 박싱");
		
		Byte b2 = new Byte((byte)10);
		Short s2 = new Short((short)10);
		Integer i2 = new Integer(10);
		Long l2 = new Long(10);
		Float f2 = new Float(1.1f);
		Double d2 = new Double(1.1);
		Character ch2 = new Character('a');
		Boolean bool2 = new Boolean(false);
		
		System.out.println(b2);
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(ch2);
		System.out.println(bool2);
	
	}

}
