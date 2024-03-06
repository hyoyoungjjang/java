package com.kh.Test240124;

public class CircleController {
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c = new Circle( radius , x , y);
		
		double area = Math.PI * c.getRadius() * c.getRadius();
		return c.toString() + "면적 : " + area; 
	}
	
	public String calcCircum(int x, int y, int radius) {
		c = new Circle( radius , x , y);
		
		double circum = 2 * Math.PI * c.getRadius() ;
		return c.toString() + "둘레 : " + circum; 
	}
}
