package test9;

public class Airplane extends Plane{
	
	public Airplane() {
		
	}
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	public void flight(int distance) {
		
		int a = (distance*3);
		super.setFuelSize(getFuelSize() - a);
	}

	@Override
	public String toString() {
		return super.getPlaneName() + "        " + super.getFuelSize() ;
	}
	
	
}
