package com.kh.practice1.func.ControlPractice1;

import java.util.Scanner;

public class ControlPractice1 {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요:");
		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:System.out.println("입력메뉴입니다");break;
		case 2:System.out.println("수정메뉴입니다");break;
		case 3:System.out.println("조회메뉴입니다");break;
		case 4:System.out.println("삭제메뉴입니다");break;
		case 7:System.out.println("프로그램이 종료됩니다");break;
		
		}
			
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 한 개 입력하세요:");
		int a = sc.nextInt();
		
		if(a>0 && a%2==0) {
			System.out.println("짝수다");
		}else if(!(a%2==0) && a>0){
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수:");
		int kor = sc.nextInt();
		System.out.print("수학점수:");
		int mat = sc.nextInt();
		System.out.print("영어점수:");
		int eng = sc.nextInt();
		
		int sum = kor + mat + eng;
		double evr = (kor+mat+eng)/3;
		
		if(kor>=40 && mat>=40 && eng>=40 && evr>=60) {
			System.err.printf("국어:%");
		}else {
			System.out.println("불합격입니다.");
		}

	}
	
	
}
