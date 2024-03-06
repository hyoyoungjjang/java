package com.kh.Test2402062;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;



public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
			System.out.println("========== KH 추첨 프로그램 ==========");
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : 
				this.insertObject();
				break;
			case 2 : 
				this.deleteObject();
				break;
			case 3 : 
				this.winObject();
				break;	
			case 4 : 
				this.sortedWinObject();
				break;
			case 5 : 
				this.searchWinner();
				break;
			case 9 : 
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");	
			}
		}
		
		
		
	}
	
	public void insertObject() {
		int n;
		String name, phone;
		System.out.print("추가할 추첨 대상 수 : ");
		n = sc.nextInt();
		sc.nextLine();
		for(int i = 1; i <= n; i ++) {
			System.out.print("이름 : ");
			name = sc.nextLine();
			System.out.println();
			System.out.print("핸드폰 번호(- 빼고) : ");
			phone = sc.nextLine();
			
			Lottery lo = new Lottery(name, phone);
			if(!lc.insertObject(lo)) { //실패시
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--;
			}
		}
		System.out.println(n + "명 추가 완료되었습니다.");
	
	}
	
	public void deleteObject() {
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("핸드폰 번호('-'빼고) : ");
		String phone = sc.nextLine();
		
		Lottery tmp = new Lottery(name, phone);
		if (lc.deleteObject(tmp)) {
			System.out.println("삭제 완료 되었습니다");
		} else {
			System.out.println("존재하지 않습니다.");
		}
		
	}
	
	public void winObject() {
		HashSet<Lottery> winSet = lc.winObject();
		if(winSet != null) {
			System.out.println(winSet);
		} else {
			System.out.println("당첨결과가 없습니다.");
		}
	}
	
	public void sortedWinObject() {
		TreeSet<Lottery> sortedList = lc.sortedWinObject();
		if(sortedList.isEmpty()) {
			System.out.println("당첨결과가 없습니다");
		} else {
			Iterator<Lottery> iterator =  sortedList.iterator();
			
			while(iterator.hasNext()) {
				Lottery l = iterator.next();
				System.out.println(l);
			}
		}
	}
	
	public void searchWinner() {
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("핸드폰 번호('-'빼고) : ");
		String phone = sc.nextLine();
		
		Lottery l = new Lottery(name, phone);
		if(lc.searchWInner(l)) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		}else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
	}
}
