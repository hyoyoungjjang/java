package baekjoon;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 숫자카드2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Deque<Integer> d = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String stt = st.nextToken();
			if(stt.equals("push")) {
				d.add(Integer.parseInt(st.nextToken()));
			} else if (stt.equals("pop")) {
				if(d.isEmpty()) {
					bw.write(-1 + "\n");
				}else {
					bw.write(d.pop() + "\n");
				}
			} else if(stt.equals("size")){
				bw.write(d.size() + "\n");	
			} else if(stt.equals("empty")) {
				if(d.isEmpty()) {
					bw.write(1 + "\n");
				} else {
					bw.write(0 + "\n");
				}
			} else if(stt.equals("front")) {
				if(d.isEmpty()) {
					bw.write(-1 + "\n");
				}else {
					bw.write(d.getFirst() + "\n");
				}
			} else if(stt.equals("back")) {
				if(d.isEmpty()) {
					bw.write(-1 + "\n");
				}else {
					bw.write(d.getLast() + "\n");
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
