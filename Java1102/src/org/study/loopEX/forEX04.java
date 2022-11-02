package org.study.loopEX;

public class forEX04 {
	public static void main(String[] args) {
		
		System.out.println("for문 예제2");
		//HTML/CSS 웹 구성시 사용되는 for문 맛보기
		
		String div = "<div>\n <ul>\n";
		
		for(int i=0;i<10;i++) {
			div += "	<li><img src='img/bg_" + i + ".jpg'></li>\n";
		}
		
		div += "	</ul>\n</div>";
		
		System.out.println(div);
	}
	
}
