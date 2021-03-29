package boj;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Q1021 {
	
	private static boolean isLeftShift(Deque<Integer> deq, int x) {
		
		Deque<Integer> deqClone = new LinkedList<Integer>();
		for(int i=0; i<deq.size(); i++) {
			int peek = deq.peek();
			deqClone.add(peek);
			deq.add(deq.pollFirst());
		}
		
		boolean left = true;
		
		while(deqClone.size()>=0) {
			if(deqClone.pollFirst() == x) break;
			else if(deqClone.pollLast() == x) {
				left = false;
				break;
			}
		}
		
		return left;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> deq = new LinkedList<Integer>();
		
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			deq.addLast(i);
		}
		int m = sc.nextInt();
		int count = 0;
		for(int i=0; i<m; i++) {
			int x = sc.nextInt();
			
			if(isLeftShift(deq, x)) {
				while(true) {
					if(deq.peek() == x) {
						deq.poll();
						break;
					}
					deq.add(deq.poll());
					count++;
				}
			}
			else {
				while(true) {
					if(deq.peek() == x) {
						deq.poll();
						break;
					}
					deq.addFirst(deq.pollLast());
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

}
