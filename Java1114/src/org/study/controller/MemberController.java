package org.study.controller;

import java.util.Scanner;

import org.study.commend.CRUDCommend;
import org.study.commend.DBDeleteCommend;
import org.study.commend.DBInsertCommend;
import org.study.commend.DBSelectCommend;
import org.study.commend.DBUpdateCommend;

public class MemberController {

	public static void main(String[] args) {

		CRUDCommend commend = null;

		Scanner input = new Scanner(System.in);

		// boolean을 사용해서 while문 써보기
		boolean bool = true;
		while (bool) {

			System.out.println("입력해!");
			String query = input.next();

			if (query.equals("insert")) {
				commend = new DBInsertCommend();
				commend.excuteCommend();
			} else if (query.equals("select")) {
				commend = new DBSelectCommend();
				commend.excuteCommend();
			} else if (query.equals("update")) {
				commend = new DBUpdateCommend();
				commend.excuteCommend();
			} else if (query.equals("delete")) {
				commend = new DBDeleteCommend();
				commend.excuteCommend();
			} else if (query.equals("exit")) {
				System.out.println("종료함");
				bool = false;
				// break;
			} else {
				System.out.println("뭐라는거야!");
			}bool = false;
			input.close();
		}

	}

}
