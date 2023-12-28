package com.javaex.practice;

public class Ex08 {

	/*
	 아래와 같이 구구단을 출력하세요
	 */
	
	public static void main(String[] args) {
		
		for(int i = 1; i<=9; i++) {
			for(int dan=2; dan<=9; dan++) {
				if(dan*i<10) {
				System.out.print(dan+"*"+i+"="+" "+dan*i+"   ");
				}
				else {
					System.out.print(dan+"*"+i+"="+dan*i+"   ");
				}

			}
			System.out.println();
		}

	}

}
