package com.iu.s1.lang.string.ex1;

public class MemberMain {

	public static void main(String[] args) {
		MemberData memberData = new MemberData();
		MemberDTO member[] = memberData.init();
		for(int i = 0; i<member.length;i++) {
			System.out.println(member[i].getId());
			System.out.println(member[i].getPw());
			System.out.println(member[i].getName());
			System.out.println(member[i].getEmail());
			System.out.println("--------------------");
		}
		
	}

}
