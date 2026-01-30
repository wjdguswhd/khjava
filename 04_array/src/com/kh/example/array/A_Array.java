package com.kh.example.array;

public class A_Array {
	public void method1() {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		int num6 = 60;
		int num7 = 70;
		int num8 = 80;
		int num9 = 90;
		
		int sum1 = 0;
		
		int[] arr = new int[9];
		for(int i=0;i<arr.length;i++) {
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
		System.out.println("====");
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		arr[5] = 60;
//		arr[6] = 70;
//		arr[7] = 80;
//		arr[8] = 90;
		//for문을 이용한 초기화
		
		for(int i=0; i<arr.length; i++) {//초기화
			arr[i] = (i+1)*10;
		}
		
		for(int i = 0; i<arr.length;i++) {//출력
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
		
		System.out.println("====");
		
		int sum2 = 0;
		for(int i=0; i<arr.length; i++) {
			sum2 += arr[i];
		}
		System.out.println(sum2);
		
		System.out.println("====");
		
		int[] arr2 = {100,200,300,400};
		System.out.println("arr의 길이:"+ arr2.length);
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"]:"+arr2[i]);
		}
	}
	public void method2() {
		//5개의 int만 저장하는 배열 iArr
		int[] iArr = new int[5];
		System.out.println("iArr :"+ iArr);
		iArr[0]=100;
		//10개의 char만 저장하는 배열 chArr
		char[] chArr = new char[10];
				
		//iArr에 들어있는 값 출력 : iArr[0] = 0
		for(int i=0; i<iArr.length; i++) {
			System.out.printf("iArr[%d] = %d\n",i,iArr[i]);
		}
				
		//chArr에 들어있는 값 출력: chArr[0] =	
		for(int i=0; i<chArr.length; i++) {
			System.out.printf("chArr[%d] = %c\n",i,chArr[i]);
		}
		
		System.out.println("-----------------");
		
		//배열은 크기변경불가
		iArr = new int[18];
		System.out.println("iArr :"+ iArr);
		for(int i=0; i<iArr.length; i++) {
			System.out.printf("iArr[%d] = %d\n",i,iArr[i]);
		}
//		int[] iArr = new int[5];
//		iArr[0]=100;
//		iArr = new int[18];
//
//		int[5] 의 int[0]에는 100이 들어가있지만 iArr = new int[18];일때
//		int의 크기가 18로 늘어난게 아니라 18개의공간이 있는 배열로 대체하고 그 공간을 iArr을 가리키는것이기 때문에
//		iArr[0]=100;이 int[18]에는 저장되는게 아님.
	}
	
}
