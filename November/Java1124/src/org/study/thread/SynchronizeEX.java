package org.study.thread;

//1.공유 자원 Synchronize
class ShareStorage{
	//Thread공유 자원으로 선언됨
	synchronized void storagePrint(String str){ //외부에서 문자열 str 초기화 가능
//		System.out.println(str);
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println();
		}
	}
}

//2.Thread생성 -> 공유 자원 Synchronize 접근
class Thread4 extends Thread{
	
	private ShareStorage share;
	private String str;
	
	public Thread4(ShareStorage share, String str) {
		this.share = share;
		this.str = str;
	}

	@Override
	public void run() {
		share.storagePrint(str);
	}
}

public class SynchronizeEX {
	
	public static void main(String[] args) {
		//3.1,2 -> Thread 구현
		ShareStorage s1 = new ShareStorage();
		ShareStorage s2 = new ShareStorage();

		String str1 = "abcdefg";
		String str2 = "12345678910";

		Thread4 t1 = new Thread4(s1, str1);
		Thread4 t2 = new Thread4(s2, str2);
		
		t1.start();
		t2.start();
		
		
		
		
		
	}

}
