package com.kh.operator;

import java.util.Scanner;

public class D_Logical {
	public void method1() {
		// 입력한 정수 값이 1~100 사이의 숫자인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하세요 :");
		
		
		int a = sc.nextInt();
		
		System.out.println("입력한 정수 값이 1~100 사이의 숫자인가? : "+ (a>=1 && a<=100) );
	}
	public void method2() {
		// 입력한 문자 값이 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 :");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		//int i = (int) ch;
		//System.out.print("입력한 문자 값이 대문자인가요? :" + (i>=65 && i<=90));
		
		
		boolean bool = (ch >= 'A' && ch <= 'Z');
		System.out.println("입력한 문자 값이 대문자인가요? :" + bool);
		
		
		
		System.out.print("계속 하시려면 Y 또는 y를 입력하세요 : ");
		String str1 = sc.nextLine();
		char ch1 = str1.charAt(0);
		boolean bool1 = (ch1 == 'Y' || ch1 =='y');
		System.out.println("계속 하겠다고 하셨습니까? : " + bool1);
		
		
	}

	
	
	
	
}
