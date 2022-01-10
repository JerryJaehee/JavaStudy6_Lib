package com.iu.s1.lang.object;

public class ObjectStudy1 {
	public void Study1() {
		System.out.println("Syudy1 실행");
		
		Object obj = new Object();
		System.out.println(obj);
		
		int num = obj.hashCode();
		System.out.println(num);
		String str = obj.toString();
		System.out.println(str);
	}
	
}
