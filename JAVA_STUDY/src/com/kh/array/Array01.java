package com.kh.array;

import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		/* 변수선언방법 :    자료형 변수이름; ex) int num;
		 *                변수이름 = 값;      num = 5;
		 * 배열선언방법 :    자로형[] 배열이름; ex) int[] arr;
		 * 				  배열이름 = new 자료형[길이];   arr = new int[10];
		 * 
		 * 배열을 실제 사용할 때  -> index값을 이용해서 사용함
		 * index값은 0부터 (길이-1)까ㅓ지         
		 */
		
		
//		int[] arr = new int[10];
//		arr[0] = 10;
//		arr[1] = 45;
//		
//		//1차원 배열은 보통 for문과 함계 많이 사용된다.
//		//필수로 알아둬야하는 공식 -> 배열의 모든 index값에 순차적으로 접근할 수 있는 방법
//		// 1. for(int i = 0; i < arr.length; i++){실행할 코드}
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*5+2);
//		}
//		// 2. for(int n : 배열) {실행할 코드}
//		for(int n : arr) {
//			System.out.println(n);
//		}
//		
//		double[] arr1 = new double[5];
//		for(int i = 0; i < arr1.length; i++) {
//			arr1[i] = 3.14;
//			System.out.println(arr1[i]);
//		}
		
		Scanner sc = new Scanner(System.in);
		//코드업 1095
//		int count = sc.nextInt();
//		sc.nextLine();
//		 
//		int[] numArr = new int[23];
//		
//		for(int i  = 0; i < count; i++) {
//			numArr[sc.nextInt() - 1] ++;
//		}
//		
//		for(int i = 0; i < numArr.length; i++) {
//			System.out.print(numArr[i]+" ");
			
			
	//	}
		
		
		//1095 1402 1409 1411 1440
		
		
		//코드업 1402
	
//		int count = sc.nextInt();
//		int[] arr = new int[count];
//		
//		for(int i = 0; i <arr.length; i++) {
//			
//			arr[i] = sc.nextInt();
//			
//		}
//		
//		for(int i = count - 1; i >= 0; i--) {
//		System.out.print(arr[i] + " ");
//		}
		
		//코드업 1409
		
		
//		int[] arr = new int[10];
//		//[10 9 8 7 6 5 4 3 2 1]
//		// 1  2 3 4 5 6 7 8 9 10
//		// 0  1 2 ...
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		System.out.println(arr[sc.nextInt() - 1]);
//		
		
		//1411
		
//		int n = sc.nextInt();
//		int[] a = new int[n-1];
//		int[] b = new int[n];
//		int aSum=0,bSum=0;
//		for(int i = 0; i < a.length; i++) {
//			a[i] = sc.nextInt();
//			aSum += a[i];
//		}
//		for(int i = 0; i<b.length; i++) {
//			b[i]= i+1;
//			bSum += b[i];
//		}
//		System.out.println(bSum - aSum);
		
		
	  //1440
		
		
		
		
	}

}
