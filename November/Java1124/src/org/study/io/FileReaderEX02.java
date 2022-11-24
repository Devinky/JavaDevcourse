package org.study.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEX02 {
	
	public static void main(String[] args) {
		
		System.out.println("FileReader2");
		
//		String fileName = "E:\\ioex\\test2.txt";
//		File file2 = new File(fileName);
		
		FileReader fReader2 = null;
		
		try {
			fReader2 = new FileReader("E:\\ioex\\test2.txt");
			int inData = 0;
			while((inData=fReader2.read())!=-1) {
				System.out.print((char)inData);
			}
		} catch (FileNotFoundException e) { 
			System.out.println("파일 X");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("IO X");
			e.printStackTrace();
		}finally {
			try {
				fReader2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
