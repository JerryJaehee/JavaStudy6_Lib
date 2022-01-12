package com.iu.s3.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;


public class MemberData {
	private String data;
	
	public MemberData() {
		this.data = "id1-pw1-name1-id1@gamil.com-";
		this.data = this.data + "id2 - pw2 - name2 - name2@naver.com-";
		this.data = this.data + "id3 - pw3 - name3 - name3@daum.net";		
	}
	
	public ArrayList<MemberDTO> init() {
		//data에 있는 문자열 StringTokenizer로 파싱해서
		//MemberDTO를 생성해서 멤버변수값으로 대입
		//MemberDTO들을 ArrayList에 담아서 대입
		System.out.println("MemberEx1 Branch");
		
		return null;
	}
}
