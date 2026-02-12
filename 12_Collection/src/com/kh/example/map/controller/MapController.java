package com.kh.example.map.controller;

import java.util.HashMap;

import com.kh.example.map.model.vo.Snack;

public class MapController {
	public void doMap() {
		HashMap<String, Snack> map = new HashMap<>(); //타입 추론
		
		Snack swk = map.put("새우깡",new Snack("짠맛",1500));
		Snack dij = map.put("다이제",new Snack("단맛",2500));
		Snack potato = map.put("포테이토칩",new Snack("짠맛",1500));
		Snack gsm = map.put("고소미",new Snack("고소한맛",1000));
		
		System.out.println("map : " + map);
		System.out.println(swk + "," + dij + "," + potato + "," + gsm);
		
		Snack swk2 = map.put("새우깡",new Snack("매운맛",1500));
		System.out.println("map : " + map);
		System.out.println(swk2);
		
		System.out.println(map.containsKey("새우깡"));
		System.out.println(map.containsKey("홈런볼"));
		System.out.println(map.containsValue(new Snack("단맛",2500)));
		
	}
	
}
