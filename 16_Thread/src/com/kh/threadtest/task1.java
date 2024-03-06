package com.kh.threadtest;

public class task1 extends Thread{
	public void run() {
		 try {
			for(int i = 0; i < 20; i ++) {
				if(i % 2 == 0) {
					System.out.print(i + " ");	
				}
				                                                                                    
					Thread.sleep(100);// 0.14초간 잠을잔다
			}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			
	}
}
