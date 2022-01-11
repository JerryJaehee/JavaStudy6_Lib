package com.iu.s1.lang.string.ex1;

public class MemberData {
	private String data;
	
	public MemberData() {
		this.data = "id1-pw1-name1-id1@gamil.com-";
		this.data = this.data + "id2 - pw2 - name2 - name2@naver.com-";
		this.data = this.data + "id3 - pw3 - name3 - name3@daum.net";		
	}
	
	public MemberDTO [] init() {
		//this.data
		MemberDTO [] memberDTO = new MemberDTO[3];
		String [] result = this.data.split("-");
		int index = 0;
		
		for(int i = 0; i<memberDTO.length;i++) {
				MemberDTO member = new MemberDTO();
				member.setId(result[index].trim());
				member.setPw(result[++index].trim());
				member.setName(result[++index].trim());
				member.setEmail(result[++index].trim());
				memberDTO[i] = member;
				index++;
		}
		return memberDTO;
	}
}
