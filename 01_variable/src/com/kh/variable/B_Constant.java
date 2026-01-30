package com.kh.variable;

public class B_Constant {// 기능 클래스
	public void finalConstant() {//기능 메서드 정의
		int age = 20;
		final int AGE = 20; //상수
		
		age = 21;
		//AGE = 21;
		//상수는 한 번 값 기록 후 변경 불가능
	}
}
