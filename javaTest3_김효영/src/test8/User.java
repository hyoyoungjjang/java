package test8;

public class User {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	
	public User() {
		super();
	}


	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	public boolean equals(Object obj) {
		
		if (obj instanceof User) {
			User copy = ((User)obj);
			if(copy.getAge() == this.age &&  copy.getGender() == this.gender && copy.id.equals(this.id)
					&& copy.password.equals(this.password) && copy.name.equals(this.name) &&
					copy.phone.equals(phone)) {
				return true;
			}	
		} 
		return false;	 
	}
	
	
	public Object clone() {
		User newUser = new User(this.id, this.password,this.name,this.age,this.gender,this.phone);
		return newUser;
	}
	
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return  id+ " " +  password+ " " +  name+ " " + age+ " " +  gender+ " " + phone+ " "  ;
	}
	
	
	
	
	
}
