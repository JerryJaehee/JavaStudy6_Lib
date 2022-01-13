package com.iu.s2.util.token;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String str = "봄,16,여름,32,가을,20,겨울,-15";
		String [] s = str.split(",");
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		ArrayList<SeasonDTO> ar =new ArrayList<>();
		while(st.hasMoreTokens()) {
			SeasonDTO seasonDTO = new SeasonDTO();
			String token = st.nextToken();
			seasonDTO.setName(token);

			token = st.nextToken();
			seasonDTO.setGion(Integer.parseInt(token));
			ar.add(seasonDTO);
			
		}
		for(int i = 0; i<ar.size();i++) {
			SeasonDTO seasonDTO = ar.get(i);
			System.out.println(seasonDTO.getName());
			System.out.println(ar.get(i).getGion());
		}
	}

}
