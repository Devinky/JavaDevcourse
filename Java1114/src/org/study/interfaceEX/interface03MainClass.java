package org.study.interfaceEX;

public class interface03MainClass {
	
	public static void main(String[] args) {
		interfaceEX03Main in1 = new interfaceEX03Main();
		in1.excuteQuery();
		int num1 = in1.MAXNUM;
		in1.name = "interfaceEX03Main";
		
		System.out.println();
		
		interfaceEX03 in2 = new interfaceEX03Main();
		in2.excuteQuery();
		int num2 = in2.MAXNUM;
	}

}
