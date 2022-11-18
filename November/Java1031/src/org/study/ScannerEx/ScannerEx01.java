package org.study.ScannerEx;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		System.out.println("Scanner");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("주소를 입력하세요 : ");
		String addr = scn.nextLine(); //입력 문자열을 return
		System.out.println("주소 : " + addr);
		
		System.out.print("이름을 입력하세요 : ");
		String name = scn.next(); //공백X
		System.out.println("이름 : " + name);
		
		System.out.print("나이를 입력하세요 : ");
		int age = scn.nextInt();
		System.out.println("나이 : " + age);
		
		System.out.print("신장을 입력하세요 : ");
		double hei = scn.nextDouble();
		System.out.println("신장 : " + hei);
		
	}

}
