package tset10;

public class Secretary extends Employee implements Bonus  {

	
	public Secretary() {
		
	}
	
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department,salary);
	}
	
	public double tax() {
		
		return super.getSalary() * 0.1;
	}
	
	
	public void incentive(int pay) {
		this.setSalary((int)(pay * 0.8) + this.getSalary());
	}

	@Override
	public String toString() {
		return super.getName() + "   " + super.getDepartment() + "   " + super.getSalary() ;
	}

	
	
	
}
