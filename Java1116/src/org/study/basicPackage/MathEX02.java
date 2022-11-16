package org.study.basicPackage;

public class MathEX02 {
	
	public static void main(String[] args) {
		System.out.println("Math");
		
		//1.배열생성
		int lotto[] = new int[45];
		
		for(int i=0;i<45;i++) {
			lotto[i]=i+1; //1~45까지 숫자 뽑기
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		int temp = 0;
		for(int i=0;i<1000;i++) {
			int idx = (int)(Math.random()*45);
//			int idx2 = new Random().nextInt(45);
			temp = lotto[idx];
			lotto[idx] = lotto[0];
			lotto[0] = temp;
			
		}
		
		String result = " ";
		for(int i=0;i<6;i++) {
			result += lotto[i]+" ";
		}
		System.out.println(result);
		
	}

}
