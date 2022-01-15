package com.iu.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy4 {

	public static void main(String[] args) {
		//현재 시간
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		//내가 태어난 날(년도, 월, 일)
		Calendar ca2 = Calendar.getInstance();
		ca2.set(1995, 5, 24);
		System.out.println(ca2.getTime());
		
		long l1 = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		
		long result = l1 - l2;
		System.out.println(result);
		System.out.println(result/(1000*60*60*24));
		System.out.println(result/(1000*60*60*24*365.2425));
		//나이..

	}

}
