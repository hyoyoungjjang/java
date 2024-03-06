package com.kh.employy;

import java.util.Scanner;

/*
 * 화면에 출력하는 것과
 * 사용자로부터 입력받는 것을 처리해주는 객체
 */

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController em = new EmployeeController();

	public void EmployeeMainMenu() {
		/*
		 * 1.사원추가 9. 프로그램 종료 메뉴 번호를 누르세요 : (정수하나입력받기)
		 */

		int num;
		do {
			System.out.println("1. 사원추가");
			System.out.println("2. 사원전체출력");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호를 누르세요 : ");
			num = sc.nextInt();
		
			switch (num) {
			case 1:
				/*
				 * 사원추가기능 사원번호, 이름, 성별, 전화번호 추가 정보를 더 입력하시겠습니까?(y) y일때만 부서, 연봉, 보너스율 입력받고 해당
				 * 데이터를 활용하여 사원추가
				 */
				this.insertEmp();
				break;
			case 2:
				em.printEmpList();
				break;
			case 3 : 
				/*
				 * 전체 사원을 출력 -> 
				 * 삭제할 사원의 사원번호를 입력해주세요. : ? 
				 * y => 가장 최근에 등록된 사원을 삭제하고
				 * 삭제된 사원 정보 출력
				 * n을 누르면 그대로 다시 돌아옵니다.
				 */
				em.deleteEmp();
				break;
			case 4 :
				/*
				 * 정보를 출력할 사원의 사번을 입력하세요 : 
				 * 사원 정보 : ~~
				 */
				this.outputEmp();
				break;
			case 9 :
				System.out.println("프로그램 종료");
			default : 
				System.out.println("잘못입력하셨습니다.");
			}
		}while(num!=9);
		

	}

	public void insertEmp() {

		System.out.println("사원 번호 : ");
		int s = sc.nextInt();
		System.out.println("이름 : ");
		String n = sc.next();
		System.out.println("성별(m/f) : ");
		char mf = sc.next().charAt(0);
		System.out.println("전화번호 : ");
		String nb = sc.next();
		System.out.println("추가 정보를 더 입력할거야?(y/n)소문자로 입력해 : ");
		char y = sc.next().charAt(0);
		if (y == 'y') {
			System.out.println("부서 : ");
			String b = sc.next();
			System.out.println("연봉 : ");
			int o = sc.nextInt();
			System.out.println("보너스 : ");
			double bb = sc.nextDouble();

			em.insert(s, n, mf, nb, b, o, bb);
		} else {
			em.insert(s, n, mf, n, "부서없음", 0, 0.0);
		}
	}

	public void deleteEmp() {
//		System.out.println("정말 삭제하시겠습니까?(y/n) : ");
//		char ch = sc.next().toLowerCase().charAt(0);
//		
//		
//		if(ch == 'y') {
//			em.deleteEmp();
//		} 
		
		System.out.println("삭제할 사원번호를 입력해주세요 : ");
		int empNo = sc.nextInt();
		
		em.deleteEmpByEmpNo(empNo);
	}
	
	public void outputEmp() {
		System.out.println("정보를 출력할 사원의 사번 입력 : ");
		int num = sc.nextInt();
		
		
		em.outputEmp(num);
		
	}
		
		
		
		
	



}

