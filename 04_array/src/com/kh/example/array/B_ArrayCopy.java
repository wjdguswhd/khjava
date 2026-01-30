package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	public void method1() {
		//얕은복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = originArr; //얕은 복사
		
		System.out.println("originArr :" + originArr);
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		
		}
		System.out.println();
		
		System.out.println("copyArr :" + copyArr);
		for(int i=0; i<copyArr.length;i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		System.out.println("--------------");
		
		originArr[0] = 99;
		
		System.out.println("originArr :" + originArr);
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		
		}
		System.out.println();
		
		System.out.println("copyArr :" + copyArr);
		for(int i=0; i<copyArr.length;i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
	}
	
	public void method2() {
		//for문을 이용한 깊은 복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[originArr.length];
		
		for(int i=0; i < originArr.length;i++) {
			copyArr[i] = originArr[i];
	
		}
	
		
		System.out.println("originArr :" + originArr);
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		
		}
		System.out.println();
		
		System.out.println("copyArr :" + copyArr);
		for(int i=0; i<copyArr.length;i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		System.out.println("------------------");
		
		originArr[0] =99;
		copyArr[4]=-1;
		
		System.out.println("originArr :" + originArr);
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		
		}
		System.out.println();
		
		System.out.println("copyArr :" + copyArr);
		for(int i=0; i<copyArr.length;i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		System.out.println("------------------");
	}
	
	public void method3() {
		//arraycopy()를 이용한 깊은복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.out.println("originArr :" + originArr);
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		
		}
		System.out.println();
		
		System.out.println("copyArr :" + copyArr);
		for(int i=0; i<copyArr.length;i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		System.out.println("============================");
//인자랑 매개변수는 다르지만 엄격구분x	    인자 : 인자는 보내는것 (ex :System.out.println("제발");)
//				 반환타입			  매개변수: 매개변수는 받는것(제발이 인자, String x가 매개변수)
//		public void 자료형 method([자료형 변수명]생략o){
//		
//
//	}
//		System.arraycopy(src,srcPos,dest,destPost,length);
		//src	  :원본배열
		//srcPos  :원본 배열에서 복사를 시작할 위치
		//dest    :복사 배열
		//destPost:복사 배열에서 붙여넣기를 시작할 위치
		//length  :복사 길이
		
		//원본 배열의 0 index서부터 원본 배열의 길이만큼 복사 후, 복사 배열 3 index서부터 붙여넣기
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		System.out.println("originArr :" + originArr);
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		
		}
		System.out.println();
		
		System.out.println("copyArr :" + copyArr);
		for(int i=0; i<copyArr.length;i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
	}	
	public void method4() {
		//copyOf()를 이용한 깊은 복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10]; 
		
		System.out.println("originArr :" + originArr);
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		
		}
		System.out.println();
		
		System.out.println("copyArr :" + copyArr);
		for(int i=0; i<copyArr.length;i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		System.out.println("----------------");
		
		copyArr = Arrays.copyOf(originArr, originArr.length);
		
		System.out.println("originArr :" + originArr);
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		
		}
		System.out.println();
		
		System.out.println("copyArr :" + copyArr);
		for(int i=0; i<copyArr.length;i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();	
	}
	
	

	
		
}
