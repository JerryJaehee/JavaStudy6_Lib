package com.iu.s4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력");
		int num = 200;
		try {
			int age = sc.nextInt();
			//throw new InputMismatchException();
			
			int result = num/age;
		//	throw new ArithmeticException();
			
			System.out.println("Age : "+age);
			System.out.println("Result : "+result);
		}catch(InputMismatchException exception) {
			System.out.println("숫자만 입력하세요");
		}
	}

}
