package com.kh.practice1.func;

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
			System.out.println("국어점수 :"+kor+"\n수학점수 :"+mat+"\n영어점수 :"+eng+
					"\n합계:"+sum+"\n평균:"+evr+"\n축하합니다. 합격입니다.");
		}else {
			System.out.println("국어점수:"+kor+"\n수학점수:"+mat+"\n영어점수:"+eng+"\n불합격입니다.");
		}

	}
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12사이의 정수 입력:");
		int a = sc.nextInt();
		
		switch(a){
		case 1:case 2:case 12: System.out.printf("%d는 겨울입니다",a);break;
		case 3:case 4:case 5: System.out.printf("%d는 봄입니다",a);break;
		case 6:case 7:case 8: System.out.printf("%d는 여름입니다",a);break;
		case 9:case 10:case 11: System.out.printf("%d는 가을입니다",a);break;
		default: System.out.printf("%d는 없는계절입니다",a);
		}
	}
	public void method5() {
		String id = "myId";
		String password = "myPassword12";
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디:");
		String str1 = sc.nextLine();
		System.out.print("비밀번호:");
		String str2 = sc.nextLine();

		if(str1.equals(id) && str2.equals(password)) {
			System.out.println("로그인 성공");
		}else if(str1.equals(id) ) {
			System.out.println("비밀번호가 틀렸습니다");
		}else if(str2.equals(password)) {
			System.out.println("아이디가 틀렸습니다");
		}else {
			System.out.println("다시입력");
		}

	}
	
	
}
