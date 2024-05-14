package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;


public class 키로거 {	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Character> left = new LinkedList<>();
		Deque<Character> right = new LinkedList<>();
		
		int l = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < l; i++) {
			String s = br.readLine();
			for(int j = 0;  j < s.length(); j++) {
				char c = s.charAt(j);
				if(c == '<') {
					if(!left.isEmpty()) right.addFirst(left.pollLast());
				} else if(c == '>') {
					if(!right.isEmpty()) left.addLast(right.pollFirst());
				} else if(c == '-') {
					if(!left.isEmpty()) left.pollLast();
				} else {
					left.addLast(c);
				}
			}
//			for(char result : left) {
//				bw.write(result);
//			}
//			for(char result : right) {
//				bw.write(result);
//			}
			
			while(!left.isEmpty()) {
				bw.write(left.pollFirst());
			}
			while(!right.isEmpty()) {
				bw.write(right.pollFirst());
			}
			bw.write("\n");
		}
		// 1. < asfasdf | vawefqw (1) left 빼기 (2) right로 삽입
		// 2. > 반대
		// 3. - left 빼기
		// 4. a left에 삽입
		
		bw.flush();
		bw.close();
		br.close();
	}
}




