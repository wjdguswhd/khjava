package com.kh.variable;

public class C_Cast {// 기능 클래스
	
	//자동 형변환
	public void cast1() {//기능 메서드 정의
		byte bNum = 3;
		int iNum = bNum;
		
		long lNum = 100000000000L;
		float fNum = lNum;
		
		int num = 'A';
		char ch = 97;
		System.out.println("num : " + num);
		System.out.println("ch : " + ch);
		
		//char ch2 = num ; // 에러발생 : num이 4byte라는 크기 자체를 갖고있기 때문에 char안에 들어갈수없음
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2);
		
		//char ch3 = -13;
		int num1 = -10;
		char ch3 = (char)num1;
		System.out.println("ch3 : " + ch3);

	}
	
	public void cast2() {
		int iNum = 10;
		long lNum = 100L;
		
		
		int result1 = iNum + (int)lNum;
		
		long result2 = iNum + lNum;
		
		int result3 = (int)(iNum + lNum);
			
	}

}