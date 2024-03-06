package com.kh.study240226;

import java.util.Scanner;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {
		
	}

	public void mainMenu() {
	
		while (true) {
			int member = mc.existMemberNum();
			if (member == 10) {
				System.out.println("최대 등록 가능한 회원 수는 10명입니다.");
				System.out.println("현제 등록된 회원 수는 " + member + "명입니다.");
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				
				
				System.out.println("2. 회원 검색 ");
				System.out.println("3. 회원 정보 수정 ");
				System.out.println("4. 회원 삭제 ");
				System.out.println("5. 모두 출력 ");
				System.out.println("9. 끝내기 ");
				System.out.print("메뉴번호 :  ");
				int menu = sc.nextInt();
				sc.nextLine();
	
				switch (menu) {
				case 2:
					searchMember();
					break;
				case 3 :
					updateMember();
					break;
				case 4 :
					deleteMember();
					break;
				case 5 :
					printAll();
					break;
				case 9 : 
					System.out.println("종료합니다");
					return;
				default : 
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				}		
			} else {
				System.out.println("최대 등록 가능한 회원 수는 10명입니다.");
				System.out.println("현제 등록된 회원 수는 " + member + "명입니다.");
	
				System.out.println("1. 새 회원 등록 ");
				System.out.println("2. 회원 검색 ");
				System.out.println("3. 회원 정보 수정 ");
				System.out.println("4. 회원 삭제 ");
				System.out.println("5. 모두 출력 ");
				System.out.println("9. 끝내기 ");
				System.out.print("메뉴번호 :  ");
				int menu = sc.nextInt();
				sc.nextLine();
	
				switch (menu) {
				case 1:
					insertMember();
					
					break;
				case 2:
					searchMember();
					break;
				case 3 :
					updateMember();
					break;
				case 4 :
					deleteMember();
					break;
				case 5 :
					printAll();
					break;
				case 9 : 
					System.out.println("종료합니다");
					return;
				default : 
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				}
			}
		}

	}

	public void insertMember() {

		String id;
		char gender;
		System.out.println("새 회원을 등록합니다.");
		while (true){
			System.out.print("아이디 : ");
			id = sc.nextLine();
			
			if (mc.checkId(id) == true) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			} else {
				break;
			}
		} 

		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		while (true) {
			System.out.print("성별(M/F) : ");
			gender = sc.next().charAt(0);
			if (gender != 'm' && gender != 'M' && gender != 'f' && gender != 'F') {
				System.out.println("성별을 다시 입력하세요.");
			} else {
				break;
			}
		}

		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		mc.insertMember(id, name, pwd, email, gender, age);
		
	}

	public void searchMember() {
		while(true) {
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1 : 
				searchId();
				return;
			case 2 : 
				searchName();
				return;
			case 3 : 
				searchEmail();
				return;
			case 9 :
				System.out.println("메인으로 돌아갑니다.");
				return;
			default : 
				System.out.println("잘못 입력하셨습니다.");
				return;	
				
			}
		}
	}

	public void searchId() {
		System.out.println("검색할 아이디 : ");
		String id = sc.nextLine();
		String myInfo = mc.searchId(id);
		if(myInfo != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(myInfo);
		}else{
			System.out.println("검색 결과가 없습니다");
		};
		
	}

	public void searchName() {
		System.out.println("검색할 이름 : ");
		String name = sc.nextLine();
		Member[] m = mc.searchName(name);
		if(m != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(m[0].inform());
		}else{
			System.out.println("검색 결과가 없습니다");
		};
	}

	public void searchEmail() {
		System.out.println("검색할 이메일 : ");
		String email = sc.nextLine();
		Member[] m = mc.searchEmail(email);
		if(m != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(m[0].inform());
		}else{
			System.out.println("검색 결과가 없습니다");
		};
		

	}

	public void updateMember() {
		while(true) {
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1 : 
				updatePassword();
				return;
			case 2 : 
				updateName();
				return;
			case 3 : 
				updateEmail();
				return;
			case 9 :
				System.out.println("메인으로 돌아갑니다.");
				return;
			default : 
				System.out.println("잘못 입력하셨습니다.");
				return;	
				
			}
		}

	}

	public void updatePassword() {	
		System.out.println("수정할 회원의 아이디 :");
		String id = sc.nextLine();
		System.out.println("수정할 비밀번호 :");
		String rePwd = sc.nextLine();
		if(mc.updatePassword(id, rePwd)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}

	}

	public void updateName() {
		System.out.println("수정할 회원의 아이디 :");
		String id = sc.nextLine();
		System.out.println("수정할 이름 :");
		String reName = sc.nextLine();
		if(mc.updateName(id, reName)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}

	}

	public void updateEmail() {
		System.out.println("수정할 회원의 아이디 :");
		String id = sc.nextLine();
		System.out.println("수정할 이메일 :");
		String reEmail = sc.nextLine();
		if(mc.updateEmail(id, reEmail)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}

	}

	public void deleteMember() {
		while(true) {
			System.out.println("1. 특정 회원 삭제하기 ");
			System.out.println("2. 모든 회원 삭제하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1 : 
				deleteOne();
				return;
			case 2 : 
				deleteAll();
				return;
			
			case 9 :
				System.out.println("메인으로 돌아갑니다.");
				return;
			default : 
				System.out.println("잘못 입력하셨습니다.");
				return;
				
			}
		}
		
	}

	public void deleteOne() {
		System.out.println("삭제할 회원 아이디 : ");
		String id = sc.nextLine();
		System.out.println("정말 삭제하시겠습니까?(y/n) : ");
		char c = sc.next().charAt(0);
		
		if(c == 'y' || c == 'Y') {
			if(mc.delete(id)) {
				System.out.println("성공적으로 삭제하였습니다.");
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		} else if (c == 'n' || c == 'N') {
			System.out.println("메인메뉴로 돌아갑니다.");
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
		
		
	}

	public void deleteAll() {
		System.out.println("정말 삭제하시겠습니까?(y/n) : ");
		char c = sc.next().charAt(0);
		if(c == 'y' || c == 'Y') {
			 mc.delete();
			 System.out.println("성공적으로 삭제하였습니다.");
		} else if (c == 'n' || c == 'N') {
			System.out.println("메인메뉴로 돌아갑니다.");
		}else {
			System.out.println("잘못 입력하였습니다.");
		}
	}

	public void printAll() {
		mc.printAll();
	}

}
