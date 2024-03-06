package com.kh.Test240206;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
		
	
	public void mainMenu() {
		int choice;
		System.out.println("== Welcome KH Library");
		System.out.println();
		do {
			System.out.println("******* 메인 메뉴 *******");
			
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 : 
				this.insertBook();
				break;
			case 2 :
				this.selectList();
				break;
			case 3 :
				this.searchBook();
				break;
			case 4 :
				this.deleteBook();
				break;
			case 5 : 
				this.ascBook();
				break;
			case 9 : 
				System.out.println("종료");
				return;
			default : 	
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				break;
			}
		}while(choice != 9);
		
		
	}
	
	public void insertBook() {
		System.out.println("책 정보를 입력해주세요");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int category = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		
		Book bk;
		String category2 = null;
		
		if(category == 1) {
			category2 = "인문";
		}else if(category == 2) {
			category2 = "과학";
		}else if(category == 3) {
			category2 = "외국어";
		}else if(category == 4) {
			category2 = "기타";
		}
		bk = new Book( title,  author,  category2,  price);
		bc.insertBook(bk);
		
	}
	
	public void selectList() {
		System.out.println("===== 도서 전체 조회 =====");
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다");
		} else {
			for(Book book : bookList) {
					System.out.println(book);
			}
		}
	}
		
		

	
	public void searchBook() {
		System.out.println("===== 도서 검색 =====");
		System.out.print("검색 키워드 : ");
		String Keyword = sc.nextLine();
		ArrayList<Book> searchList = bc.searchBook(Keyword);
		
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Book book : searchList) {
					System.out.println(book);
			}
		}
		
	}
	
	public void deleteBook() {
		System.out.println("===== 도서 삭제 =====");
		System.out.println("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.println("삭제할 저자 명 : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		if(remove != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		
		
	}
	
	public void ascBook() {
		int result = bc.ascBook();
		if (result == 1) {
			System.out.println("정렬에 성고하였습니다");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}
