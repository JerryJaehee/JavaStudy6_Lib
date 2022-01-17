package com.iu.s5.ex1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("Server 입니다");
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			System.out.println("클라이언트 접속을 기다리는 중");
			serverSocket = new ServerSocket(8283);
			socket = serverSocket.accept();
			System.out.println("접속한 cilent와 1:1 연결 완료");
			
			//
			InputStream is = socket.getInputStream(); //01 처리
			InputStreamReader ir = new InputStreamReader(is); //char
			BufferedReader br = new BufferedReader(ir); //String
			
			String message = br.readLine();
			System.out.println("Client : "+message);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
