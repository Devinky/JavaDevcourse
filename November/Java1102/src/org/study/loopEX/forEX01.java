package org.study.loopEX;

import java.util.Scanner;

public class forEX01 {
	public static void main(String[] args) {
		
		//Scanner 이용해서 변수 2개를 받아
		//첫번째 숫자 부터 두번째 숫자까지 콘솔에 출력되게 하기
		//첫번째 숫자가 두번째 숫자보다 작아야함
		
		System.out.println("첫번째 수부터 두번째 수에 도달하기까지 출력합니다.\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = input.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = input.nextInt();
		
		if(num1<num2) {
		
			for(int i=num1;i<=num2;i++) {
				if(i==num2) {
					System.out.print(i);
					break;
				}
				System.out.print(i + ",");
			}
		}else {
			System.out.println("첫번째 숫자는 반드시 두번째 숫자보다 작아야합니다.");
		}
		
		input.close();
	}

}
