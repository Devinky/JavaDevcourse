package org.study.loopEX;

public class test01 {
	public static void main(String[] args) {
		int i = 3;
		do{
		    int j = 0;
		    do{
		        j++;
		        System.out.println( i + "*" + j + "=" + (i*j));
		    }while(j<9);
		    i++;
		}while(i<=8);
		
	}

}
