package com.kh.Test2402052;

public class Menu {
	//필드 -> 변수를 선언하는 공간--------------------------------------------------------------------------------
	//자료형 변수이름
	String title;
	int price;
	String kind;
	boolean isHot;
	
	
	//생성자 -------------------------------------------------------------------------------------------
	//접근제한자 클래스명(매개변수){ 초기화 }
	public Menu() {
		super();
	}
	
	
	public Menu(String title, int price, String kind, boolean isHot) {
		super();
		this.title = title;
		this.price = price;
		this.kind = kind;
		this.isHot = isHot;
	}

	
	
	//메소드------------------------------------------------------------------------------------------
	//접근제한자 (static) 반환형 메소드이름(매개변수){ 메소드 내용 }
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public boolean isHot() {
		return isHot;
	}


	public void setHot(boolean isHot) {
		this.isHot = isHot;
	}


	@Override
	public String toString() {
		return "Menu [title=" + title + ", price=" + price + ", kind=" + kind + ", isHot=" + isHot + "]";
	}	
	
	
}
