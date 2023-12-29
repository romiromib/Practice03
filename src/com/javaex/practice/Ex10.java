package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	/*
	 정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("숫자를 입력하세요");
		
		 /*System.out.print("숫자: ");
		 int n1 = sc.nextInt();
		 System.out.print("숫자: ");
		 int n2 = sc.nextInt();
		 System.out.print("숫자: ");
		 int n3 = sc.nextInt();
		 System.out.print("숫자: ");
		 int n4 = sc.nextInt();
		 System.out.print("숫자: ");
		 int n5 = sc.nextInt();
		 */
		 int k;
		 
		 for(int i=1; i<=5 ; i++) {
			 System.out.print("숫자: ");
			 int n = sc.nextInt();
			 n++;
			 if(n>n++) {
			 k = n;
			 }
			 else {
			 k = n++;		 
			 }
			 System.out.print(k);
		 }
	
		
		
		sc.close();

	}

}
