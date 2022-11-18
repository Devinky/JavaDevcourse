package org.study.arrayEX;

public class arrayEX09 {
	public static void main(String[] args) {
		
		System.out.println("다차원배열 예제");
		
		//5행 5열 다차원배열 int[][] arrInt2 생성
		//정수 10부터 10씩 더해서 250까지 초기화 시키고 콘솔에 출력하기
		
		int [][] arrInt2 = new int[5][5];
		
		int num2 = 0;
		
		for(int i=0;i<arrInt2.length;i++) {
			for(int j=0;j<arrInt2[i].length;j++) {
				arrInt2[i][j] = num2*10+10;
				
				System.out.print(arrInt2[i][j] + "\t");
				num2++;
			} 
			System.out.println(" ");
		}
		
	}
		
}


