package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
	public void method1() {
		//키보드로 입력한 숫자가 짝수인지 홀수인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 :");
		int a = sc.nextInt();
		
		//String result;
		//if(a%2==0) {
		//	result = "짝수입니다";
		//}
		//else {
		//	result = "홀수입니다";
		//}
		//System.out.println(result);
		if(a%2==0) {
			System.out.println("짝수입니다");
		}
		else {
			System.out.println("홀수입니다");
		}
	}
	
	public void method2() {
		//키보드로 입력한 숫자가 양수인지, 0인지 , 음수인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int a = sc.nextInt();
		
		if(a>0) {
			System.out.println("양수입니다");
		}
		else if(a<0) {
			System.out.println("음수입니다");
		}
		else {
			System.out.println("0입니다");
		}
		
//		String result; //변수 선언(공간만 만들었다)
//		if(num>0) {
//			result = "양수";
//		}
//		else if(num==0) {
//			result = "0";
//		}
//		else if(num<0){
//			result = "음수");
//		}
//		System.out.println(num + "숫자는" + result +"입니다");	
		
//		result는 변수를 선언만 해놓음. 연산을 하려면 값에 대한 초기화가 필요한데 되어있지 않음.
//		구조적으로 봤을때 else문이 없는 상황에서 어디에도 포함되지 않는 수를		
//		else는 나머지에 대한걸 처리해주는데 마지막에 else if(~) 처리를 못해 빨간줄이 뜸.
		
		}
	
	public void method3() {
		//키보드로 성별(M/F)을 입력 받아 남자면 "XY"입니다, 여자면 "XX"입니다. 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하시오 :");
		
		char ch = sc.nextLine().charAt(0);
		
		String dna;
		switch(ch) {
		case 'M':case 'm':
			dna="XY";
			break;
		case'F':case 'f':
			dna="XX";
			break;
		default :
			dna = "잘못된 입력";
		}
		System.out.println(dna + "입니다");
	}
		//	if(ch=='M' || ch=='m') {
		//		dna="XY";
		//	}
		//	else if(ch=='F' || ch=='f') {
		//		dna="XX";
		//	}
		//	else {
		//		dna="잘못된 입력";
		//	}
	
	public void method4() {
		//사용자에게 나이를 입력받아 성인인지 청소년인지 어린이인지 출력
		//성인 : 19세 초과 / 청소년 : 13세 초과 19세이하 / 어린이 : 13세 이하
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하시오 :");
		int age = sc.nextInt();
		
		String an;
		if(age>19){
			an = "성인";
		}
		else if(age>13) {
			an = "청소년";
		}
		else if(age<0) {
			an = "잘못입력";
		}
		else {
			an = "어린이";
		}
		System.out.println(an + "입니다");
	}
	public void method5() {
		//사용자에게 이름을 받아 본인인지 확인
		//자신의 이름과 같으면 "본인입니다", 자신의 이름과 다르면 "본인이 아닙니다"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오 :");
		String name = sc.nextLine();
		
//		if(name=="정현종") { //문자열끼리의 비교는 ==으로 불가하다.
//			System.out.println("본인입니다");
//		}
//		else {
//			System.out.println("본인이 아닙니다");
//		}
		if(name.equals("정현종")) {  //반대는 !name.equals("정현종")
			System.out.println("본인입니다");
		}
		else {
			System.out.println("본인이 아닙니다");
		}
		
	}
}
		