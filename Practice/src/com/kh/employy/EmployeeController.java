package com.kh.employy;
/*
 * 실제 정보를 넘겨받아서 사원에대한 정보를 저장하거나 반환해주는 역활
 */
public class EmployeeController {
	private Employee[] emList = new Employee[100];
	

		
	
	
	//insert =>사원을 배열에 추가해주는 메소드
	public void insert(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		for (int i = 0; i < this.emList.length; i++) {
			if (emList[i] == null) {
				emList[i] = new Employee(empNo, name, gender, phone, dept, salary, bonus);
				break;
			}
		}
	}
	
	public void printEmpList() {
		System.out.println("========사원 목록=======");
		for(int i = 0; i<this.emList.length; i++) {
			if(emList[i] == null) {
				break;
			}
			System.out.println(emList[i].toString());
		}
	}
	
	
	public void deleteEmp() {
		if (emList[0] == null) {
			System.out.println("삭제할 사원이 없습니다.");
			return;
		}
		
		/*
		int i = 0;
		while(i != (emList.length - 1) && emList[i] != null) {
			i++;
		}
		
		System.out.println("삭제된 사원 정보 : " + emList[i - 1].toString());
		emList[i - 1] = null;
		*/
		
		for(int i = 0; i < emList.length; i++) {
			if (emList[i] == null) {
				System.out.println("삭제된 사원 정보 : " + emList[i - 1].toString());
				emList[i - 1] = null;
				break;
			} else if(i == (emList.length - 1)) {
				System.out.println("삭제된 사원 정보 : " + emList[i].toString());
				emList[i] = null;
			}
		}
		
	
	}
	
	public void outputEmp(int empNo) {
	
		for(int i = 0; i < emList.length; i++) {
			if (emList[i] == null) {
				break;
			} else if(empNo == emList[i].getEmpNo()) {
				System.out.println(emList[i].toString());
				break;
			}else if(i == emList.length - 1){
				System.out.println(empNo + "번의 사원번호를 가진 사원이 없어요.");
			} 
		}
		
	}
	
	
	// empNo에 해당하는 근로자 삭제
	public void deleteEmpByEmpNo(int empNo) {
		for(int i = 0; i < emList.length; i++) {
			if(emList[i] == null) {
				System.out.println(empNo+"번 근로자를 찾을 수 없습니다.");
				break;
			} else if(emList[i].getEmpNo() == empNo) {//근로자목록에서 empNo가 일치하는 근로자를 찾음
				emList[i] = null;
				
				for(int j = i; j < emList.length; j++) {
					if(j+1 == emList.length) {
					emList[j] = null;
					break;
					}	
					emList[j] = emList[j+1];
				}	
				
				System.out.println(empNo + "번 근로자를 삭제하였습니다.");
				break;
			}
		}
	}
	
	
	
	
	
}
	

