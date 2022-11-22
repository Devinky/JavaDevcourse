package org.study.controller;

import java.util.ArrayList;
import java.util.Iterator;

import org.study.dto.MemberDto;

public class MemberController {
	
	public static void main(String[] args) {
		
		//ArrayList 생성, 요소는 MemberDto
		
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		
		//list요소 5개 생성하고 MemberDto userId는 중복되면 안됨
		//for문, foreach문으로 콘솔에 출력하기
		
		lists.add(new MemberDto(1, "ik0001","1000","devinky1",20));
		lists.add(new MemberDto(2, "ik0002","2000","devinky2",25));
		lists.add(new MemberDto(3, "ik0003","3000","devinky3",30));
		lists.add(new MemberDto(4, "ik0004","4000","devinky4",35));
		lists.add(new MemberDto(5, "ik0005","5000","devinky5",40));
		
		//System.out.println(lists);
		
		for(int i=0;i<lists.size();i++) {
			System.out.println("UserNo." + lists.get(i).getNo() + " - " + "아이디 : " + lists.get(i).getUserId() + " | " 
					+ "비밀번호 : " + lists.get(i).getUserPw() + " | " + "이메일 : " + lists.get(i).getEmail() + " | " 
					+ "나이 : " + lists.get(i).getAge());
		}
		
		System.out.println("===================================================================");
		
		for(MemberDto list: lists) {
			System.out.println("UserNo." + list.getNo() + " - " + "아이디 : " + list.getUserId() + " | " 
					+ "비밀번호 : " + list.getUserPw() + " | " + "이메일 : " + list.getEmail()+ " | " 
					+ "나이 : " + list.getAge());
		}
		
//		Iterator<MemberDto> iter = lists.iterator();
//		while(iter.hasNext()) {
//			
//		}
	}

}
