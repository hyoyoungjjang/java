package com.kh.Test2401262;

public class Dog extends Animal{
	public final String PLACE = "애견카페" ;
	private int weight;
	
	
	
	public Dog() {
		
	}


	public Dog(String name, String kinds, int weight ) {
		super(name, kinds);
		this.weight = weight;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public String getPLACE() {
		return PLACE;
	}
	
	public void speak() {
		System.out.println(super.toString() + "몸무게는" + this.getWeight() + "kg 입니다.");
	}
	
}
