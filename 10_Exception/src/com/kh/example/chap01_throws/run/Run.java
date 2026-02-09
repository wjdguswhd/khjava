package com.kh.example.chap01_throws.run;

import com.kh.example.chap02_tryCatch.controller.TryCatchConroller;

public class Run {
	public static void main(String[] args) {
		//ThrowsController tc = new ThrowsController();
		//tc.method1();
		
		//System.out.println("정상적으로 종료됨...");
		
		TryCatchConroller tc = new TryCatchConroller();
		tc.method1();
	}
}
