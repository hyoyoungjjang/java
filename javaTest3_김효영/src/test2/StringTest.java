package test2;

public class StringTest {
	public static void main(String[] args) {
		String str = "1.22, 4.12, 5.93, 8.71, 9.34";
		double date[] = new double[5];
		double sum = 0;
		
		
		String[] st = str.split(",");
		
//		for(int i = 0; i <date.length; i ++) {
//			date[i] = Double.parseDouble(st[i]);
//			
//			sum += date[i];
//		}
		int index = 0;
		for(String s : st) {
			date[index] = Double.parseDouble(s);
			sum += date[index++];
		}
			
		double avg = sum / index;
		System.out.printf("합계 : %.3f", sum);
		System.out.println();
		System.out.printf("평균 : %.3f", avg);
	}

}
