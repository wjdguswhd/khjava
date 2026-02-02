package com.kh.example.practice5.run;

import com.kh.example.practice5.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee ey = new Employee();
		
		ey.setEmpNo(100);
		System.out.println(ey.inform());
		ey.setEmpName("홍길동");
		System.out.println(ey.inform());
		ey.setDept("영업부");
		System.out.println(ey.inform());
		ey.setJob("과장");
		System.out.println(ey.inform());
		ey.setAge(25);
		System.out.println(ey.inform());
		ey.setGender('남');
		System.out.println(ey.inform());
		ey.setSalary(2500000);
		System.out.println(ey.inform());
		ey.setBonusPoint(0.05);
		System.out.println(ey.inform());
		ey.setPhone("010-1234-5678");
		System.out.println(ey.inform());
		ey.setAddress("서울시 강남구");
		
		System.out.println(ey.getEmpNo());
		System.out.println(ey.getEmpName());
		System.out.println(ey.getDept());
		System.out.println(ey.getJob());
		System.out.println(ey.getAge());
		System.out.println(ey.getGender());
		System.out.println(ey.getSalary());
		System.out.println(ey.getBounsPoint());
		System.out.println(ey.getPhone());
		System.out.println(ey.getAddress());


		
	}
}
