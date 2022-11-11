package org.study.Controller;

import java.util.Scanner;

import org.study.Commend.DBDeleteDo;
import org.study.Commend.DBInsertDo;
import org.study.Commend.DBUpdateDo;
import org.study.Commend.DBselectDo;
import org.study.Commend.SQLQueryCommend;

public class DBController {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("쿼리문을 입력하세요");
		String query = input.next();
		
		while(true) {
			if(query.equals("insert")) {
				SQLQueryCommend q1 = new DBInsertDo();
				q1.excuteQueryCommend();		
			}else if(query.equals("delete")) {
				SQLQueryCommend q2 = new DBDeleteDo();
				q2.excuteQueryCommend();				
			}else if(query.equals("select")) {
				SQLQueryCommend q3 = new DBselectDo();
				q3.excuteQueryCommend();				
			}else if(query.equals("update")) {
				SQLQueryCommend q4 = new DBUpdateDo();
				q4.excuteQueryCommend();				
			}else {
				System.out.println("입력오류. 재실행 해주세요.");
			}break;
		}
			
		input.close();
		
	}

}
