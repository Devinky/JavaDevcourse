package org.study.loopEX;

public class whileEX03 {
	
	public static void main(String[] args) {
		
		System.out.println("while문으로 구구단 출력");
		
		System.out.println("구구단(2~9)\n");
		
		int i = 2;
		
		while(i<10) {
			System.out.println("구구단 " + i + "단");
			
			int j = 1;
			while(j<10) {
				System.out.println(i + " x " + j + " = " + (i*j));
				j++;
			}
			i++;
		}
		
	}

}
