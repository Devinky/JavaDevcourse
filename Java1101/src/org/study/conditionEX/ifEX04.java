package org.study.conditionEX;

import java.util.Scanner;

public class ifEX04 {
	
	public static void main(String[] args) {
		
		System.out.println("조건이 둘일 때");
		//점수를 입력해서 90점 이상이면 A, 95점 이상이면 A+를 출력
		//점수를 입력해서 80점 이상이면 B, 85점 이상이면 B+를 출력
		//점수를 입력해서 70점 이상이면 C, 75점 이상이면 C+를 출력
		//점수를 입력해서 90점 이상이면 D, 95점 이상이면 D+를 출력
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = input.nextInt();
		
		if(kor>=90) {
			if(kor>=95) {
				System.out.println("A+");
			}else {
				System.out.println("A");
			}
		}else if(kor>=80) {
			if(kor>=85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}
		}else if(kor>=70) {
			if(kor>=75) {
				System.out.println("C+");
			}else {
				System.out.println("C");
			}
		}else if(kor>=60) {
			if(kor>=65) {
				System.out.println("D+");
			}else {
				System.out.println("D");
			}
		}else {
			System.out.println("F");
		}
		
		System.out.println("를 받았습니다. 축하합니다.");
		input.close();

	}
	
}
