package org.study.oop;

public class CalculatorEX {
	
	public int num1;
	public int num2;
	public String op;
	
	public static final String PROJECTNAME = "Caculator";
	
	//매개변수 3개(num1, num2, op)
	//+, -, *, /, %
	
	public void sum() {
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	
	public void sub() {
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
	}
	
	public void mult() {
		System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
	}
	
	public void div() {
		System.out.println(num1 + " ÷ " + num2 + " = " + (num1/num2));
	}
	
	public void rem() {
		System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
	}
	
}
