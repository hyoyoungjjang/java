package com.kh.employy;
import java.util.Scanner;
public class Run {
	public static void main(String[] args) {
		
		new EmployeeMenu().EmployeeMainMenu();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		//number라는 변수에 int형 값을 하나 입력받아 출력해라
		int number;
		
		
		// 입력받은 값 number가 100보다 작은 정수이면 "100이하" 출력
		//100이면 "100" 100이상이면 "100을 초과하였씁니다.다시입력해주세요"를 출력한 후
		// 100이하가 입력될 때 까지 반복한다.
		
		do {
			System.out.println("정수 하나 입력 : ");
			number = sc.nextInt();
			
			if(number == 100) {
				System.out.println("100");
			}else if (number<100) {
				System.out.println("100이하");
			}else {
				System.out.println("100을 초과하였습니다. 다시 입력헤주세요");
			}
			
		}while(number >100);
		
		
		//1부터 입력받은 number까지의 값을 전부 더한 값을 구해라
		//ex) number = 5 1+2+3+4+5 => 15출력
		int sum = 0;
		
		for(int i =1; i <= number; i++) {
			sum += i;
		}
		System.out.println("nuber = "+number + " 총합 : "+sum);
		
		
		//길이가 number인 int형 1차원배열 arr을 생성하고
		//1~number까지의 수를 순서대로 배열에 저장하고 출력해라
		
		int[] arr = new int[number];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		for(int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
		System.out.println();
		
		//Employee클래스를 작성하라
		//empNo(int) name(String) gender(char) phone(String)
		// getter/setter 및 toString 작성
		
		
		
		//Employee를 답을 수 있는 길이가 5인 객체배열을 생성하고 임의에 값으로 객체5개를 생성해
		//각 배열의 인덱스값을 초기화해라
		
		Employee[] em = new Employee[5];
		
		em[0] = new Employee(1,"김효영",'m',"010-8589-0930");
		em[1] = new Employee(2,"고미희",'f',"010-9179-7467");
		em[2] = new Employee(3,"김태완",'m',"010-8756-7467");
		em[3] = new Employee(4,"김효강",'m',"010-4107-0817");
		em[4] = new Employee(5,"김보민",'f',"모름");
		
		for(int i = 0; i < em.length; i++) {
			System.out.println(em[i]);
		}
		*/
	}

}
