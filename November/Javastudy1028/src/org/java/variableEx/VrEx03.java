package org.java.variableEx;

public class VrEx03 {
	public static void main(String[] args) {
		System.out.println("변수이름 규칙");
		
		//int int; 키워드(예약어)를 사용할 수 없다
		//int 1var; 숫자로 시작할 수 없다
		//int m var; 공백을 사용할 수 없다
		int _var1 = 10;
		int $var2 = 20; //_, $이외의 특수문자 사용 불가
		
		int Var1 = 10;
		int var1 = 20; //대소문자를 구분함
		System.out.println(Var1==var1);
		
		int avar = 19; //웬만하면 소문자로 시작하기
		int varNumber = 40; //다른 단어가 시작되면 대문자로 구분하기
		
		int 변수 = 100;
		System.out.println(변수); //오류는 안 나지만 웬만하면 영어로 지어주기
		System.out.println(_var1 + $var2 + avar + varNumber);
	}

}
