package test7;

public class Human {
	private String name;
	private int age;
	private int heigh;
	private int weigh;
	
	public Human() {
		super();
	}

	public Human(String name, int age, int heigh, int weigh) {
		super();
		this.name = name;
		this.age = age;
		this.heigh = heigh;
		this.weigh = weigh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeigh() {
		return heigh;
	}

	public void setHeigh(int heigh) {
		this.heigh = heigh;
	}

	public int getWeigh() {
		return weigh;
	}

	public void setWeigh(int weigh) {
		this.weigh = weigh;
	}
	

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", heigh=" + heigh + ", weigh=" + weigh + "]";
	}
	
	
	
	
	
}
