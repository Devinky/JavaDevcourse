package org.study.loopEX;

import java.util.Scanner;

public class whileEX05 {
	
	public static void main(String[] args) {
		System.out.println("while(true)");
		//숫자 0이 입력되면 while문을 종료
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int num1 = input.nextInt();			
			System.out.print("입력값 : " + num1 + "\n");
			
			if(num1==0) {
				System.out.println("while문을 종료합니다.");
				break; //조건이 true면 반복문을 종료
			}
			
		}
		
		input.close();
	}

}
