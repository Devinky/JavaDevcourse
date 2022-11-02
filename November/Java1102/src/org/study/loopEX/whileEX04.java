package org.study.loopEX;

import java.util.Scanner;

public class whileEX04 {
	
	public static void main(String[] args) {
		
		System.out.println("while문으로 구구단 출력 예제");
		//Scanner이용해서 시작단과 끝단을 입력 받아 콘솔에 출력하기
		//단, 시작단은 끝단보다 작아야 한다
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("구구단 출력 프로그램");
		
		System.out.print("\n시작하고 싶은 단을 입력하세요 : ");
		int start = input.nextInt();
		
		System.out.print("몇 단까지 보고 싶으신가요? : ");
		int last = input.nextInt();
		
		int i = start;
		
		if(start<=last) {
			while(i<=last) {
				System.out.println("\n구구단 " + i + "단");
				
				int j = 1;
				while(j<10) {
					System.out.println(i + " x " + j + " = " + (i*j));
					j++;
				}i++; 
			}
		}else {
			System.out.println("시작단이 끝단보다 작아야합니다. 다시 입력해주세요.");
		}
		
		input.close();
		
	}

}
