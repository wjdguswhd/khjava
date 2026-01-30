package com.kh.variable;

public class A_Variable { // 기능 클래스
	
	public void declareVariable() { //기능 메서드 정의
		//변수 선언 후 초기화
		//1.논리형
		boolean isTrue;
		
		//2.숫자형
		//2-1. 정수형
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		
		//2-2. 실수형
		float fNum;
		double dNum;
		
		//3. 문자형
		//3-1. 문자
		char ch;
		//3-2. 문자열
		String str;
		
		isTrue = true;
		bNum = 100;
		sNum = -17;
		iNum = 0;
		lNum = 1234567890L;
		fNum = 3.14f;
		dNum = 3.14;
		ch = '가';
		str = "가나";
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 :" + str);
		
	}
	
	public void initVariable() {
		//변수 선언과 동시에 초기화
		//1. 논리형
		boolean on = true;
		
		//2. 숫자형
		//2-1. 정수형
		byte tw = 1;
		short th = 2;
		int fo = 3;
		long fi = 4L;
		
		//2-2. 실수형
		float si = 3.14f;
		double se = 3.14d;
		
		//3. 문자형
		//3-1. 문자
		char ei = 'A';
		//3-2. 문자열
		String ni = "커피";
		
		System.out.println("on의 값 : " + on);
		System.out.println("tw의 값 : " + tw);
		System.out.println("th의 값 : " + th);
		System.out.println("fo의 값 : " + fo);
		System.out.println("fi의 값 : " + fi);
		System.out.println("si의 값 : " + si);
		System.out.println("se의 값 : " + se);
		System.out.println("ei의 값 : " + ei);
		System.out.println("ni의 값 : " + ni);
		
	}
	
	
}
