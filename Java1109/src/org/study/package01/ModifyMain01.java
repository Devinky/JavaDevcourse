package org.study.package01;
//같은패키지
public class ModifyMain01 {
	
	public static void main(String[] args) {
		
		ModifyEX01 m1 = new ModifyEX01();
		m1.num1 = 1;
		m1.setNum2(2);
		m1.num3 = 3;
		m1.num4 = 4;
		
		ModifyEX02 m2 = new ModifyEX02();
		m2.num1_1 = 5;
		m2.setNum2_1(6);
		m2.num3_1 = 7;
		m2.num4_1 = 8;
	}

}
