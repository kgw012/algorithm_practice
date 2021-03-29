package boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Document{
	int imp;
	int idx;
	
	public Document(int idx ,int imp) {
		this.imp = imp;
		this.idx = idx;
	}
}

public class Q1966 {
	
	private static boolean isPeekImpMax(Queue<Document> que) {
		int max = que.peek().imp;
		for(int i=0; i<que.size(); i++) {
			if(max < que.peek().imp) max = que.peek().imp;
			que.add(que.poll());
		}
		return max==que.peek().imp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		int[] ans = new int[test];
		for(int i=0; i<test; i++) {
			Queue<Document> que = new LinkedList<Document>();
			int n = sc.nextInt();
			int idx = sc.nextInt();
			for(int j=0; j<n; j++) {
				Document doc = new Document(j, sc.nextInt());
				que.add(doc);
			}
			
			int count = 0;
			while(true) {
				if(isPeekImpMax(que)) {
					if(que.peek().idx == idx) {
						que.poll();
						count++;
						break;
					}
					else {
						que.poll();
						count++;
					}
				}
				else {
					que.add(que.poll());
				}
			}
			ans[i] = count;
		}
		
		for(int i : ans) {
			System.out.println(i);
		}
		
	}

}