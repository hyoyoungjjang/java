package tset10;

public class Company {
	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
	
		// 1번의 사용 데이터를 기반으로 객체를 생성하여 배열에 넣는다 . 
		// String name, int number, String department, int salary
		
		employees[0] = new Secretary("Hilery", 1,"secretary",800 );
		employees[1] = new Sales("Clinten", 2,"sales",1200 );
		System.out.println("name    department     salary");
		System.out.println("-------------------------------");
		// 모든 객체의 기본 정보를 출력한다 (for 문을 이용하여 출력한다.) 
		for(int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].toString());
			System.out.println();
		}
		// 모든 객체에 인센티브 100 씩 지급한 급여를 계산하고 다시 객체의 salary에 넣는다
		System.out.println("인센티브 100 지급");
		System.out.println("name     department     salary     tax");
		System.out.println("--------------------------------------");
		for (Employee e : employees) {
			if (e instanceof Secretary) {
				((Secretary)e).incentive(100);
			}else if(e instanceof Sales) {
				((Sales)e).incentive(100);
			}
		}
		// 모든 객체의 정보와 세금을 출력한다 (for 문을 이용하여 출력한다.)
		System.out.println(employees[0].toString() + "   " + employees[0].tax());
		System.out.println(employees[1].toString() + "   " + employees[1].tax());
	}
}
