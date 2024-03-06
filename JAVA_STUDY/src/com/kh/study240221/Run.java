package com.kh.study240221;

public class Run {
	public static void main(String[] args) {
//		Member m = new Member();
//		m.changeName("김효영");
//		m.printName();
//		
//		Book a = new Book();
//		Book b = new Book("김효영","김효영","김효영");
//		Book c = new Book("김효영","김효영","김효영",100000000,99);
//		
//		System.out.println(a.toString());
//		System.out.println(b.toString());
//		System.out.println(c.toString());
		
		
		Employee e = new Employee();
		e.setEmpNo(100);
		e.setEmpName("홍길동");
		e.setDept("영업부");
		e.setJob("과장");
		e.setAge(25);
		e.setGender('남');
		e.setSalary(2500000);
		e.setBonusPoint(0.05);
		e.setPhone("010-1234-5678");
		e.setAddress("서울시 강남구");
		System.out.println(e.getEmpNo());
		System.out.println(e);
		
	}

}
