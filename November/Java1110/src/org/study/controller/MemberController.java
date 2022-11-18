package org.study.controller;

import java.util.Scanner;

import org.study.commend.DBQueryCommend;
import org.study.commend.MemberDeleteCommend;
import org.study.commend.MemberInsertCommend;
import org.study.commend.MemberSelectCommend;
import org.study.commend.MemberUpdateCommend;

public class MemberController {
	
	public static void main(String[] args) {
		//Scanner, while
		//query가 insert면 콘솔에 "회원가입 Commend"
		//query가 delete면 콘솔에 "회원탈퇴 Delete"
		//query가 update면 콘솔에 "회원수정 Update"
		//query가 select면 콘솔에 "회원조회 Select"
		//query가 exit면 콘솔에 "종료합니다"
		//query가 나머지면 콘솔에 "입력쿼리 오류"
		
		//다형성 이용해서 DBQueryCommend(부모타입)의 참조 변수를 이용
		//상속을 통해 excuteQueryCommend() 오버라이드
		//서브(자식)클래스 객체를 이용해 구현하기
		
		DBQueryCommend action = null;
		String query ="";
		
		System.out.println("쿼리문을 입력하세요");
		
		Scanner input = new Scanner(System.in);
		query = input.next();
		
		while(true) {
			if(query.equals("exit")) {
				System.out.println("종료합니다");
				break;
			}else if(query.equals("insert")) {
				action = new MemberInsertCommend();
				action.excuteQueryCommend();
			}else if(query.equals("delete")) {
				action = new MemberDeleteCommend();
				action.excuteQueryCommend();
			}else if(query.equals("update")) {
				action = new MemberUpdateCommend();
				action.excuteQueryCommend();
			}else if(query.equals("select")) {
				action = new MemberSelectCommend();
				action.excuteQueryCommend();
			}else {
				System.out.println("입력 쿼리 오류. 프로그램을 종료합니다.");
				break;
			}break;
		}
		input.close();
	}

}
