package com.iu.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {
	private Scanner sc;

	public WrapperEx1() {
		sc = new Scanner(System.in);
	}

	public void ex2() {
		// 키보드로부터 주민등록번호 입력
		// 9 7 1 2 2 4 - 1 2 3 4 5 6 7
		// *2 3 4 5 6 7 - 8 9 2 3 4 5
		// 18 21 4 10 12 28 8 18 6 12 20 30
		// 결과를 모두 더함
		// 2. 모두 더한 결과값을 11로 나누어서 나머지를 구함
		// 122 / 11 -> 11 ....1
		// 3. 11로 나누 나머지값을 11에서 빼고 그 값을 체크용번호와 비교
		// 11 - 1 = 10 == 7
		// 4. 만약에 결과값이 두 자리 라면 결과값을 다시 10으로 나눠서
		// 그 나머지 값을 체크용 번호랑 같은지 비교
		// 10 / 10 ...0 == 7
		// 같으면 정상적인 주민번호, 아니면 잘못된 번호
		StringBuffer sb = new StringBuffer();
		int index = 2;
		int sum = 0;
		System.out.println("주민등록번호를 입력하세요.");
		String number = sc.next();
		sb.append(number.substring(0, 6));
		sb.append(number.substring(7));
		number = sb.toString(); // '-'를 제외한 앞부분 뒷부분 문자열 합산
		int[] num = new int[13]; //주민등록번호를 담을 정수형 배열
		for (int i = 0; i < number.length(); i++, index++) {
			String numCount = String.valueOf(number.charAt(i)); //한 글자씩 꺼내와서 문자형으로 변환
			num[i] = Integer.parseInt(numCount); //문자형을 정수형으로 변환
			if (i == 12) break; //마지막 번호는 체크용 번호니까 제외
			num[i] *= index; 
			if (index == 9)
				index = 1; //for문 증감식에서 2로 변함
		}
		
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
		for (int i = 0; i < num.length - 1; i++) {
			sum += num[i];
		} //마지막 번호를 제외하고 모두 더해주기

		sum %= 11;
		sum = 11 - sum;

		if (sum >= 10) sum %= 10;

		if (sum == num[12])
			System.out.println("정상적인 주민등록 번호입니다.");
		else
			System.out.println("비정상적인 주민등록 번호입니다.");
	}

	public void ex1() {
		// 키보드로부터 주민등록번호 입력
		// 023456-1234567
		// 나이 계산
		// 성별 판별
		// 3~5월생 : 봄
		// 6~8월생 : 여름
		// 9~11월생 : 가을
		// 12~2월생 : 겨울
		StringBuffer sb = new StringBuffer();
		int currentYear = 2022; // 현재 년도
		System.out.println("주민등록번호를 입력하세요");
		String number = sc.next();
		String[] result = number.split("-");
		sb.append(result[0]);
		sb.append(result[1]);
		number = sb.toString();
		int age = Integer.parseInt(number.substring(0, 2)); // 생년

		if (age <= 99) {
			age = age + 1900;
			age = currentYear - age;
		} else {
			age = age + 2000;
			age = currentYear - age;
		}
		System.out.println("나이 : " + age);
		int birthMonth = Integer.parseInt(number.substring(2, 4)); // 태어난 달

		switch (birthMonth) {
		case 12, 1, 2:
			System.out.println("태어난 계절 : 겨울");
			break;
		case 3, 4, 5:
			System.out.println("태어난 계절 : 봄");
			break;
		case 6, 7, 8:
			System.out.println("태어난 계절 : 여름");
			break;
		case 9, 10, 11:
			System.out.println("태어난 계절 : 겨울");
			break;
		default:
		}

		int sex = Integer.parseInt(number.substring(6, 7));
		if (sex == 1 || sex == 3)
			System.out.println("성별 : 남자");
		else if (sex == 2 || sex == 4)
			System.out.println("성별 : 여자");
		else
			System.out.println("잘못된 입력입니다.");
	}
}
