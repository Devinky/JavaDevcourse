package org.study.loopEX;

public class whileEX02 {
	
	public static void main(String[] args) {
		
		System.out.println("while문2");
		
		int i = 0;
		
		//0~9까지만 출력하려면? if문, break사용
		
		while(true) {
			System.out.println(i);
			
			if(i>=9) break;
			i++;						
		}
		
	}

}
