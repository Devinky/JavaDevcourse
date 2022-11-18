package org.study.arrayEX;

public class arrayEX02 {
	public static void main(String[] args) {
		System.out.println("배열");
		
		int[] arr1 = new int[5];
		System.out.print(arr1);
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		
		System.out.println();
		
		int[] arr2 = new int[] {1,2,3,4,5}; //선언하고 바로 초기화한 것
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]);
		}
		
		System.out.println();
		
		int[] arr3 = {1,2,3,4,5,'g'};
		for(int i:arr3) {
			System.out.print(i);
		}
		
		System.out.println();
		
		char[] arrCh = {'a','b','c','d'};
		for(int i=0;i<arrCh.length;i++) {
			System.out.print(arrCh[i]);
		}
		
		System.out.println();
		
		String[] strArr = {"JAVA","JSP","THYEMLEAF","HTML"};
		for(String str: strArr) {
			System.out.print(str);
		}
		
	}

}
