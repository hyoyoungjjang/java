package com.kh.Test24020702;

public class Fruit extends Farm{
	private String name;


	public Fruit() {
		super();
	}



	public Fruit( String kind ,String name) {
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
		return "Fruit [name=" + name + "]";
	}



	@Override
	public int hashCode() {
		String str = super.getKind() + this.name;
		return str.hashCode();
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Fruit) {
			Fruit other  = (Fruit)obj;
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
