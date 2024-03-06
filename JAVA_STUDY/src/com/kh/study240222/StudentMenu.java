package com.kh.study240222;

public class StudentMenu {
	private StudentController sm = new StudentController();
	
	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ==========");
		Student[] stuArr = sm.printStudent();
		
		for(int i = 0; i < stuArr.length; i++) {
			System.out.println(stuArr[i].inform());
		}
		
		System.out.println("========== 학생 성적 출력 ==========");
		double[] douArr = sm.avgScore();
		System.out.println("학생 점수 합계 : " + douArr[0]);
		System.out.println("학생 점수 평균 : " + douArr[1]);
		
	
		System.out.println("========== 성적 결과 출력 ==========");
		for(int i = 0; i < stuArr.length; i++) {
			if(sm.CUT_LINE > stuArr[i].getScore()) {
				System.out.println(stuArr[i].getName() + "학생은 재시험 대상입니다");
			}else {
				System.out.println(stuArr[i].getName() + "학생은 통과입니다.");
			}
		}
		
		
	}

}
