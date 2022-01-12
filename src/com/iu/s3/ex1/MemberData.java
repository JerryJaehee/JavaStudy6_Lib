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
		String str = this.data;
		StringTokenizer st = new StringTokenizer(str, "-");
		ArrayList<MemberDTO> ar = new ArrayList<>();
		while(st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();
			String token = st.nextToken().trim();
			memberDTO.setId(token);
			token = st.nextToken().trim();
			memberDTO.setPw(token);
			token = st.nextToken().trim();
			memberDTO.setName(token);
			token = st.nextToken().trim();
			memberDTO.setEmail(token);
			ar.add(memberDTO);
			
		}
		for(int i = 0; i<ar.size();i++) {
			System.out.println(ar.get(i).getId());
			System.out.println(ar.get(i).getPw());
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getEmail());
		}
		
		
		return null;
	}
}
