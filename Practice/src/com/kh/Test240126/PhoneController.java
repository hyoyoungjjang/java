package com.kh.Test240126;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		Phone[] phones = new Phone[2];
		
		phones[0] = new GalaxyNote9();
		phones[1] = new V40();
		
		String[] results = new String[phones.length];
		
		for(int i = 0; i<phones.length; i++) {
			results[i] = ((SmartPhone)phones[i]).printlnformation();
		}
		return result;
		
	}
	
	
	
}
