package com.iu.s5.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("Server 입니다");
		ServerSocket serverSocket = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("클라이언트 접속을 기다리는 중");
			serverSocket = new ServerSocket(8282);
			socket = serverSocket.accept();
			System.out.println("접속한 cilent와 1:1 연결 완료");
			
			//
			InputStream is = socket.getInputStream(); //01 처리
			InputStreamReader ir = new InputStreamReader(is); //char
			BufferedReader br = new BufferedReader(ir); //String
			
			String message = br.readLine();
			System.out.println("Client : "+message);
			
			System.out.println("Cilent로 전송할 메세지 입력");
			message = sc.nextLine();
			//server에서 클라이언트로 메세지 전송
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(ow);
			
			//실제 전송
			bw.write(message+"\r\n");
			//강제로 버퍼 비우기
			bw.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
