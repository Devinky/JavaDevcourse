package org.study.controller;

import java.util.Scanner;

import org.study.commend.ExcuteCommend;
import org.study.commend.MemberDeleteDo;
import org.study.commend.MemberInsertDo;
import org.study.commend.MemberSelectDo;
import org.study.commend.MemberUpdateDo;

public class MemberController {
	
	public static void main(String[] args) {
		
		System.out.println("CRUD");
		
		Scanner input = new Scanner(System.in);
		String query = "";
		
		ExcuteCommend commend = null;;
		
		while(true) {
			System.out.print("\n쿼리문 입력 : ");
			query = input.next();
			if(query.equals("insert")) {
				commend = new MemberInsertDo();
				commend.excuteCommend();
			}else if(query.equals("select")) {
				commend = new MemberSelectDo();
				commend.excuteCommend();
			}else if(query.equals("update")) {
				commend = new MemberUpdateDo();
				commend.excuteCommend();
			}else if(query.equals("delete")) {
				commend = new MemberDeleteDo();
				commend.excuteCommend();
			}else if(query.equals("exit")){
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("입력 오류. 다시 입력하세요.");
			}
			
		}
		
	}

}
