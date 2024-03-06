package test01;

import java.util.Scanner;

public class MusicView {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.println("메뉴번호 선택 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: 
				this.addList();
				break;
			case 2: 
				this.addAtZero();
				break;
			case 3: 
				this.printAll();
				break;
			case 4: 
				this.searchMusic();
				break;	
			case 5: 
				this.removeMusic();
				break;
			case 6: 
				this.setMusic();
				break;
			case 7: 
				this.ascTitle();
				break;
			case 8: 
				this.descSinger();
				break;
			case 9: 
				System.out.println("종료");
				return;
			
			}
		}
	}
	
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.println("곡 명 : ");
		String title = sc.nextLine();
		System.out.println("가수 명 : ");
		String singer = sc.nextLine();
		
		Music m =new Music(title, singer);
		mc.addList(m);
		
	}
	
	public void addAtZero() {
		
	}
	
	public void printAll() {
		
	}
	
	public void searchMusic() {
		
	}
	
	public void removeMusic() {
		
	}
	
	public void setMusic() {
		
	}
	
	public void ascTitle() {
		
	}
	
	public void descSinger() {
		
	}
}
