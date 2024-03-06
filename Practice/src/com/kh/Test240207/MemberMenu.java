package com.kh.Test240207;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		
		System.out.println("========== KH 사이트 ==========");
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : 
				this.joinmembership();
				break;
			case 2 : 
				this.logIn();
				this.memberMenu();
				break;
			case 3 : 
				this.sameName();
				break;	
			case 9 : 
				System.out.println("프로그램 종료.");
				return;
			default :	
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}	
	}
	
	public void memberMenu() {
		while(true) {
			System.out.println("******* 회원 메뉴 *******");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.println("메뉴 번호 선택");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : 
				this.changePassword();
				break;
			case 2 : 
				this.changeName();
				break;
			case 3 : 
				System.out.println("로그아웃 되었습니다.");
				return;
			default :	
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	public void joinmembership() {
		
		while(true) {
			
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.next();
			sc.nextLine();
			
			Member m = new Member(name, pw);
			
			if(mc.joinMembership(id,m)) {
				System.out.println("성곡적으로 회원가입 완료하였습니다.");
				break;
			} else{
				System.out.println("중복된 아이디입니다. 다시 입력해주세요");
			}
		}
		
		
	}
	
	public void logIn() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		String name = mc.logIn(id, pw);
		if(name == null) {
			System.out.println(name + "님 환영합니다.");
			
			return;
			
		} else {
			System.out.println( "틀린 아이디 또는 비밀번호 입니다. 다시 입력하세요");
			
			
		}
		
		
	}
	
	public void changePassword() {
		while(true) {
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			System.out.println("현제 비밀번호 : ");
			String oldPwd = sc.nextLine();
			System.out.println("새로운 비밀번호 : ");
			String newPwd = sc.nextLine();
			
			if(mc.changePassword(id, oldPwd, newPwd)) {
				System.out.println("비밀번호 변경에 성공했습니다");
				return;
			}else {
				System.out.println("비밀번호 변경에 실패하였습니다. 다시입력해주세요.");
			}
		}
	}
	
	public void changeName() {
		while(true) {
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			System.out.println("비밀번호 : ");
			String oldPwd = sc.nextLine();
			
			String name = mc.logIn(id, oldPwd);
			if(name != null) {
				System.out.println("현제 설정된 이름 : " + name);
				
				System.out.println("변경할 이름 : ");
				String newName = sc.nextLine();
				mc.changeName(id, newName);
				break;
			} else {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	public void sameName() {
		System.out.println("검색할 이름 : ");
		String name = sc.nextLine();
		
		TreeMap result = mc.sameName(name);
		if(result.isEmpty()) {
			System.out.println("회원을 찾지 못했습니다");
		} else {
			
			for (Object entry : result.entrySet()) {
				Entry<String, String> en = (Entry)entry;
				System.out.println(en.getValue() + " - " + en.getKey());
			}
		}
	}
	
}
