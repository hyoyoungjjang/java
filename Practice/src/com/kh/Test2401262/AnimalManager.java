package com.kh.Test2401262;

public class AnimalManager{
	/*
	 * 추상클래스
	 * - 미완성된 클래스
	 * - 객체생성이 불가(단, 레퍼런스 변수(참조변수)선언 가능)
	 * - 일반필드 + 일반메소드 [+추상메소드]
	 * => 추상메소드를 가진 클래스는 반드시 추상클래스로 명시해야됨
	 * 
	 * *추상메소드가 궂이 없어도 추상클래스를 사용할 수 있을까? ok
	 *  > 개념적 : 단지 이 클래스가 미완성된 클래스다 라는 걸 알리기 위해서
	 *  > 프로그래밍적 : 객체 생성이 불가 하게끔 하고자 할 때
	 *  
	 *  *추상메소드가 있는 추상클래스를 사용하는 이유
	 *   - 부모클래스에 추상메소드가 존재할 경우
	 *     자식클래스에서는 강제로 오버라이딩 해서 동일한 패턴의 메소드를 가지게 된다.
	 *     => 각 자식 클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면 할 때
	 */
	
	public static void main(String[] args) {
		
		Animal[] arr = new Animal[5];
		arr[0] = new Cat("민수","먼치킨","서울","검은색");
		arr[1] = new Dog("개똥이","시고르자브종",15);
		arr[2] = new Dog("뽀삐","말티푸", 3);
		arr[3] = new Cat("지렁이","스코티쉬폴드","부산","노란색");
		arr[4] = new Dog("만식이","푸들",10);
			
		/*
		for(int i = 0; i < arr.length; i++) {
			arr[i].speak();
		}
		*/
		for(Animal a : arr) {
			a.speak();
		}
	}
}
