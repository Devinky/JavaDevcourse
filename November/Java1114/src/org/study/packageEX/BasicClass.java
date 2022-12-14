package org.study.packageEX;

import java.util.*;

public class BasicClass {
	
	public static void main(String[] args) {
		
		//java.lang에 있는 패키지들(기본)
		Object o = null; //자바의 최상위 클래스로, 모든 클래스의 슈퍼클래스
		System s = null; //표준입출력(키보드, 모니터) JVM종료
		Class c = null; //JDBC드라이버 찾기(클래스를 메모리로드)
		String str = null; //문자열저장(수정할 수 없음)
		StringBuffer b = null; //문자열저장(수정 가능)
		Math m = null; //Math
		Integer i = null; //Wrapper클래스(8가지)
		
		//java.util에 있는 패키지들(유용) - 컬렉션클래스
		String[] ab = {"a","b","c"};
		Arrays.asList(ab); //배열을 조작(비교, 정렬, 찾기)
		Calendar c1 = null; //운영체제 시간
		Date d = null; //날짜와 시간
		StringTokenizer s2 = null; //특정 문자열 기준으로 문자열 추출
		Random r = null; //난수 추출(0 <= x <1)
	}
}
