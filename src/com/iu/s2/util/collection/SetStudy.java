package com.iu.s2.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetStudy {
	
	public void study4() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num);
		}
	}
	
	public void study3() {
		Random random = new Random();
		HashSet<Integer> hs = new HashSet<>();
		
		while(hs.size() != 6) {
			int num = random.nextInt(45)+1;
			hs.add(num);
			
		}
		System.out.println(hs);
	}
	
	public void study2() {
		
		Random random = new Random();
		ArrayList<Integer> ar = new ArrayList<>();
	
		for(int i = 0; i < 6; i++) {
			int num = random.nextInt(45)+1; //0~10미만
			ar.add(num);
		}
		System.out.println(ar);
	}
	public void study1() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.remove(2);
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);
		ar.add(100);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(ar);
	}
}
