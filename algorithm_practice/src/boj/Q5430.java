package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q5430 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String order = br.readLine();
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			
			//입력받은 배열 정리
			StringBuilder sb = new StringBuilder(s);
			sb.deleteCharAt(0);
			sb.deleteCharAt(sb.length()-1);
			
			StringTokenizer st = new StringTokenizer(sb.toString(), ",");
			
			Deque<Integer> deq = new LinkedList<Integer>();
			while(st.hasMoreTokens()) {
				deq.add(Integer.parseInt(st.nextToken()));
			}
			
			String ans = "";

			int countR = 0;
			
			loop:
			for(int j=0; j<order.length(); j++) {
				switch(order.charAt(j)) {
				
				case 'R' :
					countR++;
					break;
					
				case 'D' :
					if(deq.size()<=0) {
						ans = "error";
						break loop;
					}
					if(countR%2==0) {
						deq.poll();
					}
					else {
						deq.pollLast();
					}
					break;
				}
			}
			
			StringBuilder sb2 = new StringBuilder();
			if(ans!="error") {
				sb2.append("[");
				while(true) {
					if(countR % 2 == 0) {
						if(deq.size() <= 0) break;
						sb2.append(deq.poll());
						if(deq.size() <= 0) break;
						sb2.append(",");
					}
					else {
						if(deq.size() <= 0) break;
						sb2.append(deq.pollLast());
						if(deq.size() <= 0) break;
						sb2.append(",");
					}
				}
				sb2.append("]");
				ans = sb2.toString();
			}
			
			bw.write(ans+"\n");
			
		}
		bw.flush();
		bw.close();
		
	}

}
