package boj;

import java.util.Scanner;
import java.util.Stack;

public class Q1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력배열 만들기
		int n = sc.nextInt();
		int[] inputArr = new int[n];
		
		for(int i=0; i<n; i++) {
			inputArr[i] = sc.nextInt();
		}
		
		//solution
		Stack<Integer> stk = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int i=0;
		int num=0;
		loop:
		while(true) {
			if(!stk.isEmpty() && stk.peek() == inputArr[i]) {
				stk.pop();
				sb.append("-\n");
				i++;
			}
			else {
				stk.push(++num);
				sb.append("+\n");
			}
			if(i>=n) break loop;
			if(num>n) {
				sb.delete(0, sb.length());
				sb.append("NO");
				break loop;
			}
		}
		
		//결과출력
		System.out.println(sb);
	}

}