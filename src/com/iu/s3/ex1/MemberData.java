package com.iu.s3.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberData {
	private String data;
	private Scanner sc;

	public MemberDTO removeMember(ArrayList<MemberDTO> ar) {
		// 삭제하고 싶은 ID 입력 받음
		// 일치하는 ID가 있을 경우 ArrayList 에서 해당 ID 삭제
		MemberDTO memberDTO = null;

		System.out.println("삭제를 원하는 id를 입력하세요.");
		String deleteId = sc.next();

		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i).getId().equals(deleteId)) {
				memberDTO = ar.remove(i);
				break;
			}

		}

		return memberDTO;
	}

	public MemberData() {
		this.sc = new Scanner(System.in);
		this.data = "id1-pw1-name1-id1@gamil.com-20-";
		this.data = this.data + "id2 - pw2 - name2 - name2@naver.com-34-";
		this.data = this.data + "id3 - pw3 - name3 - name3@daum.net-41-";
	}

	public void addMember(ArrayList<MemberDTO> ar) {
		// 새로 추가 할 MemberDTO를 생성
		// 키보드로부터 id, pw, name, email, age 입력받아서
		// MemberDTO 의 멤버변수 값으로 대입
		// 매개변수로 받은 ar에 MemberDTO 추가
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("id를 입력하세요.");
		memberDTO.setId(sc.next().trim());
		System.out.println("비밀번호를 입력하세요.");
		memberDTO.setPw(sc.next().trim());
		System.out.println("이름을 입력하세요.");
		memberDTO.setName(sc.next().trim());
		System.out.println("이메일을 입력하세요.");
		memberDTO.setEmail(sc.next().trim());
		System.out.println("나이를 입력하세요.");
		memberDTO.setAge(sc.nextInt());
		ar.add(memberDTO);
	}

	public ArrayList<MemberDTO> init() {
		// data에 있는 문자열 StringTokenizer로 파싱해서
		// MemberDTO를 생성해서 멤버변수값으로 대입
		// MemberDTO들을 ArrayList에 담아서 대입
		System.out.println("MemberEx1 Branch");
		StringTokenizer st = new StringTokenizer(this.data, "-");
		ArrayList<MemberDTO> ar = new ArrayList<>();

		while (st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(st.nextToken().trim());
			memberDTO.setPw(st.nextToken().trim());
			memberDTO.setName(st.nextToken().trim());
			memberDTO.setEmail(st.nextToken().trim());
			memberDTO.setAge(Integer.parseInt(st.nextToken().trim()));
			ar.add(memberDTO);
		}
		return ar;
	}
}
