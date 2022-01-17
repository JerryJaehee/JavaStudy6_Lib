package com.iu.s6;

public class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i = 'a'; i<'z';i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Alpa : "+(char)i);
		}
	}
}
