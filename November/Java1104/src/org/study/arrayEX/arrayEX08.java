package org.study.arrayEX;

public class arrayEX08 {
	public static void main(String[] args) {
		System.out.println("다차원배열");
		
		int[][] arr1 = new int[3][4];
		
		System.out.println(arr1.length);//행 갯수만 출력됨
		System.out.println(arr1[0].length);//열 갯수
		System.out.println(arr1[0][0]);
		
		int num = 0;
		
		for(int i=0;i<arr1.length;i++) { //행 번호를 찍는 코드
			//System.out.println(arr1[i]);
			
			for(int j=0;j<arr1[i].length;j++) { //행에 해당하는 열의 갯수
				arr1[i][j] = ++num;
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println("");
		}
		
	}
		
}


