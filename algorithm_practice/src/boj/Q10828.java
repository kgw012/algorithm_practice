package boj;

import java.util.Scanner;

public class Q10828 {

	private static class IntStack{
		private int ptr;
		private int max;
		private int[] stk;
		
		//예외 : 꽉 찼을 때
		public class OverflowIntStackException extends RuntimeException {
			public OverflowIntStackException() {}
		}
		
		//예외 : 비었을 때
		public class EmptyIntStackException extends RuntimeException {
			public EmptyIntStackException() {}
		}
		
		//생성자
		public IntStack(int capacity) {
			ptr = 0;
			max = capacity;
			stk = new int[max];
		}
		
		//push
		public int push(int x) throws OverflowIntStackException {
			if(ptr >= max)
				throw new OverflowIntStackException();
			return stk[ptr++] = x;
		}
		
		//pop
		public int pop() throws EmptyIntStackException {
			if(ptr <= 0)
				throw new EmptyIntStackException();
			return stk[--ptr];
		}
		
		//size
		public int size() {
			return ptr;
		}
		
		//empty
		public int empty() {
			if(ptr <= 0)
				return 1;
			return 0;
		}
		
		//top
		public int top() {
			if(ptr <= 0)
				return -1;
			return stk[ptr-1];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack stk = new IntStack(10000);
		
		int n = sc.nextInt();
		StringBuilder s = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			String order = sc.next();
			
			switch(order) {
			case "push" :
				int num = sc.nextInt();
				stk.push(num);
				break;

			case "pop" :
				try {
					s.append(stk.pop() + "\n");
				} catch(IntStack.EmptyIntStackException e) {
					s.append("-1\n");
				}
				break;
				
			case "size" :
				s.append(stk.size() + "\n");
				break;
				
			case "empty" :
				s.append(stk.empty() + "\n");
				break;
			
			case "top" :
				s.append(stk.top() + "\n");
				break;
			}
		}
		
		System.out.println(s.toString());
		
	}

}
