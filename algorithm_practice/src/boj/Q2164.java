package boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Queue<Integer> que = new LinkedList<Integer>();
		for(int i=1; i<=n; i++) {
			que.add(i);
		}
		
		while(true) {
			if(que.size() <= 1) break;
			que.poll();
			int a = que.poll();
			que.add(a);
		}
		
		System.out.println(que.poll());
		
	}

}
