package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		List l = new ArrayList();//다형성 적용, 초기용량 10
		//제네릭 미사용 = 타입 제한 x 모든 타입을 다 받을 수 있게 함(Object)
		//l.add(Object e) / l.get(): Object
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(new String("테스트"));
		list.add("도대남");
		list.add("남나눔");
		
		System.out.println("list :" + list);
		
		list.add("하현호");
		System.out.println("list :" + list);
		System.out.println("현재 list에 담긴 element 개수:" + list.size());
		
		list.add("문미미");
		System.out.println("list :" + list);
		System.out.println("현재 list에 담긴 element 개수:" + list.size());
		
		//장점 1. 크기 제약이 없다.
		//특징 1. 저장 순서가 유지된다.
		
		
		//장점 2. 추가/삭제/정렬 등의 기능처리 간단하다.
		list.add(0, "류라라");
		System.out.println("list :" + list);
		
		list.add(3, "강건강");
		System.out.println("list :" + list);
		
		String remove1 = list.remove(1);
		System.out.println(remove1);
		System.out.println("list :" + list);
		
		for(int i = 0; i<list.size();i++) {
			String elem = list.get(i);
			if(elem.equals("강건강")) {
				list.remove(i);
				break; // 강건강이 여러명 있다고 가정하에 첫번째 강건강만 지우고싶으면 break;
			}
		}
		
		System.out.println("list :" + list);
//		System.out.println(list.remove("강건강"));
//		System.out.println("list :" + list);
//		System.out.println(list.remove("테스트"));
//		System.out.println("list :" + list);
		
		//Student객체만 저장할 수 있는 ArrayList studentList 생성
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("박보배",100));
		studentList.add(new Student("강건강",40));
		studentList.add(new Student("차청춘",70));
		System.out.println(studentList);
			
		studentList.remove(new Student("박보배",100));
		System.out.println(studentList);
		
//		ArrayList에서 remove(Object o)는 단순히 객체의 주소값을 비교하는 것이 아니라 
//		equals() 메소드를 통해 객체의 내용을 비교하여 삭제 대상을 찾는다. 
//		따라서 사용자 정의 클래스의 경우 기본 Object의 equals()는 주소 비교를 수행하므로 원하는 객체가 삭제되지 않을 수 있으며, 
//		이를 해결하기 위해서는 equals()를 오버라이딩하여 객체의 필드 값을 기준으로 비교하도록 구현해야 한다.
		
		Student s1 = new Student("홍길동",55);
		Student s2 = new Student("김길동",44);
		Student s3 = new Student("이길동",33);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		System.out.println(studentList);
		
		studentList.remove(s2);
		System.out.println(studentList);
		
		for(int i = 0; i<studentList.size(); i++) {
			Student s = studentList.get(i);
			if(s.getName().equals("홍길동")&& s.getScore() == 55) {
				studentList.remove(i);
			}
		}
		System.out.println(studentList);
		
		System.out.println("list : " + list);
		Collections.sort(list);
		System.out.println("list : " + list);
		
		
		
		
		
		
		
	}
}
