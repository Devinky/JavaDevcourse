package org.study.oop;

import java.util.Scanner;

public class ConstructEXMain {
	
	public static void main(String[] args) {
		
		//생성자를 호출해서 계산기 만들기
		//Scanner 이용하기
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("계산기");
		
		System.out.print("연산할 첫번째 수 입력 : ");
		int n1 = input.nextInt();
		
		System.out.print("연산자 입력(+-*/%) : ");
		String op2 = input.next();
		
		System.out.print("연산할 두번째 수 입력 : ");
		int n2 = input.nextInt();

		ConstructEX con3 = new ConstructEX(n1, n2, op2);
		
		int num1 = con3.getNum1();
		int num2 = con3.getNum2();
		String op = con3.getOp();
		
		if(op.equals("+")) {
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		}else if(op.equals("-")) {
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		}else if(op.equals("*")) {
			System.out.println(num1 + "*" + num2 + "=" + (num1-num2));
		}else if(op.equals("/")) {
			System.out.println(num1 + "/" + num2 + "=" + ((double)num1-num2));
		}else if(op.equals("%")) {
			System.out.println(num1 + "%" + num2 + "=" + (num1-num2));
		}else {
			System.out.println("연산자 입력 오류");
		}
			
		input.close();
		
//		System.out.println(con3.getNum1());
//		System.out.println(con3.getNum2());
//		System.out.println(con3.getOp());
		
	}
}
