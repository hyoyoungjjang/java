package com.kh.Test24020702;

import java.util.HashMap;
import java.util.Scanner;


//View : 사용자에게 보여지는 시각적인 요소(출력문, 입력문)
public class FarmMenu {
	Scanner sc = new Scanner(System.in);
	FarmController fc = new  FarmController();
	
	public void mainMenu() {
		System.out.println("========== KH 마트 ==========");
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 :
				this.adminMenu();
				break;
			case 2 :
				this.customerMenu();
				break;
			case 9 :
				System.out.println("프로그램 종료.");
				return;
			default :	
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	public void adminMenu() {
		while(true) {
			System.out.println("******* 직원 메뉴 *******");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 :
				this.addNewKind();
				break;
			case 2 :
				this.removeKind();
				break;
			case 3 :
				this.changeAmount();
				break;
			case 4 :	
				this.printFarm();
			case 9 :
				return;
			default : 
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
		
		
	}
	
	public void customerMenu() {
		while(true) {
			System.out.println("******* 고객 메뉴 *******");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 :
				this.buyFarm();
				break;
			case 2 :
				this.removeFarm();
				break;
			case 3 :
				this.printBuyFarm();
				break;
			case 9 :
				return;
			default : 
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
		
	}
	
	public void addNewKind() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			int num = sc.nextInt();
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("수량 : ");
			int quantity = sc.nextInt();
			if(num != 1 && num != 2 && num != 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				
			} else if(num == 1) {
				Fruit fr = new Fruit("과일", name);
				if(fc.addNewKind(fr, quantity)) {
					System.out.println("새 농산물이 추가되었습니다.");
					break;
				}else {
					System.out.println("새 농산물 추가에 실패하였습니다 다시 입력해주세요.");
				}
			} else if(num == 2) {
				Vegetable v = new Vegetable("채소", name);
				if(fc.addNewKind(v, quantity)) {
					System.out.println("새 농산물이 추가되었습니다.");
					break;
				}else {
					System.out.println("새 농산물 추가에 실패하였습니다 다시 입력해주세요.");
				}
			} else if(num == 3) {
				Nut n = new Nut("견과", name);
				if(fc.addNewKind(n, quantity)) {
					System.out.println("새 농산물이 추가되었습니다.");
					break;
				}else {
					System.out.println("새 농산물 추가에 실패하였습니다 다시 입력해주세요.");
				}
			}
			
		}
		
		
	}
	
	public void removeKind() {
		
		while(true) {
			System.out.println("1. 과일/ 2. 채소/ 3. 견과");
			System.out.print("삭제할 종류 번호 : ");
			int num = sc.nextInt();
			System.out.print("이름 : ");
			String name = sc.next();
			if(num != 1 && num != 2 && num != 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				
			} else if(num == 1) {
				Fruit fr = new Fruit("과일", name);
				if(fc.removeKind(fr)) {
					System.out.println("농산물 삭제에 성공하였습니다");
					break;
				}else {
					System.out.println("농산물 삭제에 실패하였습니다.");
				}
			} else if(num == 2) {
				Vegetable V = new Vegetable("채소", name);
				if(fc.removeKind(V)){
					System.out.println("농산물 삭제에 성공하였습니다");
					break;
				}else {
					System.out.println("농산물 삭제에 실패하였습니다.");
				}
			} else if(num == 3) {
				Nut N = new Nut("견과", name);
				if(fc.removeKind(N)){
					System.out.println("농산물 삭제에 성공하였습니다");
					break;
				}else {
					System.out.println("농산물 삭제에 실패하였습니다.");
				}
			}
		}
		
	}
	
	public void changeAmount() {
		while(true) {
			System.out.println("1. 과일/ 2. 채소/ 3. 견과");
			System.out.print("수정할 종류 번호 : ");
			int num = sc.nextInt();
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.println("수정할 수량 : ");
			int amount = sc.nextInt();
			if(num != 1 && num != 2 && num != 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				
			} else if(num == 1) {
				
				
			} else if(num == 2) {
				
			} else if(num == 3) {
				
			}
		}
		
	}
	
	public void printFarm() {
		HashMap<Farm, Integer> farmList = fc.printFarm();
		for (Farm f : farmList.keySet()) {
			
			if(f instanceof Fruit) {
				Fruit tmp = (Fruit)f; 
				System.out.printf("%s: %s(%d개)", tmp.getKind(), tmp.getName(), farmList.get(f));
			} else if (f instanceof Vegetable) {
				Vegetable tmp = (Vegetable)f;
				System.out.printf("%s: %s(%d개)", tmp.getKind(), tmp.getName(), farmList.get(f));
			}else if(f instanceof Nut) {
				Nut tmp = (Nut)f;
				System.out.printf("%s: %s(%d개)", tmp.getKind(), tmp.getName(), farmList.get(f));
			}
			
		
			
		}
		
	}
	
	public void buyFarm() {
		int type = 0;
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.println("구매할 종류 번호 : ");
			
		}
		
	}
	
	public void removeFarm() {
		
	}
	
	public void printBuyFarm() {
		
	}
	
	
	

}
