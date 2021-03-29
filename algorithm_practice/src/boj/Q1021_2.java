package boj;

import java.util.LinkedList;
import java.util.Scanner;

public class Q1021_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		LinkedList<Integer> deq = new LinkedList<Integer>();
		for(int i=1; i<=n; i++) {
			deq.add(i);
		}
		
		int count = 0;
		for(int i=0; i<m; i++) {
			int x = sc.nextInt();
			
			while(true) {
				if(deq.getFirst() == x) {
					deq.remove();
					break;
				}
				
				if(deq.indexOf(x) <= deq.size()/2) {
					deq.add(deq.remove());
					count++;
				}
				else {
					deq.add(0, deq.remove(deq.size()-1));
					count++;
				}
			}
			
		}
		System.out.println(count);
		
	}

}
