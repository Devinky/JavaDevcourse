package org.study.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEX03 {

	public static void main(String[] args) {

		Vector<String> v0 = new Vector<String>();
		v0.add(new String("user1"));
		v0.add(new String("user2"));
		v0.add(new String("user3"));
		v0.add(new String("user4"));
		v0.add(new String("user5"));
		
		Iterator<String> iter = v0.iterator();
		while(iter.hasNext()) {
			String el = iter.next();
			System.out.println(el + " ");
		}
		System.out.println();
		
		Vector<MemberDto> users = new Vector<MemberDto>(); //벡터는 객체를 담을 수 있다
		
		users.add(new MemberDto("m1","1111","s1",10)); //get(0)
		users.add(new MemberDto("m2","2222","s2",20)); //get(1)
		users.add(new MemberDto("m3","3333","s3",30)); //get(2)
		users.add(new MemberDto("m4","4444","s4",40)); //get(3)
		users.add(new MemberDto("m5","5555","s5",50)); //get(4)
		
		System.out.println("for문");
		//for문으로 출력하기
		for(int i=0; i<users.size(); i++) {
			System.out.print("아이디 : " + users.get(i).getUserId()+" ");
			System.out.print("비밀번호 : " + users.get(i).getUserPw()+" ");
			System.out.print("이름 : " + users.get(i).getUserName()+" ");
			System.out.println("나이 : " + users.get(i).getAge());
		}
		
		System.out.println("foreach문");		
		//foreach문
		for(MemberDto user: users) {
			System.out.print("아이디 : " + user.getUserId() + " ");
			System.out.print("비밀번호 : " + user.getUserPw() + " ");
			System.out.print("이름 : " + user.getUserName()+ " ");
			System.out.println("나이 : " + user.getAge());
		}
		
		System.out.println("Iterator");		
		//Iterator문
		Iterator<MemberDto> iter1 = users.iterator();
		
		while(iter1.hasNext()) {
			MemberDto users1 = iter1.next();
			System.out.print("아이디 : " + users1.getUserId()+" ");
			System.out.print("비밀번호 : " + users1.getUserPw()+" ");
			System.out.print("이름 : " + users1.getUserName()+" ");
			System.out.println("나이 : " + users1.getAge());
		}
	}

}
