package com.kh.Test240124;

public class Circle extends Point{
	private int radius;

	
	public Circle() {
		super();
	}
	
	public Circle(int radius, int x , int y) {
		super(x,y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + "," + radius;
	}
	
	
	
	
}
