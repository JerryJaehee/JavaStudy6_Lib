package com.iu.s3.ex4.calendar;

import java.util.Calendar;
import java.util.Date;

public class Calendarstudy3 {

	public static void main(String[] args) {
		//1초 = 1000
		//1분 = 60초
		//1시간 = 60분
		//하루 = 24시간
		//1년 = 365일
		System.out.println(1000*60*60*24*365);

		//현재시간
		Calendar ca = Calendar.getInstance();

		//2시간 후에 시간
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.HOUR_OF_DAY, 17);
		
		System.out.println("현재 시간 : "+ca.getTime());
		System.out.println("2시간 후 시간 : "+ca2.getTime());
		
		
		//둘 간의 시간차를 구하려함 . 밀리세컨즈로 변경해서 ㅃㅐ기
		long l1 = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		long result = l2 - l1;
		
		System.out.println(result);
		System.out.println(result/(1000*60*60));
	}

}
