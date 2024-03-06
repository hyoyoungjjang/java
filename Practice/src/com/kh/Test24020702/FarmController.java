package com.kh.Test24020702;

import java.util.ArrayList;
import java.util.HashMap;


// Controller :  사용자가 요청한 내용을 처리한 후 그 결과를 돌려주는 역활
public class FarmController {
	HashMap<Farm, Integer> hMap = new HashMap<>();
	ArrayList<Farm> list = new ArrayList<>();
	
	public boolean addNewKind(Farm f, int amount) {
		if(hMap.containsKey(f)) {
			return false;
		} else {
			hMap.put(f, amount);
			return true;
		}
		
		
	}
	
	public boolean removeKind(Farm f) {
		if(hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
		}else {
		return false;
		}
	}
		
	
	public boolean changeAmount(Farm f, int amount) {
		
		return false;
	}
	
	public HashMap<Farm, Integer>printFarm(){
		
		return hMap;
	}
	
	public boolean buyFarm(Farm f) {
		Integer amount = hMap.get(f);
		if (amount != null && amount > 0) {
			list.add(f);
			hMap.replace(f, amount - 1);
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean removeFarm(Farm f) {
		
		return false;
	}
	
	public ArrayList<Farm> printBuyFarm(){
		
		return null;
	}
	
}
