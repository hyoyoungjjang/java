package com.kh.study240226;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	public int existMemberNum() {
		int count = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				count ++;
			} else {
				return count;
			}
		}
		return count;
	}
	
	public Boolean checkId(String inputId) {
		boolean bo = false;
		for(int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				break;
			}else if(m[i].getId().equals(inputId)) {
				bo = true;
			}	
		} 
		return bo;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
		
	}
	
	public String searchId(String id) {
		for(int i = 0; i<m.length; i++) {
			if(m[i] == null) { 
				return null;		
			} else if ( m[i].getId().equals(id)) {
				return m[i].inform();
			}
		} 
		return null;
	}
	
	public Member[] searchName(String name) {
		Member[] mm = new Member [1];
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				return null;
			} else if (m[i].getName().equals(name)) {
				mm[0] = m[i];
				return mm;
			}	
		}
		return null;
	}
	
	public Member[] searchEmail(String email) {
		Member[] mm = new Member [1];
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				return null;
			} else if(m[i].getEmail().equals(email)) {
				mm[0] = m[i];
				return mm;
			}
		}
		return null;
	}
	
	public Boolean updatePassword(String id, String password) {
		for(int i = 0; i<m.length; i++) {
			if(m[i] == null) {
				return false;
			} else if (m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		return false;
	}
	
	public Boolean updateName(String id, String name) {
		for(int i = 0; i<m.length; i++) {
			if(m[i] == null) {
				return false;
			} else if (m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}
	
	public Boolean updateEmail(String id, String email) {
		for(int i = 0; i<m.length; i++) {
			if(m[i] == null) {
				return false;
			} else if (m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}
	
	public Boolean delete(String id) {
		for(int i = 0; i<m.length; i++) {
			if(m[i] == null) {
				return false;   
			} else if (m[i].getId().equals(id)) {
				m[i] = null;
				for(int a = i; i<m.length; i++) {
					if(m[a] == null)
					m[a] = m[a+1];
					m[a+1] = null;
				}	
				return true;
			}
		}
		return false;
	}
	
	public void delete() {
		for(int i = 0; i<m.length; i++) {	
			m[i] = null;
		
		}
	}
	
	public void printAll() {
		if(m[0] == null) {
			System.out.println("저장된 회원이 없습니다.");
		}
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				System.out.println(m[i].inform());
			}
			
		}
	
	}
}
