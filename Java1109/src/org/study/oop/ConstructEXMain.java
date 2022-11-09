package org.study.oop;

public class ConstructEXMain {
	
	public static void main(String[] args) {
		
		ConstructEX c1 = new ConstructEX();
		c1.setUserID("m0");
		c1.setUserPW("0000");
		c1.setAge(22);
		
		ConstructEX c2 = new ConstructEX("m1");
		//c2.setUserPW("9876");
		//c2.setAge(51);
		
		ConstructEX c3 = new ConstructEX("m2", "1234");
		//c2.setAge(12);
		
		ConstructEX c4 = new ConstructEX("m3", "5478", 30);
		
		c4.info2();
	}
	

}
