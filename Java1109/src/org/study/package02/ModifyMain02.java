package org.study.package02;

import org.study.package01.ModifyEX01;
//다른패키지
public class ModifyMain02 {
	
	public static void main(String[] args) {
		ModifyEX01 m1 = new ModifyEX01();
		
		m1.num1 = 100;
		
		
		//new ModifyEX02(); //EX02는 접근지정자가 없어서 접근불가능(default)
	}

}
