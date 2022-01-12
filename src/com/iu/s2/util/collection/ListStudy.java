package com.iu.s2.util.collection;

import java.util.ArrayList;

public class ListStudy {
	public void study1() {
		int[] numbers = new int[3];
		ArrayList ar = new ArrayList(); // 기본 10칸

		numbers[0] = 1;
		
		ar.add(1);
		ar.add(2);
		ar.add(3);

		System.out.println(numbers[0]);
		System.out.println(ar.get(0));

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}
}
