package com.kh.operator;

import java.util.Scanner;


public class F_Triple {
	public void method() {
		//입력한 정수가 홀수인지 짝수인지 판별
		
		//홀수이면 "홀수입니다", 짝수이면 "짝수입니다", 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String a = "짝수입니다";
		String b = "홀수입니다";
		String result = num % 2 ==0 ? a : b;
		System.out.println(num + "은(는)" + result);
		
	}
	
	public void method2() {
		//입력한 정수가 양수인지 아닌지 판별
	    //양수면 "양수다", 양수가 아니면 양수가 아니다" 문장 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();	
		String result = num > 0 ? "양수입니다" : "양수가 아닙니다";
		System.out.println(num + "은(는)" + result);
		
		String result2 = num == 0 ? "0 입니다": (num > 0 ? "양수입니다" : "음수입니다");
		System.out.println(num + "은(는)" + result2);
		
		
	}

}
