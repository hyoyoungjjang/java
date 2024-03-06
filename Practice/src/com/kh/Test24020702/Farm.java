package com.kh.Test24020702;

import com.kh.Test2402062.Lottery;

//Model : VO(value object) 데이터를 저장하는 객체
public class Farm {
	private String kind;

	public Farm() {
		super();
	}

	public Farm(String kind) {
		super();
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Farm [kind=" + kind + "]";
	}

	@Override
	public int hashCode() {
		String str = this.kind;
		return str.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Farm) {
			Farm other  = (Farm)obj;
			if(this.getKind().equals(other.getKind())){
				
				return true;
			}else {
				return false;
			}
		} 
		return false;
	}
	
	
}
