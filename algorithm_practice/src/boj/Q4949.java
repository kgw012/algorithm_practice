package boj;

import java.util.Scanner;
import java.util.Stack;

public class Q4949 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder ansB = new StringBuilder();
		
		while(true) {
			String s = sc.nextLine();
			if(s.equals(".")) break;
			Stack<Character> stk = new Stack<>();
			
			String ans = "yes";
			loop:
			for(int i=0; i<s.length(); i++) {
				switch(s.charAt(i)) {
				case '(' :
					stk.push('(');
					break;
				
				case '[' :
					stk.push('[');
					break;
					
				case ')' :
					if(stk.size() == 0) {
						ans = "no";
						break loop;
					}
					if(stk.peek() == '(') {
						stk.pop();
						break;
					}
					ans = "no";
					break loop;
					
				case ']' :
					if(stk.size() == 0) {
						ans = "no";
						break loop;
					}
					if(stk.peek() == '[') {
						stk.pop();
						break;
					}
					ans = "no";
					break loop;
					
				default :
					break;
				}
			}
			if(stk.size() != 0)
				ans = "no";
			ansB.append(ans+"\n");
		}
		System.out.println(ansB);
		sc.close();
	}

}
