package com.kh.Polymorphism01;

 class Cake {
	public void yummy() {
		System.out.println("yummy Cake");
	}

}

 class CheeseCake extends Cake{
	 public void yummy() {
		//super.yummy();
		  System.out.println("yummy cheeseCake");
		 //Cake의 yummy를 오버라이딩
	 }
 }
 
 class StrawberryCheeseCake extends CheeseCake{
	 public void yummy() {
		// super.yummy();
		  System.out.println("yummy StrawberryCheeseCake");
		 //그리고 cheeseCake의 yummy를 오버라이딩
	 }
 }