package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		System.out.println("str1과 str2의 주소는 같은가? :" + (str1==str2));
		System.out.println("str1과 str3의 주소는 같은가? :" + (str1==str3));
		
		System.out.println("str1의 hashcode :" + str1.hashCode());
		System.out.println("str2의 hashcode :" + str2.hashCode());
		System.out.println("str3의 hashcode :" + str3.hashCode());
		
		System.out.println("str1의 실주소값:" + System.identityHashCode(str1));
		System.out.println("str2의 실주소값:" + System.identityHashCode(str2));
		System.out.println("str3의 실주소값:" + System.identityHashCode(str3));
		
		
		str2 += "funny";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		System.out.println("str1의 hashcode :" + str1.hashCode());
		System.out.println("str2의 hashcode :" + str2.hashCode());
		System.out.println("str3의 hashcode :" + str3.hashCode());
		
		System.out.println("str1의 실주소값:" + System.identityHashCode(str1));
		System.out.println("str2의 실주소값:" + System.identityHashCode(str2));
		System.out.println("str3의 실주소값:" + System.identityHashCode(str3));
	}
	
	public void method2() {
		StringBuilder builder1 = new StringBuilder();
		System.out.println("초기 builder1의 수용량:" + builder1.capacity());
		System.out.println("bulder1에 들어있는 실제 값의 길이 :" + builder1.length());
		
		System.out.println();
		
		StringBuilder builder2 = new StringBuilder(100);
		System.out.println("초기 builder2의 수용량 :" + builder2.capacity());
		System.out.println("builder2에 들어있는 실제 값의 길이" + builder2.length());
		
		System.out.println();

		StringBuilder builder3 = new StringBuilder("abc");
		System.out.println("초기 builder3의 수용량 : " + builder3.capacity());
		System.out.println("builder3에 들어있는 실제 값의 길이 : " + builder3.length());
		
		System.out.println();
		
		System.out.println("builder3 실주소 값 : " + System.identityHashCode(builder3));
//		builder3.append("abc");
//		System.out.println("abc 추가 후의 builder3 : " + builder3);
//		System.out.println("abc 추가 후의 builder3 용량 :" + builder3.capacity());
//		System.out.println("abc 추가 후의 builder3 길이 :" + builder3.length());
//		
//		builder3.append("def");
//		System.out.println("def 추가 후의 builder3 :" + builder3);
//		System.out.println("def 추가 후의 builder3 용량 :" + builder3.capacity());
//		System.out.println("def 추가 후의 builder3 길이 : " + builder3.length());
		
		builder3.append("abc").append("def");
		System.out.println("abc, def 추가 후의 builder3 :" + builder3);
		System.out.println("abc, def 추가 후의 builder3 용량 :" + builder3.capacity());
		System.out.println("abc, def 추가 후의 builder3 길이 : " + builder3.length());
		
		System.out.println();
		
		//insert
		builder3.insert(2, "zzz");
		System.out.println(builder3);
		
		//delets
		builder3.delete(2, 5);
		System.out.println(builder3);
		
		builder3.reverse();
		System.out.println(builder3);
		
		
	}
	public void method3() {
		String str = "Hello World";
				
		//charAt 1 int index 반환 타입: char 문자열에서 해당 인덱스의 문자 하나를 반환
		char ch = str.charAt(4);
		System.out.println(ch);
				
		//concat 1 String str 반환 타입: String 현재 문자열 뒤에 전달한 문자열을 이어붙인 새로운 문자열 반환
		String concatStr = str.concat("!!!");
		System.out.println(concatStr);
		str += "!!!";
		System.out.println(str);
		
		//equals 1 Object anObject 반환 타입: boolean 두 문자열의 내용이 같은지 비교
		System.out.println(concatStr.equals(str));
				
		//substring 2 int beginIndex, int endIndex 반환 타입: String  문자열의 일부를 잘라서 새로운 문자열 반환
		System.out.println(str.substring(6));
		System.out.println(str.substring(0,4));
				
		//replace 2 old char, new char 반환 타입: String 특정 문자(문자열)를 다른 문자(문자열)로 치환한 새 문자열 반환
		System.out.println(str.replace('l', 'e'));
		
		//toUpperCase/toLowerCase 0 반환 타입: String 문자열을 모두 대문자 / 소문자로 변환
		String up = str.toUpperCase();
		String lower  = str.toLowerCase();
		System.out.println(up + " / " + lower);
		
		//equalsIgnoreCase 1 String anotherString 반환 타입: boolean 문자열 내용을 대소문자 구분 없이 비교
		System.out.println(up.equalsIgnoreCase(lower));
		
		//trim 0 반환 타입: String 문자열 앞뒤의 공백 제거
		String str2 = "         Java";
		String str3 = "Java         ";
		String str4 = "     Java    ";
		System.out.println(str2.trim());
		System.out.println(str3.trim());
		System.out.println(str4.trim());
	
		//split 1 String regex 반환 타입: String[] 문자열을 구분자 기준으로 나눠서 배열로 반환
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		String[] arr = splitStr.split(", ");
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//StringTokenizer
		StringTokenizer st = new StringTokenizer(splitStr, ", ");
		System.out.println("분리된 문자열 개수 :" + st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("분리된 문자열 개수 : " + st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println("re :" + st.nextToken());
		}
		
		String splitStr2 = "Apple,Banana-Cream*Dessert#Egg Fruit";
		String[] arr2 = splitStr2.split(",-*# ");
		for(int i =0; i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		StringTokenizer st2 = new StringTokenizer(splitStr2, ",-*# ");
		System.out.println("분리된 문자열 개수 : " + st2.countTokens());
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
