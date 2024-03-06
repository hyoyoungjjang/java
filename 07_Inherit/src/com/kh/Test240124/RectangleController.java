package com.kh.Test240124;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x ,int y, int width, int height) {
		r = new Rectangle(width, height, x, y);
		
		int area = r.getWidth() * r.getHeight();
		return r.toString() + "면적 : " + area;
	}

	
	public String calcPerimeter(int x, int y, int width, int height) {
		r = new Rectangle(width, height, x, y);
		
		int area = 2 * (r.getWidth() + r.getHeight());
		return r.toString() + "둘레 : " + area;
	}
}
