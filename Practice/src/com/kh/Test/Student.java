package com.kh.Test;

public class Student {
	//필드
	String name;
	private double ma, en, ko;
	
	
	//생성자
	public Student(String name, double ma, double en, double ko) {
		this.name = name;
		this.ma=ma;
		this.en=en;
		this.ko=ko;
		
	}
	
	//메소드


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMa() {
		return ma;
	}


	public void setMa(double ma) {
		this.ma = ma;
	}


	public double getEn() {
		return en;
	}


	public void setEn(double en) {
		this.en = en;
	}


	public double getKo() {
		return ko;
	}


	public void setKo(double ko) {
		this.ko = ko;
	}
	
	public double getAvg() {
		return (this.en + this.ko + this.ma) / 3.0;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", ma=" + ma + ", en=" + en + ", ko=" + ko + ", avg=" + this.getAvg() + "]";
	}

	
	
	public double radius;
	
	
	public Student(double radius) {
		super();
		this.radius = radius;
	}

	public void draw() {
		System.out.println("반지름" + radius + "cm인 원을 그립니다.");
	}
	
	
	

}


