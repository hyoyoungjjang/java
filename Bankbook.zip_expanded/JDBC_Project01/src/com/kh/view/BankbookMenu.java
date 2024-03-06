package com.kh.view;

import java.util.Scanner;

import com.kh.controller.BankbookController;
import com.kh.model.dao.BankbookDao;
import com.kh.model.vo.Bankbook;



public class BankbookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BankbookController bc = new BankbookController();

	
	public void mainMenu() {
		while(true) {
			System.out.println("=====통장 프로그램=====");
			System.out.println("1. 통장 만들기");
			System.out.println("2. 로그인하기");
			System.out.println("3. 회원 탈퇴");
			System.out.println("9. 종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 :
				this.makingBankbook();
				break;
			case 2 :
				this.rogin();
				break;
			case 3 : 
				this.delete();
				break;
			case 9 : 
				System.out.println("종료합니다.");
				return;
			default : 
				System.out.println("잘못입력하였습니다. 다시 입력하세요");
				break;
				
			}
		}
		
		
	}
	
	
	
	public void makingBankbook() {
		System.out.print("계좌번호 입력 : ");
		int no = sc.nextInt();
		sc.nextLine();
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("잔고 : ");
		int balance = sc.nextInt();
		
		bc.makingBankbook(no, id, pwd, name, balance);
		
	}
	

	public void rogin() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		Bankbook bb = new Bankbook();
		bb= bc.rogin(id, pwd);
		
		if(bb != null) {
			System.out.println("안녕하세요 " + bb.getUserName() +"님 무엇을 도와드릴까요? ");

			while(true) {		
				System.out.println("1. 잔고 확인");
				System.out.println("2. 입금");
				System.out.println("3. 출금");
				System.out.println("4. 다른 사람에게 송금");
				System.out.println("9. 로그아웃");
				System.out.print("메뉴선택 : ");
				int menu = sc.nextInt();
				sc.nextLine();
				
				switch(menu) {
				case 1 :	
					this.CheckBalance(bb);
					break;
				case 2 : 
					this.deposit(bb);
					break;
				case 3 : 
					this.withdraw(bb);
					break;
				case 4 : 
					this.remittance(bb);
					break;
				case 9 : 
					System.out.println("로그아웃 되었습니다.");
					return;
				default : 
					System.out.println("잘못입력하였습니다. 다시 입력하세요");
					break;
				}
				
				
			}
		}
	}





	public void deposit(Bankbook b) {
		this.CheckBalance(b);
		System.out.print("얼마 입금하시겠습니까? : ");
		int dpt = sc.nextInt();
		bc.deposit(b, dpt);
	}


	public void withdraw(Bankbook b) {
		this.CheckBalance(b);
		System.out.print("얼마 출금하시겠습니까? : ");
		int wd = sc.nextInt();
		bc.withdraw(b, wd);
	}
	
	public void delete() {
		System.out.print("탈퇴할 아이디 : ");
		String id = sc.nextLine();
		System.out.print("탈퇴할 비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("정말 탈퇴하시겠습니까?(y/n) : ");
		char yn = sc.next().toUpperCase().charAt(0);
		sc.nextLine();
		
		if(yn == 'N') {
			System.out.println("탈퇴 취소");
		}else if (yn == 'Y') {
			bc.delete(id, pwd);
		}
	}
	
	public void remittance(Bankbook b) {
		System.out.print("송금하실 계좌번호 입력 : ");
		int bbn = sc.nextInt();
		sc.nextLine();
		System.out.print("송금할 금액 : ");
		int money = sc.nextInt();
		sc.nextLine();
		
		bc.remittance(b, bbn, money);
	}








//-------응답 화면---------

	public void Success(String message) {
		System.out.println(message);
	
	};

	public void fail(String message) {
		System.out.println(message);
	};
	
	public void CheckBalance(Bankbook b) {
		Bankbook bk = new Bankbook();
		bk = bc.rogin(b.getUserId(), b.getUserPwd());
		System.out.println(bk.getUserName() + "님의 잔액은 " + bk.getBalance() + "원 입니다.");
	}
	
}





