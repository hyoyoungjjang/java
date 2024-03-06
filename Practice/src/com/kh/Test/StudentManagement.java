package com.kh.Test;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagement {
	Scanner sc;
	Student[] studentArr; // 학생목록

	public StudentManagement() {
		super();
		this.sc = new Scanner(System.in);
		this.studentArr = new Student[100];
	}

	private int printMenu() {
		System.out.println("=====성적관리 프로그램 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 모든학생 성적확인");
		System.out.println("3. 학생성적검색");
		System.out.println("4. 마지막저장정보 삭제");
		System.out.println("5. 조건 검사");
		System.out.println("9. 종료");
		int menu = sc.nextInt();
		sc.nextLine();
		return menu;
	}

	public void startProgram() {
		int menu = 0;
		while (menu != 9) {
			menu = this.printMenu();

			switch (menu) {
			case 1:// 성적입력
				this.insertGrade();
				break;
			case 2:// 모든학생 성적확인
				this.allInformation();
				break;
			case 3:// 학생 검색후 정보 출력
				this.search();
				break;
			case 4: // 마지막으로 저장된 정보 삭제
				this.lastGradeDelete();
				break;
			case 5: // 조건검사
				this.searchGradeByCondition();
				break;
			case 9: // 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

	}

	public void insertGrade() {
		String name;
		double ma, en, ko;
		int menu = 0;

		System.out.println("학생 이름 : ");
		name = sc.next();
		System.out.println("수학 점수 : ");
		ma = sc.nextDouble();
		System.out.println("영어 점수 : ");
		en = sc.nextDouble();
		System.out.println("국어 점수 : ");
		ko = sc.nextDouble();

		int i = 0;

		while (studentArr[i] != null) {
			if (studentArr[i].getName().equals(name)) {
				System.out.println("해당 이름으로 저장된 성적이 존재합니다.");
				return;
			}
			i++;
		}
		studentArr[i] = new Student(name, ma, en, ko);
		System.out.println("평균 : " + studentArr[i].getAvg());
		System.out.println("성적등록완료 : " + studentArr[i].toString());
	}

	public void allInformation() {

		System.out.println("===모든 학생 성적 정보===");
		for (int i = 0; studentArr[i] != null; i++) {
			System.out.println(studentArr[i].toString());
		}

		if (studentArr[0] == null) {
			System.out.println("입력된 성적이 없습니다.");
		}
	}

	public void search() {
		System.out.println("=====검색 학생 정보=====");
		String name;
		System.out.println("이름 입력 : ");
		name = sc.next();
		int i = 0;
		while (studentArr[i] != null) {
			if (studentArr[i++].getName().equals(name)) {
				System.out.println(studentArr[i].toString());
				break;
			}
			i++;
		}
	}

	public void searchGradeByCondition() {
		// 1. 평균 2. 수학 3. 영어 4. 국어
		// (다른번호 입력시 잘못입력하셨습니다. 출력하고 성적관리프로그램으로 돌아가기)
		// 삭제할 조건 입력 : 1
		// 기준점수(이상) : 30
		// 기존점수(이하) : 50
		// 50이상 30이하의 평균학생
		// ..............
		int menu, min, max;
		
		System.out.println("=========조건 검색========");
		System.out.println("1.평균 2.수학 3.국어 4.영어");
		System.out.println("조건 입력 : ");
		menu = sc.nextInt();
		
		System.out.print("기준점수(이상) :");
		min = sc.nextInt();
		System.out.print("기준점수(이하) : ");
		max = sc.nextInt();
		
		switch(menu) {
		case 1 : //평균
			for (int i =0; studentArr[i] != null; i++) {// 생성된 것까지만 배열을 반복해서 탐색
				double avg = studentArr[i].getAvg();
				if(min <= avg && max >=avg) {
					System.out.println(studentArr[i].toString());
				}
			}
			break;
		case 2 :
			for (int i =0; studentArr[i] != null; i++) {// 생성된 것까지만 배열을 반복해서 탐색
				double ma = studentArr[i].getMa();
				if(min <= ma && max >=ma) {
					System.out.println(studentArr[i].toString());
				}
			}
			break;
		case 3 :
			for (int i =0; studentArr[i] != null; i++) {// 생성된 것까지만 배열을 반복해서 탐색
				double ko = studentArr[i].getKo();
				if(min <= ko && max >=ko) {
					System.out.println(studentArr[i].toString());
				}
			}
			break;
		case 4 :
			for (int i =0; studentArr[i] != null; i++) {// 생성된 것까지만 배열을 반복해서 탐색
				double en = studentArr[i].getEn();
				if(min <= en && max >=en) {
					System.out.println(studentArr[i].toString());
				}
			}
			break;
		default : 
			System.out.println("잘못입력하셨습니다.");
		}
	}

	public void lastGradeDelete() {
		if (studentArr[0] == null) {
			System.out.println("입력된 성적이 없습니다.");
			return;
		}
		for (int i = 1; i < studentArr.length; i++) {
			if (studentArr[i] == null) {
				System.out.println("삭제 정보 : " + studentArr[i - 1].toString());
				studentArr[i - 1] = null;
				System.out.println("삭제를 완료하였습니다.");
				break;
			}
		}
	}

}
