package org.study.DBMemberCommend;

public class MemberJoinCommend {
	
	//생성자 오버로딩
	public MemberJoinCommend() {
		System.out.println("기본생성자");
	}

	public MemberJoinCommend(String title) {
		System.out.println(title);
	}
	
	public void join() {
		System.out.println("회원가입");
	}

}
