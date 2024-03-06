package com.kh.practice01;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
	
	}
	
	public String afterToken(String str) {
		
		StringTokenizer tokenizer = new StringTokenizer(str);
		String newStr = "";
		while(tokenizer.hasMoreTokens()) {
			newStr += tokenizer.nextToken();
		}
		
		return newStr.toString();
	}
	
	public String firstCap(String input) {
		
		if(input == null || input.isEmpty()) {
			return input;
		}
		
		String st = input.substring(0,1).toUpperCase() + (input.substring(1));
		
		return st;
	}
	
	public int findChar(String input, char one) {
		int count=0;
//		for(int i = 0; i < input.length(); i++) {
//			if(input.charAt(i) == one) {
//				count ++;
//			}
//		}
		
		for(char c : input.toCharArray()) {
			if(c == one) {
				count++;
			}
		}
		
		return count;
	}
	

}
