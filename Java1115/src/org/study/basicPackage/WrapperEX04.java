package org.study.basicPackage;

public class WrapperEX04 {
	
	public static void main(String[] args) {
		System.out.println("Wrapper클래스");
		
		Character c10 = new Character('a');
		Character c12 = 'c'; //<-자동박싱
		char c11 = c10.charValue();
		
		Boolean b10 = new Boolean(false);
		boolean b11 = b10.booleanValue();
		
		Float f10 = new Float(1.1f);
		float f11 = f10.floatValue();
		
		String sF10 = f10.toString();
		System.out.println("문자열 : " + sF10);
		
		Double d10 = new Double(1.1);
		double d11 = d10.doubleValue();
		
		Short s10 = new Short((short)10);
		short s11 = s10.shortValue();
	}

}
