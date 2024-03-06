package test9;

public class Cargoplane extends Plane{
	public Cargoplane() {
		
	}
	
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName,fuelSize);
	}
	
	public void flight(int distance) {
		int a = (distance *5);
		super.setFuelSize(getFuelSize() - a);
	}
	
	@Override
	public String toString() {
		return super.getPlaneName() + "         " + super.getFuelSize() ;
	}
}
