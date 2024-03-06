package com.kh.Test240126;

public class Run {
	public static void main(String[] args) {
		
		PhoneController phControler = new PhoneController();		
		
		String[] results = phControler.method();
		
		for(String result : results) {
			System.out.println(result);
			System.out.println();
		}
	}

}
