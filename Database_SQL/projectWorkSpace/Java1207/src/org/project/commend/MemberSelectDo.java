package org.project.commend;

import java.util.List;
import org.project.dao.MemberDao;
import org.project.dto.Member1207;

//class A{
//	int a() {
//		return 1;
//	}
//	String b() {
//		return "dd";
//	}
//}

public class MemberSelectDo implements MemberCommend {

	
	@Override
	public void excuteQueryCommend() {
		System.out.println("회원목록 조회");
		
		MemberDao dao = new MemberDao();
		
		List<Member1207> users=dao.SelectDo();
		
		if(users!=null) {
			
			for(Member1207 user:users) {
				System.out.print(user.getUserId()+" ");
				System.out.print(user.getUserPw()+" ");
				System.out.print(user.getAge()+" ");
				System.out.println(user.getEmail());
				
			}			
			
		}else {
			System.out.println("회원조회 Fail!!");
		}
		
//		A a=new A();
//		int a1=a.a();
//		String s=a.b();
		
	}

}
