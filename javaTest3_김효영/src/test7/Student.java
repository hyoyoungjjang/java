package test7;

public class Student extends Human{
	private String number;
	private String major;
	
	public Student() {
		super();
	}

	public Student(String name, int age, int heigh, int weigh, String number, String major) {
		super(name, age, heigh, weigh);
		this.number = number;
		this.major = major;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return  super.getName() + " " + super.getAge() +
				" " + super.getHeigh() + " " + super.getWeigh() + " " + number + " " + major ;
	}
	
	
	
	
	
}
