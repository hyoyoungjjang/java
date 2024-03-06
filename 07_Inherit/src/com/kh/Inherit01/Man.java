package com.kh.Inherit01;

public class Man {
	String name;
	int age;
//	public Man() {
//		System.out.println("Man 객체 생성");
//	}
	
	public Man(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void tellYourName() {
		System.out.println("My name is " + name);
		System.out.println("My age is " + age+"살");
	}
	

}
