package com.iu.s3.ex4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy1 {

	public static void main(String[] args) {
		//Calendar는 추상 클래스
		//GregorianCalendar 가 Calendar 클래스 상속
		//Calendar의 메서드는 GregorianCalendar 에 있다.
		
		//현재 날짜와 시간정보를 가지는 객체를 생성
		GregorianCalendar gc = new GregorianCalendar();
		Calendar calendar = new GregorianCalendar();
		Calendar ca = calendar.getInstance();
		
		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH);
		int d = ca.get(Calendar.DATE);
		int h = ca.get(Calendar.HOUR);
		int hh = ca.get(Calendar.HOUR_OF_DAY);
		int min = ca.get(Calendar.MINUTE);
		int s = ca.get(Calendar.SECOND);
		int ms = ca.get(Calendar.MILLISECOND);
		//천분의 1초 1000 == 1초
		long millis = ca.getTimeInMillis();
		
		Date date = ca.getTime();
		
		System.out.println("Y : "+y);
		System.out.println("M : "+(m+1));
		System.out.println("D : "+d);
		System.out.println("H : "+h);
		System.out.println("HH : "+hh);
		System.out.println("Min : "+min);
		System.out.println("S : "+s);
		System.out.println("Ms : "+ms);
		System.out.println("Millis : "+millis);
		System.out.println(date);
		System.out.println("----------------------");
		System.out.println(gc);
		System.out.println(calendar);
		System.out.println(ca);
	}

}
