package org.study.selftest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class IoSelfTest {
	
	public static void main(String[] args) {
		
		FileInputStream n1 = null;
		InputStreamReader i1 = null;
		
		String fileurl = "E:\\ioex2\\Quiz.txt";
		
		try {
			n1 = new FileInputStream(fileurl);
			i1 = new InputStreamReader(n1, "UTF-8");
			
			int data1 = 0;
			while((data1=i1.read())!= -1) {
				System.out.print((char)data1);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				n1.close();
				i1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
