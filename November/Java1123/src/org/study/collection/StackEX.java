package org.study.collection;

import java.util.Stack;

public class StackEX {
	
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		//push() 메서드를 이용해 요소를 저장 -> 마지막 요소 다음에 추가
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		
		//peek() 메서드를 이용한 요소의 변환
		System.out.println(st.peek());
		System.out.println(st);
		//pop() 메서드를 이용한 요소의 반환 및 제거 -> 마지막 요소 삭제
		System.out.println(st.pop());
		System.out.println(st);
		//search() 메서드를 이용한 요소의 위치 검색
		System.out.println(st.search(5));
		System.out.println(st.search(4));
		System.out.println(st.search(3));
		System.out.println(st.search(2));
		System.out.println(st.search(1));
		System.out.println("============================");
		
		Stack<String> stack = new Stack<String>();
		//가장 처음부터 추가
		stack.push("root1");
		stack.push("root2");
		stack.push("root3");
		stack.push("root4");
		stack.push("root5");
		System.out.println(stack);
		//top(마지막)
		System.out.println(stack.peek());
		System.out.println(stack);
		//pop(제거)
		System.out.println(stack.pop());
		System.out.println(stack);
		//search(검색)
		System.out.println(stack.search("root5"));
		System.out.println(stack.search("root1"));
		System.out.println(stack.search("root2"));
		System.out.println(stack.search("root3"));
		
		
		
	}

}
