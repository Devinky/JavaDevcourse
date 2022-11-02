package org.java.variableEx;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		System.out.println("Scanner");
		System.out.println("데이터를 입력하세요: ");
		
		Scanner scn = new Scanner(System.in);
		String str1 = scn.nextLine();
		
		System.out.println("입력값: " + str1);

		System.out.println("나이를 입력하세요: ");
		int age = scn.nextInt();
		
		System.out.println("당신의 나이는? " + age + "세");

		scn.close();
	}

}
