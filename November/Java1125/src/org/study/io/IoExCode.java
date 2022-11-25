package org.study.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoExCode {
	
	public static void main(String[] args) {
		
		InputStreamReader myRead = null;
		
		try {
			System.out.println("이름을 입력하세요");
			myRead = new InputStreamReader(System.in);
			BufferedReader bufRead = new BufferedReader(myRead);
			String name = bufRead.readLine();
			
			System.out.println("환영합니다 " + name + "! 시험 점수를 입력하세요");
			
			String[] subject = {"국어","영어","수학"}; //과목명 3개 배열 선언
			int[] score = new int[3]; //과목 점수를 넣을 3개짜리 배열 선언
			
			double sum = 0.0;
			
			for (int i=0; i<subject.length;i++) {
				System.out.print(subject[i] + " : "); //과목명 콘솔에 출력
				String scoreIn = bufRead.readLine();
				score[i] = Integer.parseInt(scoreIn);
				sum += score[i]; //세 과목 평균점수
			}
			System.out.println("국어 : " + score[0] + "점" + " / 영어 : " + score[1] + "점" + " / 수학 : " + score[2] + "점");
			System.out.println("평균 : " + sum/score.length);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
