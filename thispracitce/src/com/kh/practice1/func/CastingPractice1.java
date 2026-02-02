package com.kh.practice1.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void method1() {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("문자 : ");
	      String str = sc.next();
	      char ch = str.charAt(0);
	      int a = (int)ch;
	      
	      System.out.printf("%d",a);
   }
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력:");
		float a = sc.nextFloat();
		System.out.print("영어 점수 입력:");
		float b = sc.nextFloat();
		System.out.print("수학 점수 입력:");
		float c = sc.nextFloat();
		
		int total = (int)(a+b+c);
		int ave = (int)(a+b+c)/3;
		
		System.out.printf("국어점수:%.1f\n영어점수:%.1f\n수학점수:%.1f\n\n총점:%d\n평균:%d"
				,a,b,c,total,ave);
}
	
	public void method3() {
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum= 2.5;
		char ch = 'A';
		
		System.out.println( (iNum1/iNum2) ); // 2
		System.out.println( (int)dNum ); // 2
		
		System.out.println( iNum2 * dNum ); // 10.0
		System.out.println( (float)iNum1 ); // 10.0
		
		System.out.println( (float)iNum1/iNum2); // 2.5
		System.out.println( dNum ); // 2.5
		
		System.out.println( (int)fNum); // 3
		System.out.println( iNum1 / (int)fNum ); // 3
		
		System.out.println( iNum1/fNum );// 3.3333333
		System.out.println( iNum1/ (double)fNum ); // 3.3333333333333335
		
		System.out.println( ch); // 'A'
		System.out.println( (int)ch); // 65
		
		System.out.println( ch + iNum1 ); // 75
		System.out.println( (char)(ch + iNum1) ); // 'K'

   }
	
}
