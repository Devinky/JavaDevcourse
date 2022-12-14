package org.project.commend;

import java.util.Scanner;
import org.project.dao.Dao;

public class LoginOkDo implements ExecuteCommend {

	@Override
	public void executeQueryCommend() {
		System.out.println("로그인");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String userId = input.next();
		
		System.out.print("비밀번호 : ");
		String userPw = input.next();
		
		Dao dao = Dao.getInstance();
		
		int result = dao.loginOkDo(userId, userPw); //이게 래퍼클래스 때문에 가능하다함
		//래퍼클래스 복습하기
		
		if(result!=1) {
			System.out.println("로그인 실패. 아이디와 비밀번호를 확인해주세요.");
		}else {
			System.out.println("로그인 성공. 환영합니다.");
		}
	}

}
