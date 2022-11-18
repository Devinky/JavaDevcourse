package org.study.ScannerEx;

import java.util.Scanner;

public class ScannerEx02 {
	
	public static void main(String[] args) {
		System.out.println("Scanner");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 정수로 입력하세요 : ");
		int first = scn.nextInt();

		System.out.print("두번째 숫자를 정수로 입력하세요 : ");
		int second = scn.nextInt();
		
		System.out.println(first + " + " + second + " = " + (first + second));
	}

}
