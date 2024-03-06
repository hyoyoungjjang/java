package tset10;

public class Sales extends Employee implements Bonus{
	
	
	
	public Sales() {
		
	}
	
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	public double tax() {
			
			return super.getSalary() * 0.13;
	}
	
	
	public void incentive(int pay) {
		this.setSalary((int)(pay * 1.2) + this.getSalary());
	}

	@Override
	public String toString() {
		return super.getName() + "   " + super.getDepartment() + "   " + super.getSalary() ;
	}
	
	
}
