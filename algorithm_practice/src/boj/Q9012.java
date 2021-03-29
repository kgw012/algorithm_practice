package boj;

import java.util.Scanner;
import java.util.Stack;

public class Q9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder ansB = new StringBuilder();
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			Stack<Character> stk = new Stack<>();
			String s = sc.next();
			char[] ch = s.toCharArray();
			String ans = "YES";
			
			loop:
			for(int j=0; j<ch.length; j++) {
				if(ch[j] == '(')
					stk.push('(');
				else {
					if(stk.size() == 0) {
						ans = "NO";
						break loop;
					}
					else
						stk.pop();
				}
			}
			if(stk.size() != 0)
				ans = "NO";
			ansB.append(ans + "\n");
		}
		System.out.println(ansB);
		
	}

}
