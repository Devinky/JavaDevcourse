package org.study.conditionEX;

import java.util.Scanner;

public class Quiz02 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 : ");
		int kor = input.nextInt();
		
		System.out.println("영어 점수 입력 : ");
		int eng = input.nextInt();
		
		System.out.println("수학 점수 입력 : ");
		int math = input.nextInt();
		
		int sum = kor + eng + math;
		int avg = sum/3;		
		String gra = "";
		
		if(avg>=90) {
			gra = "A";
		}else if(avg>=80) {
			gra = "B";
		}else if(avg>=70) {
			gra = "C";
		}else if(avg>=60) {
			gra = "D";
		}else {
			gra = "F";
		}
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + gra);
		
		System.out.println("성적 확인 프로그램을 종료합니다.");

		input.close();
	}

}
