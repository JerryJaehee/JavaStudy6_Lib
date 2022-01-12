package com.iu.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String str = "봄,16,여름,32,가을,20,겨울,-15";
		String [] s = str.split(",");
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			SeasonDTO seasonDTO = new SeasonDTO();
			String token = st.nextToken();
			seasonDTO.setName(token);

			token = st.nextToken();
			seasonDTO.setGion(Integer.parseInt(token));
			System.out.println(seasonDTO.getName());
			System.out.println(seasonDTO.getGion());
		}
	}

}
