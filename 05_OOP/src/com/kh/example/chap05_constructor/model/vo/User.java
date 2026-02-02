package com.kh.example.chap05_constructor.model.vo;

public class User {
	private String userId;
	private String userName;
	private int age;
	private double point;
	
	public void inform() {
		System.out.printf("%s, %s, %d, %f\n", userId, userName, age, point);
	}
}
