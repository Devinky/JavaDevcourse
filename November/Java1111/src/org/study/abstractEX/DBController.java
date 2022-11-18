package org.study.abstractEX;

import java.util.Scanner;

public class DBController {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("쿼리문 입력");
		String query = input.next();
		
		while(true) {
			if(query.equals("insert")) {
				SQLQueryCommend action = new DBInsertDo();
				action.excuteQueryCommend();
			}else if(query.equals("delete")) {
				SQLQueryCommend action = new DBDeleteDo();
				action.excuteQueryCommend();
			}else if(query.equals("update")) {
				SQLQueryCommend action = new DBUpdateDo();
				action.excuteQueryCommend();
			}else if(query.equals("select")) {
				SQLQueryCommend action = new DBSelectDo();
				action.excuteQueryCommend();
			}else {
				System.out.println("입력 오류. 재실행해주세요.");
				break;
			}break;
		}
		input.close();
		
		//부모타입(클래스라 하지 말고 타입이라 말해보기) 객체 참조 변수 -> 다형성 이용
		//다형성이 뭐? 부모타입의 객체 참조 변수로 자식타입을 불러오는 것이었나...
//		SQLQueryCommend insert = new DBInsertDo();
//		insert.excuteQueryCommend();
//		
//		SQLQueryCommend delete = new DBDeleteDo();
//		delete.excuteQueryCommend();
//		
//		SQLQueryCommend update = new DBUpdateDo();
//		update.excuteQueryCommend();
//		
//		SQLQueryCommend select = new DBSelectDo();
//		select.excuteQueryCommend();
		
	}

}
