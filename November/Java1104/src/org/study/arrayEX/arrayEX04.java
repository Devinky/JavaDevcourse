package org.study.arrayEX;

public class arrayEX04 {
	public static void main(String[] args) {
		System.out.println("배열");
		//숫자 1~10까지 배열에 저장하고
		//임의의 인덱스와 for문을 이용하여 100번정도 자리바꿈을 수행
		//배열의 첫번째 인덱스부터 다섯번째 인덱스까지 콘솔에 출력
		
		//1. 배열 생성하기
		int[] arr1 = new int[10];
		
		//2. for문을 이용해 배열의 인덱스에 1~10까지 저장
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = i+0;
		}
		
		//3. 변수(빈 공간)
		int temp = 0;
		//String str = null;
		//System.out.println(str);
		
		for(int i=0;i<100;i++);{
			int idx = (int)(10*Math.random());
			//System.out.println(idx);
			
			temp = arr1[idx];
			arr1[idx] = arr1[0];
			arr1[0] = temp;
		}
		for(int i=0;i<5;i++) {
			System.out.println(arr1[i]);
		}
	}

}
