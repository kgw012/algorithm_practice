package boj;

import java.util.Scanner;
import java.util.Stack;

public class Q10773 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack<>();
		
		int k = sc.nextInt();
		for(int i=0; i<k; i++) {
			int n = sc.nextInt();
			if(n==0) {
				stk.pop();
			}
			else {
				stk.push(n);
			}
		}
		
		int x = stk.size();
		int sum = 0;
		for(int i=0; i<x; i++) {
			sum+=stk.pop();
		}
		System.out.println(sum);
	}

}