package org.study.loopEX;

import java.util.Scanner;

public class forEX03 {
	public static void main(String[] args) {
		
		System.out.println("for문 예제");
		//Scanner이용해서 시작단과 끝단을 입력 받아 콘솔에 출력하기
		//단, 시작단은 끝단보다 작아야 한다
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("구구단 출력 프로그램");
		
		System.out.print("시작하고 싶은 단을 입력하세요 : ");
		int start = input.nextInt();
		
		System.out.print("몇 단까지 보고 싶으신가요? : ");
		int last = input.nextInt();
		
		if(start<last) { //if문을 맨 처음에 적어야하는구나....
			for(int i=start;i<=last;i++) {
				System.out.println("\n구구단 " + i + "단");		
				for(int j=1;j<10;j++) {
					System.out.println(i + " x " + j + " = " + (i*j));
				}
			}
		}else {
			System.out.println("시작단이 끝단보다 작아야합니다. 다시 입력해주세요.");
		}
		
	input.close();
	}
	
}
