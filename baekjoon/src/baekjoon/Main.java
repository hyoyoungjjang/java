package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<Integer, Integer> hm = new HashMap<>();
		StringTokenizer st; 
		
		int n = Integer.parseInt( br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		    
		for(int i = 0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(!hm.containsKey(a)) {
				hm.put(a,1);
			} else {
				hm.put(a, hm.get(a)+1);
			}	
		}
		
		int m = Integer.parseInt( br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i<m; i++) {
			
			int a = Integer.parseInt(st.nextToken());
			if(!hm.containsKey(a)) {
				bw.write(0 + " ");
			} else {
				bw.write(hm.get(a) + " ");   
			}	
		}
	
		bw.flush();
		bw.close();
		br.close();
	}	
}


