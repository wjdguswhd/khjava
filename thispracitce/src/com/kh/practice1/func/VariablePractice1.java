package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요:");
		String str = sc.nextLine();
		System.out.print("성별을 입력하세요:");
		char ch = sc.nextLine().charAt(0);
		System.out.print("나이를 입력하세요:");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요:");
		float height = sc.nextFloat();
		
		System.out.printf("키 %f인 %d살 %c자 %s님 반갑습니다^^",height,age,ch,str);
		
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수");
		int a = sc.nextInt();
		System.out.print("두 번째 정수");
		int b = sc.nextInt();
		
		System.out.println("더하기 결과:"+ (a + b));
		System.out.println("빼기 결과 :" + (a - b));
		System.out.println("곱하기 결과:"+ (a * b));
		System.out.println("나누기 몫 결과:"+ (a / b));

	}
		public void method3() {
			Scanner sc = new Scanner(System.in);
			System.out.print("가로입력 :");
			float ga = sc.nextFloat();
			System.out.print("세로입력 :");
			float se = sc.nextFloat();
			
			float myeon,dul = 0;
			myeon = ga * se;
			dul = (ga + se) * 2;
			
			System.out.println("가로:"+ ga);
			System.out.println("세로:"+ se);
			System.out.println("면적:"+ myeon);
			System.out.println("둘레:"+ dul);

		}
		
		public void method4() {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("문자열을 입력하세요 :");
	    	String str = sc.nextLine();
	    	
	    	char ch1 = str.charAt(0);
	    	char ch2 = str.charAt(1);
	    	char ch3 = str.charAt(2);
	    	
	    	System.out.println("첫번째 문자 :" + ch1);
	    	System.out.println("두번째 문자 :" + ch2);
	    	System.out.println("세번째 문자 :" + ch3);
	    }
		
	}

