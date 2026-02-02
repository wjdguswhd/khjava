package com.kh.practice1.func;

import java.util.Scanner;

public class OperatorPractice1 {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 :");
		int a = sc.nextInt();
		
		if(a>0) {
			System.out.println("양수다");
		}else {
			System.out.println("양수가 아니다");
		}
		
	
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 :");
		int a = sc.nextInt();
		
		if(a==0) {
			System.out.println("0이다");
		}else if(a>0){
			System.out.println("양수다");
		}else {
			System.out.println("음수다");
		}
	}
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력:");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("인원 수 입력:");
		int person = sc.nextInt();
		System.out.println("사탕 수 입력:");
		int candy = sc.nextInt();
		
		System.out.println("");
		
		//사탕/인원
		System.out.println("인당 가질수있는 사탕수: "+ candy/person);
		//사탕%인원
		System.out.println("남은 사탕수: "+ candy%person);
		
	}
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("학년(숫자만):");
		int hak = sc.nextInt();
		System.out.print("반(숫자만):");
		int ban = sc.nextInt();
		System.out.print("번호(숫자만):");
		int bun = sc.nextInt();
		System.out.print("성별(M/F):");
		char ch = sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지):");
		float rank = sc.nextFloat();
		
		String sung = ch =='M'?"남학생":"여학생";
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",
				hak,ban,bun,name,sung,rank);		
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 :");
		int age = sc.nextInt();
		
		if(age>19) {
			System.out.println("성인");
		}else if(age>13) {
			System.out.println("청소년");
		}else if(age<=13) {
			System.out.println("어린이");
		}else {
			System.out.println("잘못입력");
		}
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 :");
		int kor = sc.nextInt();
		System.out.print("영어 :");
		int eng = sc.nextInt();
		System.out.print("수학 :");
		int mat = sc.nextInt();
		
	
		System.out.printf("합계 : %d\n",(kor+eng+mat));
		System.out.printf("평균 : %.1f\n",(float)((kor+eng+mat)/3));
		float evr = (float)(kor+eng+mat/3);
		if(kor>=40 && eng >=40 && mat>=40 && evr>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");

		}
		
	}
	
	
}
