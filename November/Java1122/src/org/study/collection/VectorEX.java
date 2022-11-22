package org.study.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEX {
	
	public static void main(String[] args) {

		Vector<Integer> v0 = new Vector<Integer>();
		
//		Integer i1 = new Integer(10);
//		Integer i2 = new Integer(20);
//		Integer i3 = new Integer(30);
//		Integer i4 = new Integer(40);
//		Integer i5 = new Integer(50);
		
		v0.add(new Integer(10));
		v0.add(new Integer(20));
		v0.add(new Integer(30));
		v0.add(new Integer(40));
		v0.add(new Integer(50));
		
		for(Integer in: v0) {
			System.out.println(in);
		}
		
		System.out.println("======================================================");
		
		Vector<MemberDto> users = new Vector<MemberDto>();
		
//		MemberDto user1 = new MemberDto("m1111","1111","s11",11);
//		MemberDto user2 = new MemberDto("m2222","2111","s21",21);
//		MemberDto user3 = new MemberDto("m3333","3111","s31",31);
//		MemberDto user4 = new MemberDto("m4444","4111","s41",41);
//		MemberDto user5 = new MemberDto("m5555","5111","s51",51);
		
		users.add(new MemberDto("m111","1111","s11",11));
		users.add(new MemberDto("m222","2111","s21",21));
		users.add(new MemberDto("m333","3111","s31",31));
		users.add(new MemberDto("m444","4111","s41",41));
		users.add(new MemberDto("m555","5111","s51",51));
		
		System.out.println(users.get(0));
		System.out.print("아이디 : " + users.get(0).getUserId() + " ");
		System.out.print("비밀번호 : " + users.get(0).getUserPw() + " ");
		System.out.print("이름 : " + users.get(0).getUserName() + " ");
		System.out.println("나이 : " + users.get(0).getAge());
		
		for(MemberDto user: users) {
			System.out.println("아이디 : " + user.getUserId() + " " + "비밀번호 : " + user.getUserPw()
			+ " " + "이름 : " + user.getUserName() + " " + "나이 : " + user.getAge());
		}
		
		System.out.println("======================================================");
		System.out.println("Iterator문으로 출력하기");
		
		Iterator<MemberDto> iter = users.iterator();
		while(iter.hasNext()) {
			MemberDto user = iter.next();
			System.out.println("아이디 : " + user.getUserId() + " " + "비밀번호 : " + user.getUserPw()
			+ " " + "이름 : " + user.getUserName() + " " + "나이 : " + user.getAge());
		}
	}

}
