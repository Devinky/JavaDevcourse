package org.study.arrayEX;

public class arrayEX10 {
	public static void main(String[] args) {
		
		System.out.println("다차원배열 예제2");
		//구구단 출력 프로그램과 같다고 생각하기
		
		 //행,열  배열이름
		int[][] score = {
				{100, 66, 77},
				{88, 66, 88},
				{80, 46, 97},
				{70, 88, 80},
				{100, 90, 88}
		};
				
		System.out.println("=================중간고사  성적표=================");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("============================================");
		
		int kor = 0;
		int math = 0;
		int eng = 0;
		
		//i=행;i가 행의 갯수보다 적을 때까지 i의 수를 증가시킨다
		for(int i=0;i<score.length; i++) {
			
			kor += score[i][0]; //score[0] 국어 점수 합계 -> 0열의 합계
			eng += score[i][1]; //score[1] 영어 점수 합계 -> 1열의 합계
			math += score[i][2]; //score[2] 수학 점수 합계 -> 2열의 합계
			
			//점수 합계와 평균점수, 나중에 쓰기 위해 선언함
			int sum = 0;
			double avg = 0.0;
			//번호 행을 화면이 출력함
			System.out.print(i + "\t");
			//j=열;j가 열의 갯수보다 적을 때까지 j의 수를 증가시킨다
			for(int j=0;j<score[i].length;j++) {
				sum += score[i][j]; //합계에 행과 열을 합한 수를 누적함
				System.out.print(score[i][j] + "\t"); //행과 열을 출력
			}
			avg = sum/score[i].length; //합계값을 행의 갯수만큼 나눔
			System.out.print(sum + "\t");
			System.out.println(avg + "\t");
		}
		System.out.println("============================================");
		
		System.out.println("과목별\t" + kor + "\t" + math + "\t" + eng);
		
		/*
		int kor = 0;
		int math = 0;
		int eng = 0;
		int sum = 0;
		double avg = 0.0;
		int scoreLength = score.length; //배열의 길이
		
		System.out.println("중간고사 성적표");
		System.out.println("번호 국어 수학 영어 총점 평균");
		System.out.println("======================");
		
		for (int i = 0; i<scoreLength; i++) {
			System.out.print(" " + (i+0) + " ");
			
			kor += score[i][0]; //score배열의 0번지 합계(국어)
			math += score[i][1]; //score배열의 1번지 합계(영어)
			eng += score[i][2]; //score배열의 2번지 합계(수학)
			
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + " ");
				sum += score[i][j];
				}
			
			avg = (double)sum/scoreLength;
			System.out.println(sum + " " + avg);
		}
		
		System.out.println(("=================="));
		System.out.println("과목별 " + kor + " " + math + " " + eng);
		*/
		}
		
}


