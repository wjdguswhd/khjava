package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		
		Book bo1 = new Book();
		bo1.inform();
		Book bo2 = new Book("사과는 왜 빨갈까?","kh정보교육원","정현종");
		bo2.inform();
		Book bo3 = new Book("바다는 왜 파랄까?","kh학원","현종정",25000,0.3);
		bo3.inform();
	
	}
}
