package org.study.loopEX;

import java.util.Scanner;

public class dowhileEX02 {
	public static void main(String[] args) {
		
		System.out.println("do~while");
		System.out.println("구구단");
		/*
		int i = 1;
		
		do {
			i++;
			System.out.println("\n구구단 " + i + "단");
			
			int j = 0;
			do {
				j++;
				System.out.println(i + " x " + j + " = " + (i*j));
			}while(j<9);
			
		}while(i<9);
		*/
		
		//시작단, 끝단을 입력 받아서 시작단부터 끝단까지 콘솔에 출력
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("시작할 단을 입력하세요 : ");
		int start = input.nextInt();
		
		System.out.print("끝낼 단을 입력하세요 : ");
		int end = input.nextInt();	
		
		int i = start;
		
		do {
			System.out.println("\n구구단 " + i + "단");			
			int j = 0;
			
			do {
				j++;
				System.out.println(i + " x " + j + " = " + (i*j));
			}while(j<9);
			
			i++;
		}while(i<=end);
		
		input.close();
	}

}
