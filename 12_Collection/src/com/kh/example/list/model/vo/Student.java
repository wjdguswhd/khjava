package com.kh.example.list.model.vo;

import java.util.Objects;

public class Student {
	private String name;
	private int score;
	
	public Student() {};
	
	public Student(String name,int score) {
		this.name=name;
		this.score=score;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setScore(int score) {
		this.score=score;
	}
	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return name +"("+score +"점)";
	}
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		//객체 자체 비교
//		if(this==obj) {
//			return true;
//		}
//		if(obj==null) {
//			return false;
//		}
//		if(getClass() != obj.getClass()) {
//			return false;
//		}
//		
//		//내용 비교
//		Student other = (Student)obj;
//		if(name==null) {
//			if(other.name !=null) {
//				return false;
//			}
//		}else if(!name.equals(other.name)) {
//			return false;
//		}
//		if(score != other.score) {
//			return false;
//		}
//		return true;
//	}
//	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result =1;
//		result = prime*result + ((name==null) ? 0 : name.hashCode());
//		result = prime*result+score;
//		return result;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		Student other = (Student)obj;
		return Objects.equals(name, other.name) && score == other.score;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,score);
	}
	
	
	
	
	
}
