package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static char[][] arr;
	public static  int resultMin = 2501;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new char[n][m];
		String s;
		
		
		for(int i = 0; i < n; i++) {
			s = br.readLine();
			for(int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(j);
			}
		}						
		for(int z = 0; z <= arr.length-8; z++) {				
			for(int x =0; x <= arr[0].length-8; x++) {
				resultMin = Math.min(resultMin, getArr(z,x));
			}
		}
		System.out.println(resultMin);	
	}
	
	
	public static int getArr(int row, int col) {
		int resutl = 0;
		int black = 0;
		int white = 0;
		for(int i =0; i < 8; i++) {
			for(int j =0; j < 8; j++) {
				if((i+j)%2==0) {
					if(arr[row+i][col+j] == 'B') {
						white++;		
					}else {
						black++;
					}
				}else {
					if(arr[row+i][col+j] == 'W') {
						white++;
					}else {
						black++;
					}	
				}
			}
		}
		resutl = Math.min(black, white);	
		return resutl;
	}
}


