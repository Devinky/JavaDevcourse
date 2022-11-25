package org.study.io;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedOutputStreamEx {
	
	public static void main(String[] args) {
		
		System.out.println("BufferOutputStream");
		
//		Scanner input = new Scanner(System.in);
//		String userId = input.next(); //버퍼에 저장됨(임시저장소)
//		
//		System.out.println(userId);
		
		FileOutputStream fos = null;
		String fileurl = "E:\\ioex2\\123.txt";
		
		try {
			fos = new FileOutputStream(fileurl);
			//BufferedOutputStream의 버퍼 크기를 5로 한다
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			//파일에 1부터 8까지 출력한다
			for(int i='1';i<'9';i++) {
				bos.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//123.txt를 읽어서 콘솔에 출력
		FileInputStream fIn = null;
		InputStreamReader inReader = null;
		
		int inData  = 0;
		try {
			fIn = new FileInputStream(fileurl);
			inReader = new InputStreamReader(fIn, "UTF-8");
			
			while((inData=inReader.read())!= -1) {
				System.out.print((char)inData);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
