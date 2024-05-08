package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 하노이의탑 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int count = 0;
	public static void main(String[] args) throws IOException{
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); 
		int first = 1;
		int two = 2;
		int three = 3;
		hanoi(n,first, two, three);
		bw.write(count + "\n");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void hanoi(int n, int a, int b, int c) throws IOException {
	
		if(n == 1) {
			count++;
			sb.append(a + " " + c + "\n");
			return;
		} else {
			hanoi(n-1,a,c,b);
			hanoi(1,a,b,c);
			hanoi(n-1,b,a,c);
		}
		
	}
	
}




