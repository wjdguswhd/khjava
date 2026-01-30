package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.KindsOfVariable1;
import com.kh.example.chap04_field.controller.KindsOfVariable2;

public class Run {
	public static void main(String[]args) {
		KindsOfVariable1 kov1 = new KindsOfVariable1();
		kov1.method1(100);
		
		//KindsOfVaraiable2에 있는 staticNum에 int a1에 대입
		KindsOfVariable2 kov2 = new KindsOfVariable2();
		int a1 = kov2.staticNum;
		int a2 = KindsOfVariable2.staticNum;

	}
}
