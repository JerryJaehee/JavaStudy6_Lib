package com.iu.s2.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListStudy {
	
	public List<String> study5() {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		return list;
	}
	public void study4() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		System.out.println(list.get(0));
	}
	public void study3() {
		//generic
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(1);
		ar.add('b');
		ar.add(3.12);
		ar.add("iu");
		
		for(int i = 0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		int num = (int) ar.get(0);
		String name = (String) ar.get(3);
	}
	public void study2() {
		ArrayList ar = new ArrayList();
		int num = 1;
		Integer n = num; //autoBoxing
		ar.add(n);
		ar.add(1); //autoBoxing
		
		ar.add('a'); //autoBoxing
		
		ar.add("name"); //다형성
	}
	public void study1() {
		int[] numbers = new int[3];
		ArrayList ar = new ArrayList(); // 기본 10칸

		numbers[0] = 1;
		
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(1,100);
		ar.set(0, 200);
		ar.remove(0);
		ar.clear();
		System.out.println(numbers[0]);

		System.out.println("--------------------");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}
}
