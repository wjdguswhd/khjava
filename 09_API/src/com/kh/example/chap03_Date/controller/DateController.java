package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public void method1() {
		Date today = new Date();
		System.out.println(today); //Fri Feb 06 14:13:01 KST 2026
		System.out.println(today.getTime()); // 1770355043438
		
		Date time = new Date(1770355043438L);
		System.out.println(time);
		
		Date date = new Date(2026, 2 ,7);
		System.out.println(date);
	
	}
	public void method2() {
		//Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int amPm = c.get(Calendar.AM_PM);
		String strAmPm = amPm == 0 ?"오전":"오후";
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		int day = c.get(Calendar.DAY_OF_WEEK);
		
		String strDay=null;
		switch(day){
		case Calendar.MONDAY: strDay = "월요일"; break;
		case Calendar.TUESDAY: strDay = "화요일"; break;
		case Calendar.WEDNESDAY: strDay = "수요일"; break;
		case Calendar.THURSDAY: strDay = "목요일"; break;
		case Calendar.FRIDAY: strDay = "금요일"; break;
		case Calendar.SATURDAY: strDay = "토요일"; break;
		default: strDay = "일요일";
		}
		System.out.printf("%d년 %d월 %d일 %s %s %d시 %d분 %d초", year , month, date, strDay,strAmPm,hour,min,sec,day);
		
		GregorianCalendar endGc = new GregorianCalendar(2026,6,10,17,50,0); // 26년 7월 10일 17시 50분 00초
		System.out.println(endGc);
		long milli = endGc.getTimeInMillis();
		Date endDate = new Date(milli);
		System.out.println(endDate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초 SSS");
		String format = sdf.format(endDate);							//대문자HH는 24시간짜리						
		System.out.println(format);
		
		
		
	}
}
