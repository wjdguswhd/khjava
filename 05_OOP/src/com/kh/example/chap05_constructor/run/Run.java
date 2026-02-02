package com.kh.example.chap05_constructor.run;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();
		System.out.println("Run u1:" + u1);
		u1.inform();
		u1.inputValue("user01");
		u1.inputValue2("홍길동");
		u1.inputValue3(20);
		u1.inputValue4(78.543);
		u1.inputValue5("user02","김철수",17,55.5);
		//		u1.inputValue5("user02","김철수",17,6);
		u1.inform();
		u1.inputValue4(60);
		u1.inform();
		
		User u2 = new User("user03","김영희",25,123456);
		u2.inform();
		u2.inputValue3(26);
		u2.inform();
		
	}
}
