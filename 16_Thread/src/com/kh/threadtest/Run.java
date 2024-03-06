package com.kh.threadtest;

public class Run {
	public static void main(String[] args) {
		task1 t1 = new task1();
		task2 t2 = new task2();
		
		t1.start();
		t2.start();
	}
}
