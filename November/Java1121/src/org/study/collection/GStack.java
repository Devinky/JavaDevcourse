package org.study.collection;

//Generic Type 클래스 선언
public class GStack<T> {
	
	public int idx; //배열의 인덱스
	public Object[] oStack;
	
	public GStack() {
		idx = 0;
		oStack = new Object[10]; //Object 배열 10개 생성
	}
	
	//push메서드 만들기 -> idx -> 0~9번지까지 증가, 10번지가 되면 중지
	//매개변수로 입력 받은 인자를 oStack배열에 추가
	public void push(T elements) {
		if(idx==10) {
			return; //10번지가 되면 중지
		}
		oStack[idx] = elements; //매개변수 입력 받은 인자를 oStack배열에 추가(10개)
		idx++; //0~9번지까지 증가
	}
	
	//pop메서드 -> 베열 oStack 마지막번지부터 첫번째번지까지 값을 출력
	//0번지가 되면 중지
	public T pop() {
		if(idx==0) {
			return null;
		}
		idx--; //10 -> 9번지부터 출력
		return (T) oStack[idx];
	}

}
