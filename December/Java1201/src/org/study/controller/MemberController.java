package org.study.controller;

import java.util.Scanner;

import org.study.commend.ExcuteCommend;
import org.study.commend.MemberDelete;
import org.study.commend.MemberInsert;
import org.study.commend.MemberSelect;
import org.study.commend.MemberUpdate;

public class MemberController {
	
	public static void main(String[] args) {
		
		System.out.println("CRUD");
		
		Scanner input = new Scanner(System.in);
		String query = "";
		
		ExcuteCommend commend = null;
		
		while(true) {
			System.out.print("쿼리문을 입력하세요 : ");
			query = input.next();
			
			if(query.equals("insert")) {
				commend = new MemberInsert();
				commend.excuteQueryCommend();
			}else if(query.equals("select")) {
				commend = new MemberSelect();
				commend.excuteQueryCommend();
			}else if(query.equals("update")) {
				commend = new MemberUpdate();
				commend.excuteQueryCommend();
			}else if(query.equals("delete")) {
				commend =  new MemberDelete();
				commend.excuteQueryCommend();
			}else if(query.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("입력 오류");
			}
		}
		
	}

}
