package com.kh.Test240207;

import java.util.HashMap;
import java.util.TreeMap;

public class MemberController {
	HashMap map = new HashMap();
	
	public boolean joinMembership(String id, Member m) {
	
		if(map.get(id) != null) {
			return false;
		}else {
			map.put(id, m);
			
			return true;
		}
		
		
		
	}

	public String logIn(String id, String password) {
		Member m = (Member)map.get(id);
		
		if(m != null) {
			if(m.getPassword().equals(password)) {
				return m.getName();
			}
		}
		
		return null;
		
	}

	
	public boolean changePassword(String id, String oldPw, String newPw) {
		Member m =(Member)map.get(id);
		if (m != null && m.getPassword().equals(oldPw)) {
			m.setPassword(newPw);
			return true;
		}
		
		return false;
	}
	
	
	public void changeName(String id, String newName) {
		if (map.containsKey(id)) {
			Member m = (Member)map.get(id);
			m.setName(newName);
			
		}
	}
	
	public TreeMap sameName(String name) {
		TreeMap result = new TreeMap();
		
		for (Object id : map.keySet()) {// [qwe, asd, j1]
			Member m = (Member)map.get(id);
			if(m.getName().equals(name)) {
				result.put(id, m.getName());
			}
		}
		
		return result;
	}
}
