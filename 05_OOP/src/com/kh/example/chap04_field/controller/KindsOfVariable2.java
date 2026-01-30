package com.kh.example.chap04_field.controller;

public class KindsOfVariable2 {
	
	//static변수 = 클래스 변수 : static이 붙은 변수
	public static int staticNum;
	
	//인스턴스 변수: static이 붙지않은 변수
	private int testNum=10;
	private static int staticTestNum = 10;
	
	
	public void test() {
		testNum++;
		System.out.println("testNum: "+ testNum);
		staticTestNum++;
		System.out.println("staticTestNum:"+staticTestNum);
	}
}

	