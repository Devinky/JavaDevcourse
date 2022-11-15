package org.study.basicPackage;

public class WrapperEX05 {
	
	public static void main(String[] args) {
		System.out.println("Wrapper클래스");
		
		int i = 10;
		Integer i2 = new Integer(i); //박싱
		int i3 = i2.intValue(); //언박싱
		
		Integer i4 = 20; //자동박싱
		int i5 = i4; //자동언박싱
		int i6 = new Integer(100);
		System.out.println(i4.toString());
		
		Integer i7 = new Integer("111"); //String -> Integer
		int i77 = i7.intValue();
		
		String str = "123";
		int i8 = Integer.parseInt(str); //string -> Integer
		
		Character c10 = new Character('a'); //박싱
		char c11 = c10.charValue(); //언박싱
		
	}

}
