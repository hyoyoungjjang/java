package test9;

public class PlaneTest {
	public static  void main(String[] args) {
		
		// Airplane 과 Cargoplane 객체 생성 
		Airplane ai = new Airplane("L747", 1000);
		Cargoplane ca = new Cargoplane("C40", 1000);
		 // 생성된 객체의 정보 출력 
		System.out.println("Plane        fuelSize");
		System.out.println("----------------------------");
		System.out.println(ai.toString());
		System.out.println(ca.toString());
		 // Airplane 과 Cargoplane 객체에 100 씩 운항 
		System.out.println("100  운항");
		ai.flight(100);
		ca.flight(100);
		System.out.println("Plane        fuelSize");
		System.out.println("----------------------------");
		 // 100 운항 후 객체 정보 출력 
		System.out.println(ai.toString());
		System.out.println(ca.toString());
		 //Airplane 과 Cargoplane 객체에 200 씩 주유
		System.out.println("200 주유");
		ai.refuel(200);
		ca.refuel(200);
		System.out.println("Plane        fuelSize");
		System.out.println("----------------------------");
		 // 200 주유 후 객체 정보 출력
		System.out.println(ai.toString());
		System.out.println(ca.toString());
	}

}
