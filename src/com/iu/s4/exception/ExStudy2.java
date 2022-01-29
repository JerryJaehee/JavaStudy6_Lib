package com.iu.s4.exception;

public class ExStudy2 extends Exception{
	public void ex1() {
		int num = 70;
		int num2= 50;
		int num3 = num+num2;
		int num4 = num2 - num;
		
		try {
			if(num3 > 99) {
				throw new ChildException();
			}
		}catch (Exception e) { // 방법 1
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Message : "+e.getMessage());
		}
		//catch(ChildException childException) { 방법 2
	}
}
