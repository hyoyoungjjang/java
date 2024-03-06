package com.kh.Test24020702;

public class Vegetable extends Farm{
	private String name;

	public Vegetable() {
		super();
	}

	public Vegetable(String kind ,String name) {
		super(kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vegetable [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		String str = super.getKind() + this.name;
		return str.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Vegetable) {
			Vegetable other  = (Vegetable)obj;
			if(this.getName().equals(other.getName() ) &&
					this.getKind().equals(other.getKind() )){
				return true;
			}else {
				return false;
			}
		} 
		return false;
	}
	
	

}
