package org.study.collection;

class Gen1{
	//인스턴스 멤버
	private int num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}

class Gen2{
	private String num;
	public void setNum(String num) {
		this.num = num;
	}
	public String getNum() {
		return num;
	}
}

class Gen3<T>{
	private T num;
	
	public void setNum(T num) {
		this.num = num;
	}
	public T getNum() {
		return num;
	}
}

public class GenericEX02 {
	
	public static void main(String[] args) {
		//실행클래스
		Gen1 g1 = new Gen1();
		
		g1.setNum(29);
		g1.getNum();
		
		Gen2 g2 = new Gen2();
		g2.setNum("정수형같지? 문자열이지롱");
		g2.getNum();
		
		Gen3<Integer> g3 = new Gen3<Integer>();
		Integer i = 31;
		
//		g3.setNum(new Integer(31)); ->박싱
//		g3.setNum(i); ->박싱
		g3.setNum(31); //자동박싱
		g3.getNum();
		
		Gen3<String> g4 = new Gen3<String>();
		g4.setNum("제네릭으로 선언한 문자열이다");
		g4.getNum();
		
		//기본타입X -> Wrapper클래스 적용(박싱, 언박싱)
		Gen3<Float> g5 = new Gen3<Float>();
		Gen3<Long> g6 = new Gen3<Long>();
		Gen3<Byte> g7 = new Gen3<Byte>();
		Gen3<Short> g8 = new Gen3<Short>();
		Gen3<Double> g9 = new Gen3<Double>();
		Gen3<Character> g10 = new Gen3<Character>();
		Gen3<Boolean> g11 = new Gen3<Boolean>();
		
		//타입비교(타입이 맞는지 알아보는 instanceof)
		if(g3.getNum() instanceof Integer) {
			System.out.println("Integer");
		}
		if(g4.getNum() instanceof String) {
			System.out.println("String");
		}
		
		//object는 모든 클래스의 슈퍼클래스, 부모클래스를 참조해 자식클래스를 정의하는 것 : 다형성
		Object ob1 = new Integer(10);
		Object ob2 = new Float(10.0f);
		Object ob3 = new String("10");
		//Object는 뭐든 담을 수 있음									↓자동박싱
		Object[] arrObj1 = {new Integer(10), new Integer(20), 30, 40};
		Object[] arrObj2 = {new String("문자열1"), new String("문자열2")};
	}
	
}
