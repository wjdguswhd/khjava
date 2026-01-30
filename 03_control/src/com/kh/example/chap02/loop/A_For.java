package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	public void method1() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
	
	public void method1_1() {
		//자기소개 5번하기
//		for(int i=1; i<=5;i++) {
//			System.out.println("내 이름은 정현종이야");
//		}
		for(int i=3; i<=7;i++) {
			System.out.println("내 이름은 정현종이야");
		}
	}
	
	public void method2() {
		//5부터 1까지 출력
//		for(int i=5;i>=1;i--) {
//			System.out.println(i);
//		}
		for(int i=1;i>=5;i--) {
			System.out.println(6-i);
		}
	}
	public void method2_1() {
		//8부터 3까지 출력
		for(int i=8; i>=3; i--) {
			System.out.println(i);
		}
	}
	
	public void method3() {
		//1에서 10사이의 홀수만 출력
//		for(int i=1;i<=10;i+=2) {
//		System.out.println(i);
//	 }
		for(int i=1;i<=10;i++) {
			if(i%2 !=0) {
				System.out.println(i);
			}
		 }
	}
	public void method4() {
		//정수 두 개를 입력 받아 그 사이 숫자 출력
		//첫번째 숫자3 , 두번째 숫자 6 :3 4 5 6
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요.");
		System.out.println("단, 첫 번째 숫자는 두 번째 숫자보다 작아야합니다.");
		System.out.print("첫 번째 숫자 :");
		int start = sc.nextInt();
		System.out.print("두 번째 숫자 :");
		int end = sc.nextInt();
		
		for(int i = start; i<=end; i++) {
			System.out.println(i);
		}
		System.out.println(start + "," + end);
		
		for(; start<=end; start++) {
			System.out.println(start);
		}
		System.out.println(start + "," + end);
		
		
		System.out.println("------");
		
		int min = 0;//둘 중 더 작은 값을 저장할 변수
		int max = 0;//둘 중 더 큰 값을 저장할 변수
		if(start < end) {
			min = start;
			max = end;
		}else {
			min = end;
			max = start;
		}
		for(int i = min; i<=max; i++) {
			System.out.println(i);
		}
	}
	
	public void method4_1() {
		//정수를 하나 입력받아 그 수가 1~9 사이의 수 일때만 그 수의 구구단 출력
		//조건이 맞지 않으면 "1~9 사이의 양수를 입력하여야 합니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단수 입력:");
		int dan = sc.nextInt();
		
		if(dan>=1 && dan <=9) {
			for(int i=1; i<=9;i++) {
				System.out.printf("%d * %d = %d\n", dan,i,(dan*i));
			}
		}else {
			System.out.println("1~9 사이의 양수를 입력하여야 합니다");
		}
	}
	public void method5() {
		//1부터 10 사이의 임의의 난수를 정해 1부터 난수까지의 정수합계
		//(0단계)  0 <= Math.random() < 1 : 실수
		//(1단계)  0 <= Math.random() * 10 < 10 : 0~9.9999999999...
		//(2단계)  1 <= Math.random() *10 + 1 < 11 : 1~10.999999999999
		//(3단계)  1 <= (int)(Math.randon() *10 +1) < 11 : 1~10
		
		//2단계와 3단계는 바뀌어도 상관없음
		
		//(int)(Math.randon() *10 +1) => 0
		//(int)Math.randon() *10 +1 => X, int 강제 형변환이 Math.radndom()만들어감
		//Math.random() 0~0.9999 => int로 강제 형변환 시 무조건 0
		
		//System.out.println(Math.random());
		int random = (int)(Math.random()*10 + 1);
//		System.out.println(random);
		int sum = 0;
		for(int i =1; i<=random; i++) {
			sum += i;
		}
		System.out.println("1부터"+ random +"까지의 정수 합계:"+sum);
	}
	public void method6() {
		//구구단
		for(int i=2;i<=9;i++) {
			System.out.println("=="+ i + "단==");
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d\n", i,j,(i*j));
			}
			System.out.println();
		}
	}
	public void method7() {
		//0시0분 ~ 23시 59분 출력
		for(int i=0; i<=23; i++) {
			for(int j=0;j<=59;j++) {
				System.out.printf("%2d시 %2d분\n", i,j);
			}
		}
	}
	public void method8() {
		//한 줄에 별 표(*)가 출력되는데
		//그 줄은 사용자가 입력한 수만큼 출력
		/*
		    출력할 줄수 : 3
		    ***** 
		    ***** 
		    *****
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int a = sc.nextInt();
		
		for(int h=1; h<=a;h++) {
			for(int i=1;i<=5;i++) {
				System.out.print("*");
		}
			System.out.println();
	}
  }
	public void method9() {
		//한 줄에 별 표(*) 문자를 입력된 줄 수와 칸 수만큼출력
		//단, 줄 수와 칸 수가 일치하는 위치에는 줄 번호에 대한 정수출력
		/*
		  줄수:6
		  칸수:6
		  1*****
		  *2****
		  **3***
		  ***4**
		  ****5*
		  *****6
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수:");
		int a = sc.nextInt();
		System.out.print("칸 수:");
		int b = sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				if(i==j) {
					System.out.print(j);
				}
				else {
				System.out.print("*");
				}
			}
			System.out.println();
		}

	}
	
	
}