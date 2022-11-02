package org.study.conditionEX;

import java.util.Scanner;

public class ifEX02 {
	
	public static void main(String[] args) {
		
		System.out.println("조건이 하나일 때");
		//점수를 입력해서 90점 이상이면 A를 출력 
		//점수를 입력해서 80점 이상이면 B를 출력 
		//점수를 입력해서 70점 이상이면 C를 출력 
		//점수를 입력해서 60점 이상이면 D를 출력 
		//점수를 입력해서 60점 미만이면 F를 출력 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int kor = input.nextInt();
		
		if(kor>=90) {
			System.out.println("A");
		}
		if(kor>=80 && kor<90) {
			System.out.println("B");
		}
		if(kor>=70 && kor<80) {
			System.out.println("C");
		}
		if(kor>=60 && kor<70) {
			System.out.println("D");
		}
		if(kor<60) {
			System.out.println("F");
		}
		
		System.out.println("프로그램을 종료합니다.");
		input.close();
		
		
		
	}

}
