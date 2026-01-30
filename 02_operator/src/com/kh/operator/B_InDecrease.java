package com.kh.operator;

public class B_InDecrease {
	public void method1() {
		int num1 = 10;
		System.out.println("전위 증감 연산자 적용 전 : " + num1);//10
		System.out.println("++num1 1회 수행 후 : " + ++num1);//11
		System.out.println("++num1 2회 수행 후 : " + ++num1);//12
		System.out.println("++num1 3회 수행 후 : " + ++num1);//13
		System.out.println("++num1 4회 수행 후 : " + ++num1);//14
		System.out.println("++num1 5회 수행 후 : " + ++num1);//15
		System.out.println("전위 증감 연산자 적용 후 : " + num1);
		
		int num2 = 10;
		System.out.println("후위 증감 연산자 적용 전 : " + num2);
		System.out.println("num1 ++ 1회 수행 후 : " + ++num2);
		System.out.println("num1 ++ 2회 수행 후 : " + ++num2);
		System.out.println("num1 ++ 회1 수행 후 : " + ++num2);
		System.out.println("num1 ++ 4회 수행 후 : " + ++num2);
		System.out.println("num1 ++ 5회 수행 오 : " + ++num2);
		System.out.println("후위 증감 연산자 적용 후 : " + num1);//15
		
		
	}
	public void method2() {
		int num1 = 20;
		int result1 = num1++ *3;
		System.out.println("result1 : " + result1);//60
		System.out.println("num1 : " + num1);//21
		
		
		int num2 = 20;
		int result2 = ++num2 *3;
		System.out.println("result2 : " + result2);//63
		System.out.println("num2 : " + num2);//21
		
	}
	
	

}
