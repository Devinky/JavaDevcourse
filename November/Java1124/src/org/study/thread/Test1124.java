package org.study.thread;

import java.util.LinkedList;
import java.util.Stack;

public class Test1124 {

	public static void main(String[] args) {
		
		Stack<Integer> st1 = new Stack<Integer>();
		
		st1.push(10);
		st1.add(20);
		st1.add(30);
		st1.add(40);
		st1.add(50);		
		System.out.println(st1);
		
		LinkedList<Integer> qu = new LinkedList<Integer>();
		
		for(int i=1;i<=5;i++) {
			qu.add(i*10);			
		}
		System.out.println(qu);
		System.out.println(qu.peek());
		
		
		int i = 2;
		
//		while(i<10) {
//			System.out.println(i+"단");
//			int j = 1; //while문 바깥에 선언하면 한번만 10까지 출력하고 끝나버림
//			while(j<10) { //1~9까지 돌고 위로 올라가면 j가 1부터 다시 시작됨
//				System.out.println(i+"x"+j+"="+(i*j));
//				j++;				
//			}
//			i++;
//		}
		
		while(true) {
			System.out.println(i+"단");
			if(i<9) i++;
		}
		
	}
	
	
}
