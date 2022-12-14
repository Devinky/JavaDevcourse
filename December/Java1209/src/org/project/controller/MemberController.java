package org.project.controller;

import java.util.Scanner;

import org.project.commend.BoardSelect;
import org.project.commend.BoardWrite;
import org.project.commend.BoardWriteFKCommend;
import org.project.commend.MemberCommend;
import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberSerchIdDo;
import org.project.commend.MemberSort;
import org.project.commend.MemberSort2;
import org.project.commend.MemberUpdateDo;

public class MemberController {
	
	public static void main(String[] args) {
		
		MemberCommend commend = null;
		
		while(true) {
			Scanner input =  new Scanner(System.in);
			System.out.print("\n무엇을 실행할까요? ");
			String query = input.next();
			if(query.equals("insert")) {
				commend = new MemberInsertDo();
				commend.excuteQueryCommend();
			}else if(query.equals("select")){
				commend = new MemberSelectDo();
				commend.excuteQueryCommend();
			}else if(query.equals("update")) {
				commend = new MemberUpdateDo();
				commend.excuteQueryCommend();
			}else if(query.equals("delete")) {
				commend = new MemberDeleteDo();
				commend.excuteQueryCommend();
			}else if(query.equals("searchId")) {
				commend = new MemberSerchIdDo();
				commend.excuteQueryCommend();
			}else if(query.equals("sort")) {
				commend = new MemberSort();
				commend.excuteQueryCommend();
			}else if(query.equals("sort2")) {
				commend = new MemberSort2();
				commend.excuteQueryCommend();
			}else if(query.equals("boardWrite")) {
				commend = new BoardWrite();
				commend.excuteQueryCommend();
			}else if(query.equals("boardWrite2")) {
				commend = new BoardWriteFKCommend();
				commend.excuteQueryCommend();
			}else if(query.equals("boardSelect")) {
				commend = new BoardSelect();
				commend.excuteQueryCommend();
			}else if(query.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("입력 오류. 다시 입력해주세요.");
			}
		}
		
	}
	
}
