package com.iu.s3.ex1.student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.iu.s3.ex1.member.MemberDTO;

public class StudentData {
	private Scanner sc;
	
	public StudentData() {
		sc = new Scanner(System.in);
	}
	public Map<String, StudentDTO> addStudent(List<MemberDTO> ar) {
		//member의 수 만큼 성적 정보 입력
		//이 정보들을 StudentDTO
		//map의 키는 id <K,V>
		String id = null;
		HashMap<String, StudentDTO> map = new HashMap<>();
		for(int i = 0; i<ar.size();i++) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setId(ar.get(i).getId());
			studentDTO.setName(ar.get(i).getName());
			System.out.println("국어점수를 입력하세요.");
			studentDTO.setKor(sc.nextInt());
			System.out.println("영어점수를 입력하세요.");
			studentDTO.setEng(sc.nextInt());
			System.out.println("수학점수를 입력하세요.");
			studentDTO.setMath(sc.nextInt());
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			map.put(studentDTO.getId(), studentDTO);
		}	

		return map;
	}
}
