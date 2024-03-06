package com.kh.Test;

import java.util.Scanner;

public class Run {
	// 사용자로부터 이름 수학점수/ 국어점수/ 영어점수를 입력받아
	// 평균을 실수로 구하세요.

	// 위에서 입력받은 정보로 객체를 생성할 수 있는 Student클래스를 작성하세요.
	// 평균을 구하는 메소드, 모든 필드정보를 보여주는 메소드를 포함하여 작성합니다.

	// 해당 프로그램을 작성합니다.
	// ========성적관리 프로그램 ==============
	// 1. 성적입력
	// 2. 모든학생 성적확인
	// 3. 학생성적검색
	// 9. 종료
	// 메뉴를 입력하세요. : 1
	// -> 1번입력시 이름 수학점수/ 국어점수/ 영어점수를 입력받아 객체배열에 저장(이름 중복저장 안됨)
	// -> 2번입력시 객체배열에 저장된 모든 객체정보 표시
	// -> 3번입력시 이름을 입력받아 해당이름의 학생 검색 후 정보출력
	// -> 9번입력시 종료

	public static void main(String[] args) {
//		StudentManagement st = new StudentManagement();
//		st.startProgram();
		
		Student ss = new Student(3.2);
		ss.draw();
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		Student[] studentArr = new Student[100];
		
		String name;
		double ma, en, ko;
		int menu = 0;
		int count = 0;
		
		while(menu != 9) {
			System.out.println("=====성적관리 프로그램 =====");
			System.out.println("1. 성적입력");
			System.out.println("2. 모든학생 성적확인");
			System.out.println("3. 학생성적검색");
			System.out.println("9. 종료");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : {
				System.out.println("학생 이름 : ");
				name = sc.next();
				System.out.println("수학 점수 : ");
				ma = sc.nextDouble();
				System.out.println("영어 점수 : ");
				en = sc.nextDouble();
				System.out.println("국어 점수 : ");
				ko = sc.nextDouble();
				
				int i =0;
				boolean isTrue = false;
				while(studentArr[i] != null) {
					if(studentArr[i].getName().equals(name)) {
						System.out.println("해당 이름으로 저장된 성적이 존재합니다.");
						isTrue = true;
						break;
					}
					i++;
				}
				studentArr[count] = new Student(name, ma, en, ko);
				System.out.println("평균 : " + studentArr[count].getAvg());
				System.out.println("성적등록완료 : " + studentArr[count++].toString());
				}break;
			case 2 :{ 
				System.out.println("===모든 학생 성적 정보===");
		        for(int i = 0; studentArr[i] != null; i++) {
		        	System.out.println(studentArr[i].toString());
		        }
			}break;
			case 3 : {//이름으로 학생 검색후 정보 출력
				System.out.println("=====검색 학생 정보=====");
				
				System.out.println("이름 입력 : ");
				name = sc.next();
				int i = 0;
				while(studentArr[i] != null) {
					if(studentArr[i++].getName().equals(name)) {
						System.out.println(studentArr[i].toString());
						break;
					}
				}
			}break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				return;	
			}
		}	*/
		
	}
}
