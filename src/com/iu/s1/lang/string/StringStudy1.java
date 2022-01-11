package com.iu.s1.lang.string;

import java.util.Scanner;

public class StringStudy1 {
	
	public void splitTest() {
		String name = "iu, suji, choa, 펭수, 춘식이";
		String [] result = name.split(",");
		for(int i = 0; i<result.length;i++)
			System.out.println(result[i].trim());
		
	}
	
	public void valueTest() {
		int num = 1000;
		String result = String.valueOf(num); //static 메서드의 사용법
		System.out.println(result);
	}
	
	public void caseTest() {
		String title = "West Side Story";
		String result1 = title.toLowerCase();
		String result2 = title.toUpperCase();
		System.out.println(result1);
		System.out.println(result2);
	}
	
	public void replaceTest() {
		String title = "West Side Story";
		String result = title.replace("West" , "North");
		System.out.println(title);
		System.out.println(result);
	}
	
	public void subStringEx1() {
		// 키보드로부터 업로드 할 파일명을 입력
		// a.txt, b.pdf, iu.jpg ,,,
		// jpg, gif, png -> 이미지 파일입니다. 출력
		// txt, pdf, hwp -> 문서 파일입니다. 출력
		// mp3, wav, ogg -> 음원 파일입니다. 출력
		// 그 외 나머지는 알 수 없는 파일입니다. 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력해주세요.");
		String fileName = sc.next();

		String extension = fileName.substring(fileName.lastIndexOf(".") + 1);

		switch (extension) {
		case "jpg", "gif", "png":
			System.out.println("이미지 파일입니다.");
			break;
		case "txt", "pdf", "hwp":
			System.out.println("문서 파일입니다.");
			break;
		case "mp3", "wav", "ogg":
			System.out.println("음원 파일입니다.");
			break;
		default:
			System.out.println("알 수 없는 파일입니다.");

		}
	}

	public void subStringTest() {
		String title = "West Side Story";
		String result = title.substring(5);
		System.out.println(result);
		result = title.substring(5, 9);
		System.out.println(result);
	}

	public void lengthTest() {
		String title = "West Side Story";
		int len = title.length();

		String find = "S";
		int count = 0;
		// title find에 들어가있는 글자가 몇 개 인지 출력
		for (int i = 0; i < title.length(); i++) {
			int index = title.indexOf(find, i);
			if (index >= 0) {
				count++;
				i = index;
			} else
				break;
		}
		System.out.println("S : " + count);
//		for(int i = 0; i<title.length();i++) {
//			System.out.print(title.charAt(i));
//		}

	}

	public void indexOfTest() {
		String msg = "Hello World";
		// indexOf 호출
		int num = msg.indexOf('e');
		System.out.println(num);
	}

	public void equalTest() {
		String str = "iu";
		String str2 = "iu";
		String str3 = new String("iu");
		String str4 = new String("iu");

		System.out.println(str == str2);
		System.out.println(str3 == str4);
		System.out.println(str == str3);
		System.out.println("==============================");
		System.out.println(str.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str.equals(str3));
	}

	public void study1() {
		String name = "hello";
		String name2 = new String("hello2"); // 원래의 방식

		System.out.println(name.charAt(1));
		System.out.println(name);

	}
}
