package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); 
		Queue<Integer> q = new LinkedList<Integer>();
		Stack<Integer> s = new Stack<Integer>(); 
		
		int num = 1;
		int result = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int z = Integer.parseInt(st.nextToken());
			
			q.add(z);
		}
		
		while(!q.isEmpty()) {
			
			if(!q.isEmpty() && q.peek() == num) {
				q.remove();
				num++;				
			} else if(!s.isEmpty() && s.peek() == num) {
				s.pop();
				num++;
			}else{
				s.push(q.poll());
			}	
		}
		
		while(!s.isEmpty()) {
			if(s.peek() == num) {
				s.pop();
				num++;
			} else {
				break;
			}
		}
		
		if(q.isEmpty() && s.isEmpty()) {
			result = 1;
		}
		
		if(result == 0) {
			bw.write("Sad");
		} else {
			bw.write("Nice");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}




