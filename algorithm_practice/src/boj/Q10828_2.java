package boj;

import java.util.Scanner;
import java.util.Stack;

public class Q10828_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack<>();
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			String order = sc.next();
			
			switch(order) {
			case "push" :
				int push = sc.nextInt();
				stk.push(push);
				break;
			
			case "pop" :
				int pop = stk.isEmpty()?-1:stk.pop();
				System.out.println(pop);
				break;
				
			case "size" :
				int size = stk.size();
				System.out.println(size);
				break;
				
			case "empty" :
				int isEmpty = stk.isEmpty()?1:0;
				System.out.println(isEmpty);
				break;
				
			case "top" :
				int top = stk.isEmpty()?-1:stk.peek();
				System.out.println(top);
				break;
			}
			
		}
	}

}
