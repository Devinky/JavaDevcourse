package org.study.arrayEX;

public class arrayEX03 {
	public static void main(String[] args) {
		System.out.println("배열");
		
		//로또 0번지~44번지 -> 1~45 배열
		//1. 배열 선언
				
		int[] lotto = new int[45];
		System.out.println(lotto.length);
		//2. 초기화
				
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
			//System.out.println(lotto[i]);
		}
		
		//System.out.println(Math.random());
		
		int temp;
		
		for(int i=0;i<1000;i++) {
			//System.out.println((int)(Math.random()*46));
			//random 인덱스 -> 0~44번지
			int index = ((int)(Math.random()*45));
			
			temp = lotto[index];
			lotto[index] = lotto[0];
			lotto[0] = temp;
		}
		
		for(int i=0;i<6;i++) {
			if(i==5) {
				System.out.println(lotto[i]);
				break;
			}
			System.out.print(lotto[i] + ",");
		}
	}

}
