package com.javaex.practice;

public class Ex09 {

	/*
	 다음과 같이 출력하세요 
	 */
	
	public static void main(String[] args) {
		
		for(int x=0;x<=9;x++) {
			for(int y=1;y<=10;y++) {
				if(y+x<=9) {
				System.out.print(y+x+"   ");
				}
				else {
				System.out.print(y+x+"  ");
				}
				
			}
			System.out.println();
		}

	}

}
