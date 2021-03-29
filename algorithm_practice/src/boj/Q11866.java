package boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q11866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		Queue<Integer> que = new LinkedList<Integer>();
		
		for(int i=1; i<=n; i++) {
			que.add(i);
		}
		StringBuilder sb = new StringBuilder();
		
		
		while(true) {
			if(que.size() == 0) break;
			for(int i=0; i<k-1; i++) {
				que.add(que.poll());
			}
			sb.append(que.poll() + " ");
		}
		StringTokenizer st = new StringTokenizer(sb.toString());
		
		System.out.print("<" + st.nextToken());
		while(true) {
			if(!st.hasMoreTokens()) break;
			System.out.print(", " + st.nextToken());
		}
		System.out.print(">");
	}

}
