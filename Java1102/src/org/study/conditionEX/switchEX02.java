package org.study.conditionEX;

import java.util.Scanner;

public class switchEX02 {
	
	public static void main(String[] args) {
		System.out.println("Switch");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("알파벳을 하나 입력하세요 : ");
		String alpha = input.next(); //알파벳(대소문자 구분 없이) 한 글자 입력
		
		switch(alpha) {
		case "a":
		case "A":
			System.out.println("A");
			break;
			
		case "b":
		case "B":
			System.out.println("B");
			break;
			
		case "c":
		case "C":
			System.out.println("C");
			break;
			
		default:
			System.out.println("a,A,b,B,c,C 이외의 알파벳입니다.");
		}
	}

}
