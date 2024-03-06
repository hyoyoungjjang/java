package test6;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data;
		Calculator ca = new Calculator ();

		
		System.out.print("정수(2~5) 입력 :");
		data = sc.nextInt();
		
		try {
			System.out.println(ca.getSum(data));
		} catch (InvalidException e) {
			System.out.println(e.getMessage());
		
		}
		
	}
}
